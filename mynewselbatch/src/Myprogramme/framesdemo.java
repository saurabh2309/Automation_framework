package Myprogramme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./myfiles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/sande/Desktop/mainpage.html");
		driver.findElement(By.xpath("//input[@id='a1']")).sendKeys("admin");
		
		Thread.sleep(2000);
		WebElement frame = driver.findElement( By.tagName("iframe"));
		driver.switchTo().frame(0);
		driver.switchTo().frame("f1");
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='p1']")).sendKeys("saurabh");
	}

}
