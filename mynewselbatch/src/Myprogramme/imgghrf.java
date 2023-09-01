package Myprogramme;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class imgghrf {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./myfiles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		System.out.println("the print of amazon : "+count);
		for (WebElement we : links)
		{
			String t=we.getText();
			System.out.println(t);
			
		}
		driver.get("https://www.flipkart.com/");
		List<WebElement> links1 = driver.findElements(By.xpath("//img"));
		int counts = links1.size();
		System.out.println("the print of flipkard : "+counts);
		
		for (WebElement we : links1)
		{
			String t=we.getText();
			System.out.println(t);
		


	}
		
		System.out.println("the print of amazon : "+counts);
		System.out.println("the print of amazon : "+count);

}}
