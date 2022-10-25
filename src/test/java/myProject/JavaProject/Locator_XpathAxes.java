package myProject.JavaProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_XpathAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naresh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		//Self Axes
		String text =driver.findElement(By.xpath("//a[normalize-space()='Indiabulls Housing F']/self::a")).getText();
		System.out.println(text);
		
		//Parent Axes
		String text1 =driver.findElement(By.xpath("//a[normalize-space()='Triveni Eng.&Ind.Ltd']/parent::td")).getText();
		System.out.println(text1);
		
		//Parent Axes
		String text2 =driver.findElement(By.xpath("//a[normalize-space()='Intellect Design']/ancestor::tr")).getText();
		System.out.println(text2);
		
		//Child Axes
		List<WebElement> text3 =driver.findElements(By.xpath("//a[normalize-space()='Triveni Eng.&Ind.Ltd']/ancestor::tr/child::td"));
		System.out.println("Number of Child elements: " +text3.size());
		
		
		//Descendant Axes
		List<WebElement> text4 =driver.findElements(By.xpath("//a[normalize-space()='Triveni Eng.&Ind.Ltd']/ancestor::tr/descendant::*"));
		System.out.println("Number of Descendant nodes: " +text4.size());
		//Thread.sleep(5000);
		
		//Following Axes
		List<WebElement> text5 =driver.findElements(By.xpath("//a[normalize-space()='Triveni Eng.&Ind.Ltd']/ancestor::tr/following::tr"));
		System.out.println("Number of following nodes: " +text5.size());
		
		//Following sibiling Axes
		List<WebElement> text6 =driver.findElements(By.xpath("//a[normalize-space()='Triveni Eng.&Ind.Ltd']/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of following sibiling nodes " +text6.size());
		
		//Preceding Axes
		List<WebElement> text7 =driver.findElements(By.xpath("//a[normalize-space()='Triveni Eng.&Ind.Ltd']/ancestor::tr/preceding::*"));
		System.out.println("Number of Preceding nodes: " +text7.size());
		
		//Preceding sibiling axes
		List<WebElement> text8 =driver.findElements(By.xpath("//a[normalize-space()='Triveni Eng.&Ind.Ltd']/ancestor::tr/preceding-sibling::*"));
		System.out.println("Number of Preceding sibiling nodes: " +text8.size());
		
		//div[@id='reg_form_box']/child::div[11]/button
		//button[@id='u_3_s_sk']/parent::*/parent::*/child::div[1]/div/div[1]
			
		
		driver.close();
	}

}
