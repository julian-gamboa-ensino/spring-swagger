package com.factory.demo.models;

public class ResponseTransfer {
    
	private String text;
	
	public ResponseTransfer(String string) {
		this.setText(string);		
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
    
}
