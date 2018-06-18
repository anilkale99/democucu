package com.ReadFromExcel;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelData {

	XSSFWorkbook wb = null;
	XSSFSheet sheet = null;

	ReadExcelData(String filePath) throws Exception {
		try {
			// Open the Excel file
			FileInputStream ExcelFile = new FileInputStream("src/test/java/com/ReadFromExcel/"+filePath);
			// Access the required test data sheet
			wb = new XSSFWorkbook(ExcelFile);
			sheet = wb.getSheetAt(0);
		} catch (Exception e) {
			throw (e);
		}
	}
	
	public int getRows(){
		return sheet.getLastRowNum();
	}
	
	public int getCols(){
		return sheet.getRow(0).getLastCellNum();
	}
	
	
	public String getCellData(int row, int col){
		return sheet.getRow(row).getCell(col).getStringCellValue();
	}
	
	
	
	

}
