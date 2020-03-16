package com.flipkart.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	By email=By.xpath("//form/div/input[@type=\"text\"]");
	By password=By.xpath("//form/div/input[@type=\"password\"]");
	By Login=By.xpath("//form/div/button[@type=\"submit\"]/parent::div[@class='_1avdGP']");
  public Login(WebDriver driver)
   {
	   this.driver=driver;
   }
	
	public void typeNum(String em) {
	driver.findElement(email).sendKeys(em);
		
	}

	public void typePass(String pass) {
	driver.findElement(password).sendKeys(pass);
		
	}
	public void clickOnLogin()
	{
	driver.findElement(Login).click();
		
	}


}
