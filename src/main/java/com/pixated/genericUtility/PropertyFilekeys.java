package com.pixated.genericUtility;

public enum PropertyFilekeys {
	BROWSER("browser"),URL("url"),EMAIL("email"),PSW("psw"),TIMEOUT("timeout");
	private String keys;
	
	PropertyFilekeys(String keys){
		this.keys=keys;
	}
	public String convertToString() {
		return keys.toString();
		
	}
	
	
	

}
