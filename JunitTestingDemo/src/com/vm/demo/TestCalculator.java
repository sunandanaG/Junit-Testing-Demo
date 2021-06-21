package com.vm.demo;

import junit.framework.TestCase;


public class TestCalculator extends TestCase 
{
  public void testadd()
  {
	  int expected=30;
	  int actual=Calculator.add(10,20);
	  assertEquals(expected,actual);
  }

}
