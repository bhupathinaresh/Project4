package myProject.JavaProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naresh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		WebElement signIn =driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		//System.out.println("Display SignIn"+signIn.isEnabled());
		signIn.click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("karthibhupathi26@gmail.com");
		driver.findElement((By.xpath("//input[@id='continue']"))).click();
		driver.findElement((By.xpath("//input[@id='ap_password']"))).sendKeys("Summer@55");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']//span[@class='nav-line-2']")).click();
		WebElement english=driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/label[1]/span[1]/span[1]"));
		WebElement spanish=driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/label[1]/span[1]/span[1]"));
		System.out.println(english.isEnabled());
		//System.out.println(spanish.isSelected());
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @name='field-keywords']")).sendKeys("kids halloween costume");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//Thread.sleep(5000);
		driver.close();

	}

}
