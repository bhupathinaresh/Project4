package myProject.JavaProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDOMExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//driver.findElement(By.xpath("//input[@id='input']")).sendKeys("testing");
		//driver.findElement(By.cssSelector("input#input")).sendKeys("testing");
		WebElement root =driver.findElement(By.tagName("book-app"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement shadowDom1=(WebElement) js.executeScript("return arguments[0].shadowRoot", root);
		
		WebElement appheader=shadowDom1.findElement(By.tagName("app-header"));
		WebElement apptoolbar=appheader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
		WebElement bookinputdecorator = apptoolbar.findElement(By.tagName("book-input-decorator"));
		
		bookinputdecorator.findElement(By.cssSelector("input#input")).sendKeys("Testing");
		
	}

}
