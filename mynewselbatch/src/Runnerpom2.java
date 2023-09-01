import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom_script.pom2;

public class Runnerpom2 {
	@Test
	public void click() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./myfiles/geckodriver.exe");
		 WebDriver driver =new FirefoxDriver();
		 driver.get("https://www.facebook.com/");
		 pom2 p2=new pom2(driver);
		 p2.username(("Saurabh.shrivastava1995@gmail.com"));
		 Thread.sleep(2000);
		 p2.password("Saurabh230995");
		 Thread.sleep(2000);
		 p2.clicklogin();
	}

}
