package c.a.s;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		//cd.get("https://www.google.com");
		//cd.get("http://demo.guru99.com/test/facebook.html");
		//cd.findElement(By.cssSelector("input[name='email']")).sendKeys("suku@gmaummbsx");
//
//		cd.findElement(By.cssSelector("input#email")).sendKeys("suku@gmaummbsx");
	//cd.findElement(By.cssSelector("input.inputtext")).sendKeys("wwec");
//		cd.findElement(By.cssSelector("input.inputtext[name='email']")).sendKeys("adcsd");
//		cd.findElement(By.cssSelector("input[title*='ear']")).sendKeys("dcndc");
//
//		cd.findElement(By.cssSelector("input[title^='Se']")).sendKeys("dcndc");
//		cd.findElement(By.cssSelector("input[title$='ch']")).sendKeys("dcndc");

		//cd.get("https://www.google.com");
		//cd.get("http://demo.guru99.com/test/newtours/register.php");
		//cd.findElementByPartialLinkText("Create New").click();
//		WebElement search = cd.findElement(By.id("gh-ac"));
//		search.sendKeys("oneplus");
//		cd.findElement(By.cssSelector("#gh-btn")).click();
//		JavascriptExecutor je=(JavascriptExecutor) cd;
//		je.executeScript("window.scrollBy(0,30000)");
		
//		WebElement email = cd.findElement(By.xpath("//input[@id=\'loginForm\']/div/div[1]/div/label/input"));
//		email.sendKeys("sukanyasavi234@gmail.com");
//		WebElement pass = cd.findElement(By.name("password"));
//		pass.sendKeys("1234");
//		
//		Thread.sleep(5000);
//		cd.close();
//		Select drop = new Select(cd.findElementByName("country"));
//	
//		drop.selectByIndex(5);;
		cd.get("https://account.magento.com/customer/account/login/");
		cd.findElement(By.id("email")).sendKeys("sukanyasavi234@gmail.com");
		cd.findElement(By.name("login[password]")).sendKeys("Jaiganesh@123");
		cd.findElement(By.id("send2")).click();
		
	Thread.sleep(5000);
	cd.close();
		
		
	}

}
