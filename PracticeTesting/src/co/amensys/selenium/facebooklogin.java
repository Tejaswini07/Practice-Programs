package co.amensys.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class facebooklogin {
	public static void main(String[] args) {
	
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);
	driver.get("http://www.facebook.com");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("teja.reddy216@gmail.com");
	driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("Gaddam_123");
	driver.findElement(By.xpath(".//*[@id='u_0_y']")).click();
	
	/*driver.findElement(By.name("firstname")).click();
	driver.findElement(By.name("lastname")).sendKeys("Gaddam");
	driver.findElement(By.name("reg_email__")).sendKeys("teja.reddy216@gmail.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("9666694095");
	Select s1= new Select(driver.findElement(By.id("month")));
	s1.selectByVisibleText("Feb");
	Select s2 = new Select(driver.findElement(By.id("day")));
	s2.selectByValue("16");
	Select s3 = new Select(driver.findElement(By.id("year")));
	s3.selectByValue("1993");
	driver.findElement(By.xpath(".//*[@id='u_0_n']/span[1]")).click();
    driver.findElement(By.xpath(".//*[@id='u_0_p']")).click();*/
	}

}
