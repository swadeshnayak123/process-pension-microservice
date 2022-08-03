package com.processPensionMicroservice.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@EqualsAndHashCode
public class ProcessPensionResponse {

	private int pensionStatusCode;

	public int getPensionStatusCode() {
		return pensionStatusCode;
	}

	public void setPensionStatusCode(int pensionStatusCode) {
		this.pensionStatusCode = pensionStatusCode;
	}

	public ProcessPensionResponse(int pensionStatusCode) {
		super();
		this.pensionStatusCode = pensionStatusCode;
	}

	public ProcessPensionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
