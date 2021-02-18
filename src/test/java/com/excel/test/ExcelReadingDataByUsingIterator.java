package com.excel.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingDataByUsingIterator {

	public static void main(String[] args) throws IOException {

		String location = "C:\\Users\\User\\Desktop\\Papulation.xlsx";
		FileInputStream fi =  new FileInputStream(location);
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		Iterator iterator = sheet.iterator();
		while(iterator.hasNext()) {
			XSSFRow row =(XSSFRow) iterator.next();
			Iterator celliterator = row.cellIterator();
			while(celliterator.hasNext()) {
				XSSFCell cell = (XSSFCell) celliterator.next();
				switch(cell.getCellType()){
				case STRING: System.out.print(cell.getStringCellValue());break;
				case NUMERIC: System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
				
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
		
	}

}
