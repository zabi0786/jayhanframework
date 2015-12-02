package com.jayhanautomation.Jayhanframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SignInPage {

	public static void Emailtxt(WebDriver driver, String s) {
		
		WebElement Emailtxt=driver.findElement(By.id("email"));
		  Emailtxt.clear();
		  Emailtxt.sendKeys(s);
		
	}

	public static void Passwordtxt(WebDriver driver, String s) {
		WebElement Passwordtxt=driver.findElement(By.id("password"));
		  Passwordtxt.clear();
		  Passwordtxt.sendKeys("S1mil@re");
		
	}

	public static void ClickSignin(WebDriver driver) {
		WebElement ClickSignIn=driver.findElement(By.xpath(".//*[@id='loginData']/div[3]/div/div/div[1]/button"));
		  ClickSignIn.click();
		
	}

	public static void ClickProfile(WebDriver driver) {
		WebElement Profilename= driver.findElement(By.id("dice-customer-name"));
		  Profilename.click();
		
	}

	public static void SignOut(WebDriver driver) {
		WebElement Signout=driver.findElement(By.xpath(".//*[@id='smart-toggle']/li[3]/form/button"));
		  Signout.click();
		
	}

	public static void Verifytxt(WebDriver driver) {
		Assert.assertEquals("Sign In", driver.findElement(By.xpath("//button[@type='submit']")).getText());
		
	}

	public static void Searchtxt(WebDriver driver, String s) {
		WebElement Searchtxt= driver.findElement(By.id("job"));
		  Searchtxt.sendKeys("selenium");
		
	}

	public static void Submitbutton(WebDriver driver) {
		WebElement Submitbutton=driver.findElement(By.xpath(".//*[@id='searchJob']/div/div[3]/input"));
		  Submitbutton.click();
		
	}

}
