package com.binary.beasts;

public class StringCalculator {
	private String delimeter=",|\n";
	public int add(String s){
		if(s.length()==0)
		  return 0;
		String str[]=s.split(delimeter);
		int sum=0;
		for(String s1:str){
			sum+=stringToInteger(s1);
		}
		
			return sum;
	}
	public int stringToInteger(String s){
		return Integer.parseInt(s);
	}

}
