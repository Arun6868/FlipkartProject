package com.flipkart.testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Procedure {
	WebDriver driver;
    By search=By.className("LM6RPg");
   By ck=By.className("vh79eN");
   By select=By.className("_3wU53n");
  By cart=By.xpath("//button[text()='ADD TO CART']");
	 public Procedure(WebDriver driver)
	   {
		   this.driver=driver;
	   }

	public void search(String st) {
		
		driver.findElement(search).sendKeys(st);
		
	}

	public void click() {
		driver.findElement(ck).click();
		
	}

	public void select() {
		driver.findElement(select).click();
		
	}

	public void cart() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,50);
		Set<String> set= driver.getWindowHandles();                                                                                                          
 
		for(String s:set)
		{
			driver.switchTo().window(s);
		}
		Thread.sleep(5000);

		WebElement aa=wait.until(ExpectedConditions.visibilityOfElementLocated(cart));
		aa.click();
			
			Thread.sleep(5000);


	
		
	}

}
