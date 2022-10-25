package myProject.JavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\Naresh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// WebDriver driver=new ChromeDriver();

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());

		   Thread.sleep(5000);
		
		  driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Admin");
		  driver.findElement((By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]"))).sendKeys("admin123");
		  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		  driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();
		  driver.findElement(By.xpath("//span[normalize-space()='User Management']")).click();
		  driver.findElement(By.xpath("//a[normalize-space()='Users']")).click();
		  
		  WebElement rowcount =  driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]"));
		  rowcount.getSize();
		  System.out.println(rowcount);
		 
	}

}
