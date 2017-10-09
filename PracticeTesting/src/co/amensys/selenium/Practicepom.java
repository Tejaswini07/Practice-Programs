package co.amensys.selenium;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practicepom {

	public void Homepage(String url, WebDriver driver)
	{
		driver.get(url);
	}
	
	public void Login(String Usnm,String Us,String Nxt, String Pswd, String Ps, WebDriver driver) throws Exception
	{
	
		driver.findElement(By.xpath(Usnm)).sendKeys(Us);
		driver.findElement(By.xpath(Nxt)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Pswd)).sendKeys(Ps);
		driver.findElement(By.xpath(Nxt)).click();
	}
	public void Logoutbutton(WebDriver driver,String Account,String Signout)
	{
		driver.findElement(By.xpath(Account)).click();
		driver.findElement(By.xpath(Signout)).click();
		
	}
	public void Quit(WebDriver Driver){
		
		Driver.quit();
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		Practicepom p = new Practicepom();
		
		/*@SuppressWarnings("resource")
		Scanner S=new Scanner(System.in);
		System.out.println("Enter email Id");
		String Usnm = S.next();
		System.out.println("Enter Password");
		String Pswd = S.next();
		
		
		String url= "http://www.Gmail.com",
				Username=Usnm,
				Password = Pswd,*/
	
		String url= "http://mail.google.com",
				Usnm = "//input[@id='identifierId']",
				Us="teja.reddy216",
				Nxt = "//span[contains(text(),'Next')]",
	            LPassId="//input[@id='identifierpassword'";
		/*WebElement LPassId=driver.findElement( By.xpath("//input[@type='password']"));
				
		 
	Wait.until(ExpectedConditions.elementIfVisible(LPassId))
		{
			;
		}
		else
		{
			System.out.println("return true");
		}*/
		
		String LNextId = "//span[contains(text(),'Next')]",
				LAccountId="//a[@class='gb_b gb_eb gb_R']",
				LSignoutId="//a[@id='gb_71']";
		
		p.Homepage(url, driver);
		p.Login(Usnm,Us,Nxt,LPassId,"@jaytej@", driver);	
		p.Logoutbutton(driver, LAccountId, LSignoutId);
		//p.Quit(driver);
		}}
