package day16;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadOperation {

	private static int j;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook book = new XSSFWorkbook("E:\\EclipseClass\\ExcelFileOperation\\FirstFile.xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowCount][columnCount];
		
		// Get into row
		
		for(int i=1;i<=rowCount;i++) {
			
		XSSFRow row = sheet.getRow(i);
		
		//Get into cell
		
		for(int j=0;j<columnCount;j++) {
		
		XSSFCell cell = row.getCell(j);
		
		// read the data from excel
		
		data[i-1][j] = cell.getStringCellValue(); // i=1, j=0 -- i=0, j=0
		
		System.out.println(cell.getStringCellValue());
			
		}
	}

}
}
