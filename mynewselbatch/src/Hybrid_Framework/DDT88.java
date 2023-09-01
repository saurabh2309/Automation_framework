 import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DDT88 {



	System.setProperty("webdriver.gecko.driver","./myfiles/geckodriver.exe");
	
		WebDriver driver= new FirefoxDriver();
		 
		
		 driver.get("https://www.Amazon.com");
		 FileInputStream fis=new FileInputStream("./exel/Book1.xlsx");
		 Workbook book=WorkbookFactory.create(fis);
		 Sheet sheet=book.getSheet("Sheet1");
		 List<WebElement> links = driver.findElements(By.xpath("//a"));
		 for(int i=0;i<links.size();i++)
		 {
			 Row row=sheet.createRow(i);
			 Cell cell=row.createCell(0);
		 cell.setCellValue(links.get(i).getAttribute("href"));
		 }	
		 FileOutputStream fio=new FileOutputStream("./excel/Book1.xlsx");
		 book.write(fio);
}}
		

