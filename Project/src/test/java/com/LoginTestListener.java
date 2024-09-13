package com;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utill.Base;

public class LoginTestListener implements ITestListener {

	Base base = new Base();
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	static int count = 0;
	@Override
	public void onTestFailure(ITestResult result) {
	
		base.screenShot(result.getClass().getName()+"_"+result.getName()+"_"+count);
		count++;
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
