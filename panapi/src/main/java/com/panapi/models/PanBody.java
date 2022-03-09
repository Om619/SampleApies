package com.panapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PanBody {

	private String docNumber;

	public String getDocNumber() {
		return docNumber;
	}

	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}

	public PanBody(@JsonProperty("docNumber") String docNumber) {
		super();
		this.docNumber = docNumber;
	}

	public PanBody() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PanBody [docNumber=" + docNumber + "]";
	}
	
}
