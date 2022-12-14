package myProject.JavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {
	
	WebDriver driver=null;
	@BeforeTest
	public void setUpTest()
	{
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webDriver.chrome.driver",projectPath+"");
		driver=new ChromeDriver();
	}
	@Test
	public void googleSearch()
	{
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}

	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
	}
}
