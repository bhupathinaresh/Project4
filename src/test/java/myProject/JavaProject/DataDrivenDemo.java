package myProject.JavaProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		FileInputStream f=new FileInputStream("C:\\Users\\Naresh\\Desktop\\TestData.xlsx");
		
		XSSFWorkbook workbook1 = new XSSFWorkbook(f);
		
		XSSFSheet sheet = workbook1.getSheet("Sheet2");
		
		int rowcount = sheet.getLastRowNum();
		//int celcount = sheet.getRow(0).getLastCellNum();
		
		/*
		 * for (int i=0;i<rowcount;i++) { XSSFRow currentrow=sheet.getRow(i); //focused
		 * on current row for (int j=0;j<celcount;j++) { String
		 * currentcell=currentrow.getCell(j).toString(); //read the value from the cell
		 * System.out.print(" " +currentcell);
		 * 
		 * }System.out.println(); }
		 */
		
		for (int i=1;i<=rowcount;i++)
			{
			 
			XSSFRow row = sheet.getRow(i);
			int principalcell = (int) row.getCell(0).getNumericCellValue();
			int rateofinterest = (int) row.getCell(1).getNumericCellValue();
			int preiod = (int) row.getCell(2).getNumericCellValue();
			String frequency = (String) row.getCell(3).getStringCellValue();
			double maturityvalue = (double) row.getCell(4).getNumericCellValue();
			
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(String .valueOf(principalcell));
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(String .valueOf(rateofinterest));
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(String .valueOf(preiod));
			
			Select periodcombo = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			periodcombo.selectByVisibleText("year(s)");
			
			Select freqcombo = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			freqcombo.selectByVisibleText(frequency);
			
			driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();

			String actual_mvalue= driver.findElement(By.xpath("//strong[normalize-space()='3655.21']")).getText();
			
			if ((Double.parseDouble(actual_mvalue)==maturityvalue))
			{
				System.out.println("Test Passed");
			}
			else
			{
				System.out.println("Test Failed");
			}
			
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
			/*
			 * XSSFCell principlecell = row.getCell(0); int princ= (int)
			 * principlecell.getNumericCellValue();
			 */
			
			 driver.close();
			 driver.quit();

			}

	}

}
