package Myprogramme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Kholoxpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./myfiles/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
	      driver.get("http://www.youtube.com");
	      driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Ram siya Ram");
	      driver.findElement(By.xpath("//button[@id='search-icon-legacy'])")).click();
	     
	     
		
		
		
		
		
		

	}

}
