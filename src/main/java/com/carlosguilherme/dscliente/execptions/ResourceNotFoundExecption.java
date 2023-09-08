package com.carlosguilherme.dscliente.execptions;

public class ResourceNotFoundExecption extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundExecption(String msn) {
		super(msn);
	}

}
