package Myprogramme;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetPageSource;

public class sele6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./myfiles/chromedriver.exe");
	      ChromeDriver driver =new ChromeDriver();
	      driver.get("http://www.facebook.com");
	      Thread.sleep(2000);
	      String title=driver.getTitle();
	      System.out.println(title);
	      String url=driver.getCurrentUrl();
	      System.out.println(url);
	      String src=driver.getPageSource();
	      System.out.println(src);
	     // driver.findElementByLinkText("Forgotten password?").click();
	      

	}

}
