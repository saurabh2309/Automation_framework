import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class DTT43 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./myfiles/chromedriver.exe");
		 ChromeDriver driver =new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
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
		 

	}

}
