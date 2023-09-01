package Myprogramme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class filltheform {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./myfiles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement( By.id("firstName")).sendKeys("Saurabh");
		driver.findElement( By.id("lastName")).sendKeys("shrivastav");
		driver.findElement( By.id("userEmail")).sendKeys("sa3456");
		driver.findElement(By.xpath("//label[@for=\"gender-radio-1\"]")).click();
		driver.findElement( By.id("userNumber")).sendKeys("873278655");
		driver.findElement( By.id("dateOfBirthInput")).sendKeys("23-09-1995");
		//driver.findElement(By.xpath("driver.findElement(By.xpath(\"//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']\"))']")).sendKeys("jdhh");
		driver.findElement(By.xpath("(//label[normalize-space()='Sports'])[1]"));
		
		

	}

}
