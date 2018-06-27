package com.soap.web.model;

public class ErrorMessage {
	private String message;
	private String description;
	private int code;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "ErrorMessage [message=" + message + ", description=" + description + ", code=" + code + "]";
	}

}
