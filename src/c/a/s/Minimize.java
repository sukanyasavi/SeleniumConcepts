package c.a.s;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.facebook.com");
		Thread.sleep(3000);
	 Dimension size = cd.manage().window().getSize();
	 System.out.println(size.width);
	 System.out.println(size.height);
	 Dimension nsize = new Dimension((size.width/2),(size.height/2));
	 Thread.sleep(3000);
	 cd.manage().window().setSize(nsize);
	 System.out.println(nsize.width);
	 System.out.println(nsize.height);
	 Thread.sleep(3000);
	 cd.quit();
	}

}
