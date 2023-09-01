import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkardcardadd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./myfiles/chromedriver.exe");
	      ChromeDriver driver =new ChromeDriver();
	      driver.get("https://www.amazon.in/");
	      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Redmi Note 12 5G Mystique Blue 4GB RAM");
	      driver.findElement(By.id("nav-search-submit-button")).click();
	      driver.findElement(By.className("a-price-whole")).click();
	      String p_id=driver.getWindowHandle();
	      Set<String> allwh = driver.getWindowHandles();
	      allwh.remove(p_id);
	      for (String wh : allwh) {
			
		driver.switchTo().window(wh);
		driver.findElement(By.id("buy-now-button")).click();
		driver.findElement(By.id("email")).sendKeys("9340614609");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("Saurabh230995");
	      
	

}
	}}
