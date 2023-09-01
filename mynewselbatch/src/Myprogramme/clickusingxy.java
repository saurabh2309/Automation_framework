package Myprogramme;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickusingxy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./myfiles/chromedriver.exe");
	      ChromeDriver driver =new ChromeDriver();
	      driver.get("https://www.amazon.in/");
	      Thread.sleep(2000);
	      WebElement ele = driver.findElement(By.xpath("//a[text()='About Us']"));
	     Point loc = ele.getLocation();
	     System.out.println(loc);
	}

}
