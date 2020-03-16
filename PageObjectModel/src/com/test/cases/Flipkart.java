package com.test.cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.testcases.Login;
import com.flipkart.testcases.Logout;
import com.flipkart.testcases.Procedure;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https:www.Flipkart.com");
		Login l=new Login(driver);
		Thread.sleep(5000);
		l.typeNum("8464011545");
	    l.typePass("@ruN12345");
		l.clickOnLogin();
		Thread.sleep(5000);
	
		Procedure p=new Procedure(driver);
		p.search("Mi Mobiles");
		p.click();
		p.select();//Searching the Product
		p.cart();//Clicking on the Product
		Thread.sleep(5000);
		Logout o=new Logout(driver);
		o.select1();
		Thread.sleep(5000);
		o.logout();
		driver.quit();
		
	}

}
