package Myprogramme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class acendingdrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./myfiles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.id("month"));
		TreeSet<String>t=new TreeSet<String>();
		ArrayList<String>l=new ArrayList<String>(t);
		
		Select s=new Select(ele);
		List<WebElement> opt = s.getOptions();
		
		
		
		int count = opt.size();
		System.out.println(count);
		for (WebElement we : opt) {
			{	String t1=we.getText();
			
			
		}
		
		for (String t1 : l) 
			
		{
		System.out.println(t1);
		}
	}
}
}	

