package com.pixated.OjectReposaty;

import java.util.Random;

public class JavaLibrary {
	public  Object stringToDataType(String s,String Stratergy) {
		Object convertedData = null;
		if(Stratergy.equals("int")) {
			convertedData=Integer.parseInt(s);
			
		}
		else if (Stratergy.equals("long")) {
			convertedData=Long.parseLong(s);
			

		}
		return convertedData;
		
	}
public int getRandomNumber(int limit) {
	int randomNumber=new Random().nextInt(limit);
	return randomNumber;
	
}


}
