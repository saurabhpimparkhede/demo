package com.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.base.Base_Class;
import com.pages.LoginPage;

   public class LoginTest extends Base_Class {
	   LoginPage lp=null;
	@BeforeSuite
	public void setup() throws Exception {
		initialization();
		reportInit();
		lp = new LoginPage(driver);
	}
	@Test
	public void test01() {
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
}
	@Test
	public void test02() {
		lp.LoginToApplication("kiran@gmail.com", "123456");
		
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	
	@Test
	public void test03() {
		throw new SkipException("skippin testcase");
	}
   }

