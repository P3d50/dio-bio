package br.com.p3d50.api.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.p3d50.api.dto.CertificateDTO;
import br.com.p3d50.api.service.CertificateClientService;
import br.com.p3d50.api.service.ChatGPTClientService;

@Controller
public class APIController {

	@Autowired
	CertificateClientService certificateClientService;

	@Autowired
	ChatGPTClientService chatGPTService;

	@GetMapping("/home")
	public ModelAndView getHome() {
		ModelAndView mv = new ModelAndView("home");
	
		return mv;
	}

	@PostMapping("/submit")
	public String getInfo(@RequestParam("usuario") String usuario, @RequestParam("senha") String senha,
			@RequestParam("info") String info, RedirectAttributes redirectAttributes) throws IOException {

		ResponseEntity<List<CertificateDTO>> certificatesResponse = getCerttificates(usuario, senha);
		redirectAttributes.addFlashAttribute("certificates",
				certificatesResponse.getStatusCode() == HttpStatus.OK ? certificatesResponse.getBody() : null);

		ResponseEntity<String> promptResponse = getPrompt(
				"baseado nesses certificados e informações pessoais crie uma bio sobre mim,"
				+ "foque as habilidades e não nos certificados,"
				+ " agrupe as habilidades dos certificados por area de atuação sem se repetir,"
				+ " evite ser muito formal. os certificados não são oficiais "
						+ info + certificatesResponse.toString());

		redirectAttributes.addFlashAttribute("resultado",
				promptResponse.getStatusCode() == HttpStatus.OK ? promptResponse.getBody() : null);

		return "redirect:/home";
	}

	@PostMapping("/certificates")
	public ResponseEntity<List<CertificateDTO>> getCerttificates(@RequestParam("usuario") String usuario,
			@RequestParam("senha") String senha) throws IOException {

		List<CertificateDTO> certificates = certificateClientService.downloadCertificates(usuario, senha);

		return ResponseEntity.ok(certificates);
	}

	@PostMapping("/prompt")
	public ResponseEntity<String> getPrompt(@RequestParam("prompt") String prompt) throws IOException {

		String result = chatGPTService.getPrompt(prompt);

		return ResponseEntity.ok(result);
	}
}
