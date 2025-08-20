package com.QA.TestCases;

import org.testng.annotations.Test;

import com.QA.Pages.LoginPage;
import com.QA.TestBase.TestBase;

public class logintest extends TestBase {
  @Test
  public void login() 
  {
	  setup();
	  driver.get("http://www.demo.guru99.com/V4/");
	  driver.manage().window().maximize();
	  driver.(LoginPage.UserName).
	  }
}
