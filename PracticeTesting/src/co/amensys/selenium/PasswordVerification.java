package co.amensys.selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PasswordVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Username; 
		Username = "gr.pittam@gmail.com";
	    String Password ;
	    Password = "xyz";
	    
	    WebDriver driver = new FirefoxDriver ();
	    driver.get("http:www.gmail.com");
	    WebElement we = driver.findElement(By.xpath("//input[@id='identifierId']"));
	    we.sendKeys(Username);
	    WebElement ps = driver.findElement(By.xpath("//input[@type='password']"));
	    ps.sendKeys(Password);
	    if (Password.equals(Password))
	    {
	    	System.out.println("Password entered is correct " );
	    }
		
	    else 
	    {
	    	System.out.println("show error message");
	    }
		
	
		
		

	}

}
