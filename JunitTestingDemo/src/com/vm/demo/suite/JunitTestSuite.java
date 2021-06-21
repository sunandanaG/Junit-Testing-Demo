package com.vm.demo.suite;

import junit.framework.TestResult;
import junit.framework.TestSuite;




public class JunitTestSuite 
{
	public static void main(String[] args) {


		TestSuite suite=new TestSuite(TestJunit1.class,TestJunit2.class);
		TestResult result=new TestResult();

		suite.run(result);

		System.out.println("number of test cases:"+result.runCount());
	}
}