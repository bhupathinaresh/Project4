package myProject.JavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingWindowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());
		driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[4]/ul[1]/li[2]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();
		
		System.out.println(driver.getTitle());
		
	}

}
