package c.a.s;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
				//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=jumbo1-btn-ft");
		driver.findElement(By.xpath("//input[contains(@name,'UserFirstName')]")).sendKeys("Sangamesh");
		driver.findElement(By.cssSelector("input[name='UserLastName']")).sendKeys("gudi");
		driver.findElement(By.xpath("//input[contains(@name,'UserEmail')]")).sendKeys("Sangameshg08@gmail.com");
		Select sel = new Select(driver.findElement(By.xpath("//select[contains(@name,'UserTitle')]")));
		
		sel.selectByIndex(2);
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[contains(@class,'checkbox-ui']))")).click();
		driver.findElement(By.xpath("//div[@class='field'][1]/div[1]")).click();
		Thread.sleep(3000);
        driver.quit();	
        
       
		
	}
}
