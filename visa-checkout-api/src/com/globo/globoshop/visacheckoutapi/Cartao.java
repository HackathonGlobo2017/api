package com.globo.globoshop.visacheckoutapi;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cartao {

	private int id;
	
	public Cartao() {
		
	}

	public Cartao(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
