package com.ntt.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://account.magento.com/customer/account/login/");
		LoginPage l = new LoginPage(driver);
	  l.setUername("sukanyasavi234@gmail.com");
	  l.setPassword("Jaiganesh@123");
 l.clickLogin();		
		

	}

}
