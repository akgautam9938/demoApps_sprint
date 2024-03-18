package genricUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
	
	public String fetchDataFromPropertyFile(String Key) throws IOException
	{
		FileInputStream fis = new FileInputStream("E:\\java qspider\\demoApps\\src\\test\\resources\\commonTestData\\commanTestData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(Key);
	}
	
	public String fetchStringDataFromExcelSheet(String sheetName, int cellNo, int rowNo) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("E:\\java qspider\\demoApps\\src\\test\\resources\\New Microsoft Excel Worksheet.xlsx");
	return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
	}
	
	public double fetchDoubleDataFromExcelSheet(String sheetName, int cellNo, int rowNo) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("E:\\java qspider\\demoApps\\src\\test\\resources\\New Microsoft Excel Worksheet.xlsx");
	return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getNumericCellValue();
	}
	
	public boolean fetchBooleanDataFromExcelSheet(String sheetName, int cellNo, int rowNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("E:\\java qspider\\demoApps\\src\\test\\resources\\New Microsoft Excel Worksheet.xlsx");
	return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getBooleanCellValue();
	}
	

}
