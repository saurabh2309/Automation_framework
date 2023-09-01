package Myprogramme;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swapo {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./myfiles/chromedriver.exe");
	      ChromeDriver driver =new ChromeDriver();
	      driver.get("file:///C:/Users/sande/Desktop/swapping3.html");
	      Thread.sleep(2000);
	      WebElement ele1 = driver.findElement(By.xpath("//input[@id='a1']"));
	      WebElement ele2 = driver.findElement(By.xpath("//input[@id='a2']"));
	      WebElement ele3 = driver.findElement(By.xpath("//input[@id='a3']"));
	      driver.navigate().refresh();
	      
	      ele1.sendKeys(Keys.CONTROL+"ax");
	      ele3.sendKeys(Keys.CONTROL+"v");
	      ele2.sendKeys(Keys.CONTROL+"ax");
	      ele1.sendKeys(Keys.CONTROL+"v");
	      ele3.sendKeys(Keys.CONTROL+"ax");
	      ele2.sendKeys(Keys.CONTROL+"v");
	      
	      
	      
	      
		
		
		
		
		
		

	}

}
