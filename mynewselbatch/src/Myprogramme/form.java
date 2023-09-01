package Myprogramme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class form {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./myfiles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.id("box1"));
		WebElement dst = driver.findElement(By.id("box101"));
		WebElement src1 = driver.findElement(By.id("box3"));
		WebElement dst1 = driver.findElement(By.id("box103"));
		WebElement src2 = driver.findElement(By.id("box4"));
		WebElement dst2 = driver.findElement(By.id("box104"));
		WebElement src3 = driver.findElement(By.id("box5"));
		WebElement dst3 = driver.findElement(By.id("box105"));
		WebElement src4 = driver.findElement(By.id("box2"));
		WebElement dst4 = driver.findElement(By.id("box102"));
		WebElement src5 = driver.findElement(By.id("box7"));
		WebElement dst5 = driver.findElement(By.id("box107"));
		WebElement src6 = driver.findElement(By.id("box6"));
		WebElement dst6 = driver.findElement(By.id("box106"));
		WebElement src7 = driver.findElement(By.id("box7"));
		WebElement dst7 = driver.findElement(By.id("box107"));
		Actions act =new Actions(driver);
		act.dragAndDrop(src, dst).perform();
		act.dragAndDrop(src1, dst1).perform();
		act.dragAndDrop(src2, dst2).perform();
		act.dragAndDrop(src3, dst3).perform();
		act.dragAndDrop(src4, dst4).perform();
		act.dragAndDrop(src5, dst5).perform();
		act.dragAndDrop(src6, dst6).perform();


	}

	}


