import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./myfiles/chromedriver.exe");
		 ChromeDriver driver =new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get(null);
		 driver.findElement(By.name("email")).sendKeys("saurabh");
		 driver.findElement(By.name("pass")).sendKeys("saurabh23");
		 driver.findElement(By.xpath(null)
		 driver.findElement(By.name("email")).sendKeys("saurabh");
		 
	}

}
