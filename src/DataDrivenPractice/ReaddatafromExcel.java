package DataDrivenPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReaddatafromExcel {
	
	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis = new FileInputStream("./data/Book0.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(value);

	}
	

}
