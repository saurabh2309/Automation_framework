package Myprogramme;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class trytheweb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./myfiles/chromedriver.exe");
	      ChromeDriver driver =new ChromeDriver();
	      driver.get("https://www.Amazon.com/");
	      String title =driver.getTitle();
	      System.out.println("title");
	      String Url =driver.getCurrentUrl();
	      System.out.println("url");
	      String psource=driver.getPageSource();
	      System.out.println("pagesource");
	      driver.manage().window();
	      WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
	     ele.isDisplayed();
	     ele.isEnabled();
	     ele.isSelected();
	     //driver.findElement(By.xpath("//input[id='twotabsearchtextbox')")).click();
	     ele.sendKeys("smart watch");
	   //  driver.findElement(By.id("nav-search-submit-text")).click();
	    // driver.findElement(By.linkText("Wearable Technology")).click();
	   
	     
	     ele.getAttribute("id");
	     String atti=ele.getAttribute("class");
	     String tag=ele.getTagName();
	    String txt= ele.getText();
	    System.out.println("The attribute name is:  "+atti);
	    System.out.println("The Tagname name is:  "+tag);
	    System.out.println("The text name is:  "+txt);
	    
	    Point locn = ele.getLocation();
	    System.out.println("the location is :"+locn);
	   int x = locn.getX();
	   int y = locn.getY();
	   System.out.println(x);
	   System.out.println(y);
	   
	  String colorcss=ele.getCssValue("color");
	  System.out.println("the color css is: "+colorcss);
	  
	  int h = ele.getSize().getHeight();
	  int w = ele.getSize().getWidth();
	  
	  driver.navigate().to("https://www.youtube.com/");
	  //driver.findElement(By.xpath("//input[id='search'])");
	  ele.sendKeys("khani suno");
	  driver.findElement(By.id("search-icon-legacy")).click();
	  Thread.sleep(2000);
	  driver.navigate().to("https://www.Amazon.com/");
	  driver.navigate().back();
	  driver.navigate().forward();
	  driver.navigate().refresh();
	  Dimension d=new Dimension(200,600);
	  driver.manage().window().setSize(d);
	  
	  
	 
	   
	    
	    
	     
	     
	      
	      
	      
	    
	     
	     
	}

}
