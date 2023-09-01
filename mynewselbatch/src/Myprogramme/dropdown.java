package Myprogramme;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./myfiles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/sande/Desktop/dropdown.html");
		WebElement ele = driver.findElement(By.id("country"));
	     Select s = new  Select(ele);
	     s.selectByValue("k");
	     s.deselectByIndex(1);
	     s.selectByVisibleText("Russia");
	     s.deselectAll();
	     Thread.sleep(2000);
 
		

	}

}
