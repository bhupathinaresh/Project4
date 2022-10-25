package myProject.JavaProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDropDownDemo {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub

			// System.setProperty("webdriver.chrome.driver",
			// "C:\\Users\\Naresh\\Downloads\\chromedriver_win32\\chromedriver.exe");
			// WebDriver driver=new ChromeDriver();

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			// System.out.println(driver.getPageSource());

			   Thread.sleep(5000);
				/*
				 * driver.findElement(By.xpath(
				 * "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]"
				 * )).sendKeys("Admin"); driver.findElement((By.xpath(
				 * "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]"
				 * ))).sendKeys("admin123");
				 * driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
				 * driver.findElement(By.
				 * xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']"
				 * )).click();
				 * 
				 * WebElement rowcount = driver.findElement(By.xpath(
				 * "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]"
				 * )); rowcount.getSize(); System.out.println(rowcount);
				 */
			   
			   
			   WebElement element = driver.findElement(By.xpath("//select[@id='animals']"));
			   Select s=new Select(element);
			   
			   List orginialList = new ArrayList();
			   List tempList=new ArrayList();
			   List<WebElement> options=s.getOptions();
			   
			   for(WebElement e:options)
			   {
				   orginialList.add(e.getText());
				   tempList.add(e.getText());
			   }
			   System.out.println("Orginial List is: " +orginialList);
			  			   
			    //List tempList=new ArrayList();
			  // tempList=orginialList;
			  			   
			   System.out.println("Temporary List before sorting is: " +tempList);
			   
			   Collections.sort(tempList);
			   System.out.println("Orginial List after sortig is: " +orginialList);
			   System.out.println("Temporary List after sortig is: " +tempList);
			   			   
			   if (orginialList==tempList)
			   {
				   System.out.println("List is sorted");
			   }
			   else
			   {
				   System.out.println("List is not sorted");
			   }
			   
			   driver.close();
			   
			   
	}

}
