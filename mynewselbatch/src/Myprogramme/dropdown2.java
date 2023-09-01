package Myprogramme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./myfiles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/sande/Desktop/dropdown2.html");
		WebElement ele = driver.findElement(By.id("country"));
		Select s=new Select(ele);
		s.selectByIndex(3);
		s.selectByValue("j");
		s.selectByVisibleText("India");
		s.deselectAll();

	}

}
