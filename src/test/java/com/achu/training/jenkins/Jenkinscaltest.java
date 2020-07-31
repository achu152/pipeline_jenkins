package com.achu.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class Jenkinscaltest {

	@Test
	public void addTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(11,myCalc.addnumbers(5,5));
	}
	
    @Test
	public void subtractTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(5,myCalc.subtractnumbers(10,5));
	}

}
