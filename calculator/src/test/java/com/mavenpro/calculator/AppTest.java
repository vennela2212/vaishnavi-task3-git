package com.mavenpro.calculator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

	public class AppTest extends App {
	public void test() {
		operations p = new operations();

		int answer = p.add(9,20);

		assertEquals(29,answer);

		answer = p.sub(8, 2);
				
		assertEquals(6, answer);
				

		answer = p.mul(8, 2);

		assertEquals(16,answer);

		answer = p.div(5, 4);

		assertEquals(1, answer);
	
	}

	private void assertEquals(int i, int answer) {
		// TODO Auto-generated method stub
		
	}

}
