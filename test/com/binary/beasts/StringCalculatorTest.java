package com.binary.beasts;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

	private StringCalculator sc;
	@Before
	public void initialize(){
		sc=new StringCalculator();
	}
	@Test
	public void emptyString(){
		assertEquals(0, sc.add(""));
	}
	@Test
	public void nonEmptyString(){
		assertEquals(1,sc.add("1"));
		assertEquals(11,sc.add("11"));
		assertEquals(11,sc.add("5,6"));
	}
	@Test 
	public void unknownAmoutOfNumbers(){
		assertEquals(100, sc.add("10,20,30,40"));
	}

}
