package Myprogramme;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./myfiles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.id("day"));
		Select s= new Select(ele);
		List<WebElement> opt = s.getOptions();
		int count = opt.size();
		System.out.println(count);
		for (WebElement we : opt) {
			System.out.println(we.getText());
			driver.close();
			
		}
		
		
		System.out.println("total options are "+count);
		System.out.println("program khatam hua ");
		
		
		
		
		
	
		
	}
}


