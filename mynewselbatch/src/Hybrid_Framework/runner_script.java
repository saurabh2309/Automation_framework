package Hybrid_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pom_script.pom2;

public class runner_script {
	System.setProperty("webdriver.gecko.driver","./myfiles/geckodriver.exe");
	 WebDriver driver =new FirefoxDriver();
	 driver.get("https://www.facebook.com/");
	 pom_script p2=new pom_script(driver);
	 pom_script.username(("803529441"));
	 Thread.sleep(2000);
	 pom_script.password("bawabawabawa");
	 Thread.sleep(2000);
	 pom_script.clicklogin();
}


