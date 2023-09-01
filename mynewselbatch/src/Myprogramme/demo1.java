package Myprogramme;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo1 {

	public static void main(String[] args) {
		
		
	String key="webdriver.chrome.driver";
	String value="./myfiles/chromedriver.exe";
	System.setProperty("webdriver.chrome.driver","./myfiles/chromedriver.exe");
      ChromeDriver driver =new ChromeDriver();
      driver.get("http://www.youtube.com");
      driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Ram siya Ram");
    //  driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
      //driver.findElementByXPath("//*[@id=\"video-title\"]/yt-formatted-string)").click();
	     

	
     
      
     
	}
}
