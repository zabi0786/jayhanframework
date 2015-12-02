package com.jayhanautomation.Jayhanframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WebUtil {

	public static SignInPage gotosigninpage(WebDriver driver) {
		
		driver.get("https://www.dice.com/dashboard/logout");
		
		return PageFactory.initElements(driver,SignInPage.class);
	}

}
