package com.jayhanautomation.Jayhanframework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GmailSignin {
	
	WebDriver driver = new FirefoxDriver();
	
	@Test
	public void gmaillogin() {
		
//		1.Go to Gmail website
		driver.get("https://www.gmail.com");
		
		
//		2.Fill In Username
		WebElement UsernameTextbox=driver.findElement(By.id("Email"));
		UsernameTextbox.clear();
		UsernameTextbox.sendKeys("jehanaurangzeb@gmail.com");
		
		
//		2.1 Click NEXT
		driver.findElement(By.id("next")).click();
		
		
//		
////		3.Fill in Password
		WebElement PasswordTxtbox=driver.findElement(By.id("Passwd"));
		PasswordTxtbox.clear();
		PasswordTxtbox.sendKeys("S1mil@re");
//				
////		4.Click Singin
		driver.findElement(By.id("signIn")).click();
//		
////		5.Verify User did sign in.
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Inbox")));
		Assert.assertTrue("Inbox should exist",driver.findElements(By.partialLinkText("Inbox")).size()>0);
		

////		6.Signout
		WebElement profilebutton= driver.findElement(By.cssSelector(".gb_Ka.gbii"));
		profilebutton.click();
		WebElement Signoutlink= driver.findElement(By.id("gb_71"));
		Signoutlink.click();
////		7.Verfird user did signout
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signIn")));
		Assert.assertTrue("signIn should exist",driver.findElements(By.id("signIn")).size()>0);
		 
	}
	
	@After
	public void teardown(){
		driver.quit();
		
	}

}
