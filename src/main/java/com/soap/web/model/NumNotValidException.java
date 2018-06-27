package com.soap.web.model;

public class NumNotValidException  extends Exception{
	private ErrorMessage fault;
	public NumNotValidException(String message,  ErrorMessage fault) {
		super(message);
		this.fault = fault;
	}
	public 	ErrorMessage getFault(){
			return this.fault;
	}
	}
