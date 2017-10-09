package co.amensys.selenium;


	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	public class Usingpom {
	
	//Open Url
	public void Homepage(String url,WebDriver driver)
	{
	driver.get(url);

	}
	//Login Functionality
	public void Login(WebDriver driver,String Login)
	{
		driver.findElement(By.xpath(Login)).click();
	}
	//Entering Details into LoginPage
	 public  void Login(WebDriver driver,String UN,String PS,String UNID,String PSID,String Lbtn)
	  {driver.findElement(By.xpath(UNID)).sendKeys(UN);
	  driver.findElement(By.xpath(PSID)).sendKeys(PS);
	  driver.findElement(By.xpath(Lbtn)).click();
		}
	//Clicking Events
		public void ButonClick(WebDriver driver,String Button)
		{
			driver.findElement(By.xpath(Button)).click();
		}
		//Details Entering into SignupPage
		public void SignUpDetailsFill(WebDriver driver,String PhoneNumID,String PhneNO,String ContinueID,
	                                                       String otpID,String OTP,String passID,String Pass) throws Exception
		{
			driver.findElement(By.xpath(PhoneNumID)).sendKeys(PhneNO);
			driver.findElement(By.xpath(ContinueID)).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(otpID)).sendKeys(OTP);
			driver.findElement(By.xpath(passID)).sendKeys(Pass);
			
		}
		
		
		
		
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		//Browser Configuration
		ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("--disable-web-security");
			options.addArguments("--no-proxy-server");
		    Map<String, Object> prefs = new HashMap<String, Object>();
		    prefs.put("credentials_enable_service", false);
		    prefs.put("profile.password_manager_enabled", false);
		    options.setExperimentalOption("prefs", prefs);
	     WebDriver driver =new ChromeDriver(options);
	     //Managing Page LoadTime
	     driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		Usingpom T=new Usingpom();
		@SuppressWarnings("resource")
		
		//Handling KeyInputs from Keyboard
		Scanner S=new Scanner(System.in);
		 System.out.println("Enter Phne No.");
		 String NUM=S.next();
		 System.out.println("Enter OTP:");
		 String OTP=S.next();
		 System.out.println("Enter Password:");
		 String PASS=S.next();
		
		 String Url="http://flipkart.com",
			   NUMBER=NUM,Otp=OTP,EntrPassSignUp=PASS,
					   
			          LoginId=".//*[@id='container']/div/header/div[1]/div[1]/div/ul/li[8]/a",
					   EntrNumId="//div[@class='_39M2dM']//input[@type='text']",
					   CloseId="//button[@class='_2AkmmA _29YdH8']",
					   SignupId="//span[contains(text(),'New to Flipkart? Sign up')]",  
					   ContinueId="//span[contains(text(),'CONTINUE')]",
					   OtpId="//div[@class='_39M2dM']//input[@autocomplete='on']",
			   SignUpPassId="//div[@class='_39M2dM']//input[@type='password']",
			   SubmitSignUpId="//div[@class='_1avdGP']/button[@type='submit']",
			   ExtngUserId="//a[@class='_2AkmmA _1LctnI jUwFiZ']//span[contains(text(),'Existing User? Log in')]",
			   LEntrUsrnameId="//input[@class='_2zrpKA']",
			   LPasswordId="//input[@type='password']",
			   LoginSubmitId="//button[@type='submit']//span[contains(text(),'Login')]";
			   
			   
		
			T.Homepage(Url, driver);
			T.Login(driver, LoginId);
			T.Login(driver,NUM,EntrPassSignUp,LEntrUsrnameId,LPasswordId,LoginSubmitId);
		           T.ButonClick(driver,SignupId);
	               T.SignUpDetailsFill(driver,EntrNumId,NUMBER,ContinueId,OtpId,Otp,SignUpPassId,EntrPassSignUp);
	               T.ButonClick(driver,SubmitSignUpId);
			      T.ButonClick(driver,ExtngUserId);
		}
	}
