package c.a.s;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://demo.guru99.com/test/delete_customer.php");
		cd.findElement(By.name("cusid")).sendKeys("234");
		cd.findElement(By.name("submit")).click();
		Alert a = cd.switchTo().alert();
		System.out.println(a.getText());
		//String alertMessage= cd.switchTo().alert().getText();
		//System.out.println(alertMessage);
		Thread.sleep(5000);
		a.accept();
		cd.quit();

	}

}
