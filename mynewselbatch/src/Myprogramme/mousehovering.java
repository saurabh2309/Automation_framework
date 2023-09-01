package Myprogramme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mousehovering {
	
	System.setProperty("webdriver.chrome.driver","./myfiles/chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in");
}


