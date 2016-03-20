package br.com.model;

import java.io.Serializable;

public class ImagemDTO implements Serializable{

    
    /**
	 * 
	 */
	private static final long serialVersionUID = 6862964523595040195L;

	private String protocolo;
    
    private String url;
    
    public ImagemDTO(String protocolo, String url){
        this.protocolo = protocolo;
        this.url = url;
    }

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

    
}
