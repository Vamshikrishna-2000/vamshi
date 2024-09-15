package excelpractice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelworkbook<FileInputStream> {
	@Test
	public void insertdatainexcel() throws IOException  {
		
			XSSFWorkbook wo=new XSSFWorkbook();
			XSSFSheet sh=wo.createSheet("logintestdata");
			XSSFRow r=sh.createRow(0);
			r.createCell(0).setCellValue("username");
			r.createCell(1).setCellValue("password");
			r.createCell(2).setCellValue("status");
			XSSFRow r1=sh.createRow(1);
			r1.createCell(0).setCellValue("kumar@gamil.com");
			r1.createCell(1).setCellValue("kumar12345");
			r1.createCell(2).setCellValue("valid");
			XSSFRow r2=sh.createRow(2);
			r2.createCell(0).setCellValue("kavya@gmail.com");
			r2.createCell(1).setCellValue("kavya1234");
			r2.createCell(2).setCellValue("valid");
			XSSFRow r3=sh.createRow(3);
			r3.createCell(0).setCellValue("vamshi@gmail.com");
			r3.createCell(1).setCellValue("vamshi1234");
			r3.createCell(2).setCellValue("valid");
			XSSFRow r4=sh.createRow(4);
			r4.createCell(0).setCellValue("chandu@gmail.com");
			r4.createCell(1).setCellValue("cahndu1234");
			r4.createCell(2).setCellValue("valid");
			
			FileOutputStream fs = new FileOutputStream("C:\\Excel\\Demoiworkbook.xlsx");
			wo.write(fs);
		}
		@Test
		public void getperticularvalues()  {
			FileInputStream fis=new FileInputStream("C:\\\\Excel\\\\Demoiworkbook.xlsx");
			XSSFWorkbook wi=new XSSFWorkbook(fis);
			XSSFSheet sh=wi.getSheetAt(0);
			XSSFRow r=sh.getRow(2);
			String data=r.getCell(1).getStringCellValue();
			System.out.println(data);
}


	}


