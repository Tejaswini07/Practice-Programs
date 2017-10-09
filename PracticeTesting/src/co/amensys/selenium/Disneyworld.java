package co.amensys.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Disneyworld {

	public void OpenBrowser(WebDriver driver, String url)
	{
		driver.get("url");
	}
	public void Parktickets(WebDriver driver, String drop, String day, String add, String tickets)
	{
		driver.findElement(By.xpath("drop")).click();
		driver.findElement(By.xpath("day")).click();
		driver.findElement(By.xpath("add")).click();
		driver.findElement(By.xpath("tickets")).click();
		}
	public void Addcart(WebDriver driver, String cart)
	{
		driver.findElement(By.xpath("cart")).click();
	}
	public static void main(String[] args) {
		
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	
	Disneyworld d = new Disneyworld();
	
	String url = "https://disneyworld.disney.go.com/tickets/";
	String dropID = "//a[@name='&lid=WDW_Header_ParksTickets_CategoryLink']",
			dayID=".//*[@id='pepDayScroller_numDays']/div[4]/a/div[2]",
			addID=".//*[@id='pepDayScroller_numDays']/div[4]/a/div[2]",
			ticketsID=".//*[@id='pepDayScroller_numDays']/div[4]/a/div[2]",
			cartID=".//*[@id='pepDayScroller_numDays']/div[4]/a/div[2]";
	
	d.OpenBrowser(driver, url);
	d.Parktickets(driver, dropID, dayID, addID, ticketsID);
    d.Addcart(driver, cartID);
				
	}

}
