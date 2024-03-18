package dataDrivernTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FatchDataFromExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis= new FileInputStream("E:\\java qspider\\demoApps\\src\\test\\resources\\New Microsoft Excel Worksheet.xlsx");
		
		
		Workbook workbook= WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("sheet1");
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(1);
		String name = cell.getStringCellValue();
		System.out.println(name);
		long number = (long)row.getCell(2).getNumericCellValue();
		System.out.println(number);
		
		

	}

}
