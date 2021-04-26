package c.a.s;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardEx2 
{

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		WebElement from = driver.findElement(By.id("FromTag"));
		Actions a = new Actions(driver);
		a.moveToElement(from).pause(2000).click().perform();
		a.sendKeys("tri").pause(3000).build().perform();
		for(int i=1;i<=4;i++)
		{
			a.sendKeys(Keys.ARROW_DOWN).pause(2000).perform();
			
		}
		a.sendKeys(Keys.ENTER).pause(2000).perform();
		Thread.sleep(3000);
		driver.quit();
}
}
