package Myprogramme;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class counts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./myfiles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("file:///C:/Users/sande/Desktop/check.html");
		  List<WebElement> checks = driver.findElements(By.xpath("//input"));
		int counts = checks.size();
		System.out.println(counts);
		for(int i=0;i<counts;i++)
		{
	       WebElement we=checks.get(i);
	       we.click();
		}
		for(int i=counts-1;i>=0;i--)
		{
	       WebElement we=checks.get(i);
	       we.click();
		}
	}
}
		
		
		
	
			
			

			
		
	
	
		
		
		


