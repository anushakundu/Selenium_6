package com.teicenties.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getStringDataFromExcel (String sheetname,int rowIndex, int ColIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/testdata.xlsx");
		 Workbook workbook = WorkbookFactory.create(fis);
		 return workbook.getSheet(sheetname).getRow(rowIndex).getCell(ColIndex).getStringCellValue();
		 
	}
	public boolean getBooleanDataFromExcel (String sheetname,int rowIndex, int ColIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/testdata.xlsx");
		 Workbook workbook = WorkbookFactory.create(fis);
		 return workbook.getSheet(sheetname).getRow(rowIndex).getCell(ColIndex).getBooleanCellValue();
		 
	}
	public double getNumericDataFromExcel (String sheetname,int rowIndex, int ColIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/testdata.xlsx");
		 Workbook workbook = WorkbookFactory.create(fis);
		 return workbook.getSheet(sheetname).getRow(rowIndex).getCell(ColIndex).getNumericCellValue();
	}
	public LocalDateTime getDateAndTimeFromExcel (String sheetname,int rowIndex, int ColIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/testdata.xlsx");
		 Workbook workbook = WorkbookFactory.create(fis);
		 return workbook.getSheet(sheetname).getRow(rowIndex).getCell(ColIndex).getLocalDateTimeCellValue();
	}

}
