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
		int num=Integer.parseInt(s);
		if (num<0)
			throw new IllegalArgumentException("Negatives Not Allowed") ;
		else if(num>1000)
			return 0;
		else
		return num;
	}

}
