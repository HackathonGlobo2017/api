package com.globo.globoshop.visacheckoutapi.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pagamento {
	
	private String status;

	public String getStatus() {
		return status;
	}

	public Pagamento setStatus(String status) {
		this.status = status;
		return this;
	}
	
	

}
