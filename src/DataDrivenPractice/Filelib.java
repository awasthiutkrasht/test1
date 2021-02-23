package DataDrivenPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Filelib {
	
	public String getCellData(String path,String Sheet, int row ,int cell) throws Throwable {
		
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(Sheet).getRow(row).getCell(cell).toString();
		return value;
		
	}
	 public int getRowCount(String path, String Sheet) throws Throwable {
		 
		 FileInputStream fis = new FileInputStream(path);
		 Workbook wb = WorkbookFactory.create(fis);
		int rc = wb.getSheet(Sheet).getLastRowNum();
		return rc;	 
	 }
	 public void setCellValue(String path,String Sheet, int row ,int cell, String value) throws Throwable {
		 
		 FileInputStream fis = new FileInputStream(path);
		 Workbook wb = WorkbookFactory.create(fis);
		 wb.getSheet(Sheet).getRow(row).createCell(cell);
		 
		 FileOutputStream fos = new FileOutputStream(path);
		 wb.write(fos);
		 System.out.println("written");
		 
	 }
	
}
