package myProject.JavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
				Thread.sleep(5000);
				boolean s =driver.findElement(By.xpath("//input[@id='u_3_5_K7']")).isSelected();
				System.out.println(s);
	}

}
