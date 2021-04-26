package c.a.s;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver cd = new ChromeDriver();
		
		cd.get("file:///E:/Images/table4.html");
		List<WebElement> row = cd.findElements(By.xpath("//table[@id='first']/tbody/tr"));
		int size = row.size();
        System.out.println(size);
        int sum=0;
        for(int i=2;i<=size;i++)
        {
        	WebElement col = cd.findElement(By.xpath("//table[@id='first']/tbody/tr["+i+"]/td[4]"));
        	String sal=col.getText();
        	//sal.replace("$", ""),replace(" ","");
        	
//       String repl=	sal.replace("$", "");
//repl=	sal.replace(" ", "");
        	int salary=Integer.parseInt(sal);
        	sum=sum+salary;
        	System.out.println(sum);
        }
        	int avg=(sum/(row.size()-1));
        	System.out.println(avg);
        	cd.quit();
        	
        	
        	
        	
        }
		
}


