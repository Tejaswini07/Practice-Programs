package co.amensys.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebookpom {

	public void Homepage(WebDriver driver, String Url)
	{
		driver.get(Url);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	public void Loginpage(WebDriver driver, String Usnm, String Us, String Psnm, String Ps)
	{
		driver.findElement(By.xpath("Usnm")).click();
		driver.findElement(By.xpath("Usnm")).sendKeys("Us");
		driver.findElement(By.xpath("Psnm")).sendKeys("Ps");
	}
	public void Login(WebDriver driver, String Lgbn)
	{
		driver.findElement(By.xpath("Lgbn")).click();
	}
	public void Messege(WebDriver driver, String Msg, String Mbutt)
	{
		driver.findElement(By.xpath("Msg")).click();
		driver.findElement(By.xpath("Mbutt")).click();
	}
	public void Notification(WebDriver driver, String Ntfn, String Nbutt)
	{
		driver.findElement(By.xpath("Ntfn")).click();
		driver.findElement(By.xpath("Nbutt")).click();
	}
	public void Logout(WebDriver driver,String logoutMenu , String logout )
	{
		driver.findElement(By.id("logoutMenu"));
		driver.findElement(By.xpath("logout")).click();
	}

}
