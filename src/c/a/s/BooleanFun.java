package c.a.s;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooleanFun {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.cleartrip.com/");
	cd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//Alert a = cd.switchTo().alert();
	//a.dismiss();
//		WebElement round = cd.findElement(By.id("RoundTrip"));
//		if(round.isSelected()==false)
//		{
//			Thread.sleep(3000);
//			round.click();
//		}
//	System.out.println(round.isSelected());
	
	
	WebElement date = cd.findElement(By.id("FromDate"));
	if(date.isDisplayed()==true)
	{
		date.sendKeys("Fri, 4 oct,2019");
		
	}
	System.out.println(date.isDisplayed());
	
	//cd.close();
	
	

	}

}
