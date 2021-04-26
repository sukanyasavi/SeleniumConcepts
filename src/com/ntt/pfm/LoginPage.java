package com.ntt.pfm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	WebDriver driver;
	@FindBy(id="email")
	WebElement username;
	@FindBy(name="login[password]")
	WebElement password;
	@FindBy(id="send2")
	WebElement login;
	
	public void LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setUername(String strname)
	{
		username.sendKeys(strname);
		PageFactory.initElements(driver, this);
	}
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
		
	}
	public void clickLogin()
	{
		login.click();
	}
	
}
