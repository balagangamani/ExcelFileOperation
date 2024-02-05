package day16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteOperation {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet();

		Object[][] data = {

				{"Name","Age","City"}, 
				{"Bala",28,"Hyderabad"}, 
				{"Pavan",30,"Delhi"},
				{"Sai",25,"Armur"} 
				};

		int rowCount = 0;

		for (Object[] row1 : data) {

			XSSFRow row = sheet.createRow(rowCount++);

			int columnCount = 0;

			for (Object col : row1) {

				XSSFCell cell = row.createCell(columnCount++);

				if (col instanceof String) {
					cell.setCellValue((String) col);
				} else if (col instanceof Integer) {
					cell.setCellValue((Integer) col);
				}
				
				
			}

		}
		try(
		     FileOutputStream output = new FileOutputStream("E:\\EclipseClass\\ExcelFileOperation\\src\\main\\java\\day16\\FirstFile.xlsx");){
	         book.write(output);

		}
}
	
}
