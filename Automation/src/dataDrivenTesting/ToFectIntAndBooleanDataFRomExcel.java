package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFectIntAndBooleanDataFRomExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./testData/excelData.xlsx");
		Workbook workbook =WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet("Sheet2");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		double value = cell.getNumericCellValue();
		System.out.println(value);
		System.out.println(value+5);
		
	}
}
