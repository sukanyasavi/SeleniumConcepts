package c.a.s;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver cd = new ChromeDriver();
//		cd.get("file:///E:/Images/table.html");
//		cd.findElement(By.xpath("//div[1]/input|/div[2]/input[1]")).sendKeys("hf");
//		cd.get("https://www.wellsfargo.com/");
//		//cd.findElement(By.xpath("//input[@id='userid']")).sendKeys("sukxhv");
//		cd.findElement(By.xpath("//input[@id='userid' or @id='password']")).sendKeys("efvf");
//		cd.findElement(By.xpath("//input[@id='password' or @id='xyz']")).sendKeys("dsvdvdfv");
//		//cd.findElement(By.id("btnSignon")).click();
//		cd.findElement(By.partialLinkText("Forgot")).click();
		
//		cd.get("file:///E:/Images/table1.html");
//		cd.findElement(By.xpath("//td[text()='selenium']"));
//		cd.findElement(By.xpath("//td[contains(text(),'manual')]"));//for non breakable space we use contaias method
//		cd.findElement(By.xpath(" //td[text()='selenium']/../td[2]"));//to find dependent element
//		
		//flipkart
//		cd.get("https://www.flipkart.com/search?q=Apple%20Iphone%20X%28&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
//		cd.findElement(By.xpath("//div[text()='APPLE iPhone X (Silver, 64 GB)']/../../div[2]/div[1]"));
//		cd.findElement(By.xpath("//input[name='q']")).sendKeys("Apple iPhone X");
		
//		cd.get("https://www.selenium.dev/downloads/");
//		cd.findElement(By.xpath("//td[text()='Java']/../td[6]/a")).click();
//		cd.get("https://www.facebook.com/#");
//		
//		List<WebElement> link =  cd.findElements(By.tagName("a"));
//		int n=link.size();
//	    System.out.println(n);
//	    for(int i=0;i<n;i++)
//	    {
//	    	System.out.println(link.get(i).getText());
//	    	if(link.get(i).getText().equals("Forgotten password?"))
//	    	{
//	                 
//	    	}
//	    }
		
		cd.get("https://www.facebook.com/#");
	String parent = cd.getWindowHandle();
		System.out.println(parent);
	    cd.findElement(By.partialLinkText("Forgotten")).click();   
	    Set<String> handles = cd.getWindowHandles();
	    for(String handle:handles)
	    {
	    	System.out.println(handle);
	    	if(!handle.equals(parent))
	    	{
	    cd.switchTo().window(handle);
	    cd.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("34535");
	   
	    cd.close();
	    	}
	    
	    }
	    cd.switchTo().window(parent);
	    cd.findElement(By.id("email")).sendKeys("sdmnbdb");
	    cd.quit();
	    
	    
	   // String parent = cd.getWindowHandle();
	    
//	    Set<String> allIds = cd.getWindowHandles();System.out.println(allIds);
//	    for(String i:allIds)
//	    {
//	    	cd.switchTo().window(i);
//	    }  
//	    cd.findElement(By.linkText("Child tab")).click();
////		cd.get("file:///E:/Images/Parent.html");
////		cd.findElement(By.linkText("Parent tab")).click();
////		Set<String> allIds = cd.getWindowHandles();
////		ArrayList<String> a=new ArrayList<String>(allIds);
////		cd.switchTo().window(a.get(2));
////		cd.findElement(By.linkText("Child tab")).click();
////		
//		Thread.sleep(5000);
//		cd.quit();
		
	}

}
