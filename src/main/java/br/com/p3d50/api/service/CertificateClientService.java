package br.com.p3d50.api.service;

import java.io.IOException;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.p3d50.api.dto.CertificateDTO;

@Service
public class CertificateClientService {
	
	private final RestTemplate restTemplate = new RestTemplate();

    public List<CertificateDTO> downloadCertificates(String usuario, String senha) throws IOException {
        String url = "http://localhost:8081/certificates?usuario={usuario}&senha={senha}";
        ResponseEntity<List<CertificateDTO>> response = restTemplate.exchange(url, HttpMethod.POST, null,
                new ParameterizedTypeReference<List<CertificateDTO>>() {
                }, usuario, senha);
        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            throw new IOException("Erro ao chamar o endpoint dos certificados");
        }
    }
}
