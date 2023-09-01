package generic;



import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic_photo {
System.setProperty("webdriver.chrome.driver","./myfiles/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
}


	public static void getphoto(WebDriver driver)
	{
	String photo="./photos/";
	Date d=new Date();
	String d1=d.toString();
	String d2=d1.replaceAll(":","-");
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dst=new File(photo+d2+".jpeg");
	FileHandler.copy(src, dst);
	}
}