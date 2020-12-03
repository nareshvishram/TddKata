package com.binary.beasts;

public class StringCalculator {
	
	public int add(String s){
		if(s.length()==0)
		  return 0;
		String str[]=s.split(",");
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
