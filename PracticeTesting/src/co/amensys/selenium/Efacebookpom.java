package co.amensys.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Efacebookpom  extends Facebookpom
{
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		Facebookpom f = new Facebookpom();
		
		String Url= "http://www.facebook.com",
		        UsnmID = "//input[@id='email' AND @name='email']",
				PsID="//input[@id='pass' AND @class='inputtext']",
				LgbnID="//input[@type='submit']",
		       MsgID ="//div[@class='_2n_9']//span[@id='u_0_6']",
		       MbuttID="//a[contains(text(),'Mark All Read')]",
		       NtfnID= "//div[@class='_2n_9']//span[@id='u_0_c']",
		       NbuttID="//a[@id='u_0_d']",
		       logoutMenu="//div[@id='userNavigationLabel']";
		     /* WebElement navigationclick = driver.findElement(By.id("logoutMenu"));
		       WebElement logout = driver.findElement(By.xpath("//div[@id='u_d_1']/div/div/div/div/div/ul/li[12]/a/span/span"));
		       navigationclick.click();
		       if(logout.isEnabled() && logout.isDisplayed()) {
		           logout.click();
		       }
		       else {
		           System.out.println("Element not found");
	
		       }*/
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        String logoutID=".//*[@id='js_1d']/div/div/ul/li[14]/a/span/span";
	f.Homepage(driver, Url);
	f.Loginpage(driver, UsnmID, "teja.reddy216@gmail.com", PsID, "Gaddam_123");
	f.Login(driver, LgbnID);
	f.Messege(driver, MsgID, MbuttID);
	f.Notification(driver, NtfnID, NbuttID);
	f.Logout(driver, logoutMenu, logoutID);
	
	}

}
