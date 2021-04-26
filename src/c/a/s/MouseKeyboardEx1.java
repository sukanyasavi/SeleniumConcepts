package c.a.s;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardEx1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement search = driver.findElement(By.name("q"));
		Actions actions = new Actions(driver);
		actions.moveToElement(search).pause(3000).click().perform();
		actions.keyDown(Keys.SHIFT).sendKeys("abc for").keyUp(Keys.SHIFT).sendKeys("tech training").sendKeys(Keys.ENTER).pause(3000).perform();
        Thread.sleep(3000);
		driver.quit();

	}

}
