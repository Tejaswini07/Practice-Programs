package co.amensys.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipcartinchrome {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("http://www.flipcart.com");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("womens clothing");
		 driver.findElement(By.xpath("//button[@type='submit']")).click(); 
	 }
	 }