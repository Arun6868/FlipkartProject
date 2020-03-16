package com.flipkart.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	WebDriver driver;
	By sel1=By.className("_34Yjv1");
	By logout=By.className("_1Q5BxB");
	public Logout(WebDriver driver)
	   {
		   this.driver=driver;
	   }

	public void select1() {
		
		driver.findElement(sel1).click();
	}

	public void logout() throws InterruptedException {
	
	driver.findElement(logout).click();
		
	}

}
