package DDDDt;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDt {
	
	
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis =new FileInputStream("./exel/Book1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String value = cell.toString();
		System.out.println(value);
		System.out.println("HELLO");
		
		
	}
	
	
	
	
	
	
	
	
	
	

	

}
