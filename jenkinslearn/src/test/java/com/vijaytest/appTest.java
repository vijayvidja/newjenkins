package com.vijaytest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vijay.app;

public class appTest {
	@Test
	public void testlogin1()
	{
		app aa = new app();
		Assert.assertEquals(0,aa.userLogin("abc", "abc123"));
		
	}
	
	@Test
	public void testlogin2()
	{
		app aa = new app();
		Assert.assertEquals(0,aa.userLogin("abc", "abc@123"));
		
	}


}
