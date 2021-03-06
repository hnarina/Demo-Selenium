package demo.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {
	public static void main(String[] args) {
		try{
			
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement searchField = driver.findElement(By.id("lst-ib"));
		searchField.sendKeys("pluralsight");
		searchField.submit();
		
		
		
		WebElement imageLink = driver.findElements(By.linkText("Images")).get(0);
		imageLink.click();
		
		
		
		WebElement imageElement = driver.findElements(By.cssSelector("a[class=rg_l]")).get(5);
		WebElement imageLinks = imageElement.findElements(By.tagName("img")).get(0);
		
	imageLinks.click();
		}
		catch(Exception e)
		{e.printStackTrace();
	}
	}
}
