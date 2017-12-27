package com.offcn.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

public class Excel1 {

	@Test
	public void testwrite()throws Exception{
		
		//创建工作簿对象
	HSSFWorkbook workbook=new HSSFWorkbook();
	
	//基于这个工作簿对象，来创建工作表
	HSSFSheet sheet1=workbook.createSheet("工作表1");
	
	//创建行
	HSSFRow row=sheet1.createRow(3);
	
	//创建单元格对象
    HSSFCell cell1=row.createCell(5);
    cell1.setCellValue("小貓咪");
    
	
	workbook.write(new File("d:\\MyDownloads\\1.xls"));

	workbook.close();
	
	}
	
	
	
	@Test
	public void testread() throws FileNotFoundException, IOException{
		
		HSSFWorkbook workbook=new HSSFWorkbook(new FileInputStream("d:\\MyDownloads\\1.xls"));
		
		HSSFSheet sheet1=workbook.getSheet("工作表1");
		
		HSSFRow row=sheet1.getRow(3);
		
		HSSFCell cell=row.getCell(5);
		
		System.out.println(":"+cell.getStringCellValue());
	}
	
	
	@Test
	public void testread2()throws Exception{
		
		Workbook workbook= WorkbookFactory.create(new File("d:\\MyDownloads\\a.xlsx"));
		
		Sheet sheet1=workbook.getSheet("Sheet1");
		
		Row row=sheet1.getRow(3);
		
		Cell cell=row.getCell(5);
		
		System.out.println(":"+cell.getStringCellValue());
	}
	
	
	
	
	
	
	
	@Test
	public void testread3() throws EncryptedDocumentException, InvalidFormatException, IOException{
		
		Workbook workbook= WorkbookFactory.create(new File("d:\\MyDownloads\\Mobile.xls"));
		
		int sheetnum=workbook.getNumberOfSheets();
		
		for(int i=0;i<sheetnum;i++){
			
			Sheet sheet=workbook.getSheetAt(i);
			
			int rownum=sheet.getPhysicalNumberOfRows();
			
			for(int j=0;j<rownum;j++){
				
				Row row=sheet.getRow(j);
				
				int cellnum=row.getPhysicalNumberOfCells();
				
				for(int q=0;q<cellnum;q++){
					
					Cell cell=row.getCell(q);
					
					
					if(cell.getCellType()==HSSFCell.CELL_TYPE_STRING){
						
						System.out.print(cell.getStringCellValue()+"\t");
					}else if(cell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC){
						
						System.out.print(cell.getNumericCellValue()+"\t");
					}else if(cell.getCellType()==HSSFCell.CELL_TYPE_BOOLEAN){
						
						System.out.print(cell.getBooleanCellValue()+"\t");
					}else if(cell.getCellType()==HSSFCell.CELL_TYPE_BLANK){
						
						System.out.print("null"+"\t");
					}else{
						
						System.out.print(cell.getDateCellValue()+"\t");
					}
				}
				
				System.out.println("");
			}
		}
		
		
	}
}