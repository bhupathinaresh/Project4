package myProject.JavaProject;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;


public class WritingDateIntoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream f=new FileOutputStream("C:\\Users\\Naresh\\Desktop\\TestData2.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Data1");
		
		for (int i=0;i<=5;i++)
		{
			XSSFRow row=sheet.getRow(i);
			for (int j=0;j<3;j++)
			{
				row.createCell(j).setCellValue("xyz");
			}
		}
		
		workbook.write(f);
		f.close();
		System.out.println("Written data into excel is completed");
	}

}
