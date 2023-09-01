package Testng;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.seleniumhq.jetty9.server.Authentication.Failed;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class RunnerClass extends Generic
{
	
	@Test
	public void test1() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("avavav");
		driver.findElement(By.name("pass")).sendKeys("gg");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		//Assert.assertTrue(title.contains("hch"));
		//Assert.fail();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(title, "iygyuf");
		System.out.println("1");
		sa.assertAll();
		
		
		
	}

	
	
	
	

}
