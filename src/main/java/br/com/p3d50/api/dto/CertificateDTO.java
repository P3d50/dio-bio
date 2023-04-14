package br.com.p3d50.api.dto;


public class CertificateDTO {

	private String title;

	
	public CertificateDTO(String title) {
		this.title = title;
	}

	
	public CertificateDTO(String title, String imageUrl,String imageBase64) {
		this.title = title;
	}

	public CertificateDTO() {

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
    public String toString() {
        return "Certificado{" +
                "title='" + title + '\'' +
                '}';
    }

}
