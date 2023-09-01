package Myprogramme;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver =new ChromeDriver();
	      driver.get("http://www.youtube.com");
	     // driver.findElement(By.linkText("Like")).click();
	      Thread.sleep(2000);

	}

}
