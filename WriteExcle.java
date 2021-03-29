package Sample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteExcle {
	 public static void main(String[] args) throws IOException {
	        XSSFWorkbook workbook = new XSSFWorkbook();
	        XSSFSheet sheet = workbook.createSheet("Java Books");
	         
	        Object[][] bookData = {
	                {"Mani", "IT", 23},
	                {"Bowya", "QA", 30},
	                {"Gopi", "Development", 32},
	                {"Bala", "QA", 35},
	        };
	 
	        int rowCount = 0;
	         
	        for (Object[] aBook : bookData) {
	            Row row = sheet.createRow(++rowCount);
	             
	            int columnCount = 0;
	             
	            for (Object field : aBook) {
	                Cell cell = row.createCell(++columnCount);
	                if (field instanceof String) {
	                    cell.setCellValue((String) field);
	                } else if (field instanceof Integer) {
	                    cell.setCellValue((Integer) field);
	                }
	            }
	             
	        }
	         
	         
	        FileOutputStream outputStream = new FileOutputStream("JavaBooks.xlsx"); 
	            workbook.write(outputStream);
	        
	    }
	 
	}
