package co.amensys.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    driver.get("https://www.flipkart.com/");
    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    
	driver.findElement(By.className("col-11-12")).click();
	driver.findElement(By.xpath("//a[@class='_2cLu-l']")).click();
	

	

	}

}
