package com.framework.testng.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.testng.IAnnotationTransformer;
import org.testng.IDataProviderListener;
import org.testng.IDataProviderMethod;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

import com.sun.org.apache.bcel.internal.generic.ReturnaddressType;

public class RetryListener implements IRetryAnalyzer,IAnnotationTransformer{


	
	int retryCount = 1;
	public boolean retry(ITestResult result) {
		if(retryCount < 3) {
			retryCount++;
			return true;
		}
		
		return false;
	}

	
	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		annotation.setRetryAnalyzer(RetryListener.class);	
	
	}
}
























