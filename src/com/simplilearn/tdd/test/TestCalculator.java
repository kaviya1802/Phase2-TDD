package com.simplilearn.tdd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.simplilearn.tdd.dev.Calculator;

class TestCalculator {

	Calculator calc;
	int op1, op2;
	int expSum, expDiff;
	
	@BeforeEach
	void setUp() throws Exception {
		calc = new Calculator();
		op1 = 15;
		op2 = 10;
		expSum = 25;
		expDiff = 5;
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		
		int sum = calc.add(15,10);
		assertEquals(expSum, sum);
	}
	
	@Test
	public void testSub() {
		int diff = calc.sub(op1, op2);
		assertEquals(expDiff, diff);
	}
	}
