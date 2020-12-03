package com.binary.beasts;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringCalculatorTest {

	private StringCalculator sc;
	@Before
	public void initialize(){
		sc=new StringCalculator();
	}
	
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
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
	@Test
	public void newLineDelimeter(){
		assertEquals(3, sc.add("1\n2"));
	}
	@Test
	public void negativeNumberHandelling(){
		thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Negatives Not Allowed");
		sc.add("-1");
		sc.add("-1,2\3");
	}
	@Test
	public void skipGreaterThanThousand(){
		assertEquals(10,sc.add("1,9\n10001"));
	}

}
