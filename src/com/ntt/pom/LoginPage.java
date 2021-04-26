package com.ntt.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{

	WebDriver driver;
	
	By username=By.id("email");
	By password=By.name("login[password]");
	By login=By.id("send2");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setUername(String strname)
	{
		driver.findElement(username).sendKeys(strname);
	}
	public void setPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void clickLogin()
	{
		driver.findElement(login).click();
	}
	
}
