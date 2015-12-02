package com.jayhanautomation.Jayhanframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DicesignIn {
	
	WebDriver driver=new FirefoxDriver();
	  
	
  @BeforeTest
  public void setup() throws Exception {

	SignInPage signinpage=WebUtil.gotosigninpage(driver);
	 
  }
  
  @Test(priority=1)
  public void signin() {
	  SignInPage.Emailtxt(driver,"jehanaurangzeb@yahoo.com");
	  
	  SignInPage.Passwordtxt(driver,"S1mil@re");
	  
	  SignInPage.ClickSignin(driver);
	  
	  SignInPage.ClickProfile(driver);
	  
	  SignInPage.SignOut(driver);
	  
	  SignInPage.Verifytxt(driver);
	  
  }
  
  @Test(priority=2)
  public void jobsearch() {
	  SignInPage.Emailtxt(driver,"jehanaurangzeb@yahoo.com");
	  
	  SignInPage.Passwordtxt(driver,"S1mil@re");
	  
	  SignInPage.ClickSignin(driver);
	  
	  SignInPage.Searchtxt(driver,"selenium");
	  
	  SignInPage.Submitbutton(driver);
	  
	  
  }
  
 @AfterTest
  public void teardown() {
	 driver.quit();
	  
  }
}
