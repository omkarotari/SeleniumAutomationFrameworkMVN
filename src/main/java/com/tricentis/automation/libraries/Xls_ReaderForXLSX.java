package com.tricentis.automation.libraries;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_ReaderForXLSX 
{
	String filepath=null;
	
	public Xls_ReaderForXLSX(String filepath)
	{
		this.filepath=filepath;
	}
	
	public String getCellData(String sheetName, int rowNum, int colNum) throws IOException {
		FileInputStream file= new FileInputStream(filepath);
		
		//Workbook
		XSSFWorkbook wb= new XSSFWorkbook(file);
		
		//work sheet
		XSSFSheet sheet=wb.getSheet(sheetName);
		
		//Row
		XSSFRow row=sheet.getRow(rowNum);
		
		//Cell
		XSSFCell cell=row.getCell(colNum);
		
		String value=cell.getStringCellValue();
		
		return value;
		
	}
	
	public void setCellData(String sheetName, int rowNum, int colNum, String value) throws IOException
	{
		FileInputStream file= new FileInputStream(filepath);
		
		//Workbook
		XSSFWorkbook wb= new XSSFWorkbook(file);
		
		//work sheet
		XSSFSheet sheet=wb.getSheet(sheetName);
		
		//Row
		XSSFRow row=sheet.getRow(rowNum);
		if(row==null)
			row=sheet.createRow(rowNum);
		
		//Cell
		XSSFCell cell=row.getCell(colNum);
		if(cell==null)
			cell=row.createCell(colNum);
		
		cell.setCellValue(value);		

		FileOutputStream fileOut = new FileOutputStream(filepath);

		wb.write(fileOut);
	}
	
	public int getRowCount(String sheetName) throws IOException
	{
		FileInputStream file= new FileInputStream(filepath);
		
		//Workbook
		XSSFWorkbook wb= new XSSFWorkbook(file);
		
		//work sheet
		XSSFSheet sheet=wb.getSheet(sheetName);
		
		return sheet.getPhysicalNumberOfRows();
	}
	
	public int getColumnCount(String sheetName) throws IOException
	{
		FileInputStream file= new FileInputStream(filepath);
		
		//Workbook
		XSSFWorkbook wb= new XSSFWorkbook(file);
		
		//work sheet
		XSSFSheet sheet=wb.getSheet(sheetName);
		
		return sheet.getRow(0).getLastCellNum();
	}

}
