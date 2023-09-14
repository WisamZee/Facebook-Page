package Test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import DaTaSource.CreateAccountPage;
import DaTaSource.LoginPage;
import Util.DataReader;
import Util.Driver;
public class facebookTesting {
	public static void main(String[] args) {
		createAccountFieldsCheckTest();
	}
	
	// why we are declaring like this empty at class level
	// and initializing the object in the methods. 
	
	
	static LoginPage loginpage;
	static WebDriverWait wait;
	static CreateAccountPage cap_page;
	static Select letsSelect;
	
	public static void createAccountFieldsCheckTest() {
		//1. go to facebook.com
		Driver.getDriver().get(DataReader.getProperty("appurl"));
		Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Driver.getDriver().manage().window().maximize();
		
		//2. Click on Create New Account button
		loginpage = new LoginPage();
		loginpage.loginPage_createAccountBtn.click();
		
		
		//3. Type Automation to FirstName,  LastName and Password fields
		cap_page = new CreateAccountPage();
		wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		wait.until(ExpectedConditions.visibilityOf(cap_page.cap_signUp_text));
		
		cap_page.cap_firstName_box.sendKeys("Jon");
		cap_page.cap_lastName_box.sendKeys("Dow");
		cap_page.cap_password_box.sendKeys("AJgjgdfwi");
		
		//4. Type automation@email.com to Email box
		cap_page.cap_mobile_email_box.sendKeys("automation@email.com");
		
		//5. Re enter email
		wait.until(ExpectedConditions.visibilityOf(cap_page.cap_email_retype_box));
		cap_page.cap_email_retype_box.sendKeys("automation@email.com");
		
		//4. Select Mar 01 1979 from the Birthday dropdowns
		letsSelect = new Select(cap_page.cap_month_dropdown);
		letsSelect.selectByVisibleText("Mar");
		
		letsSelect = new Select(cap_page.cap_day_dropdown);
		letsSelect.selectByVisibleText("1");
		
		letsSelect = new Select(cap_page.cap_year_dropdown);
		letsSelect.selectByVisibleText("1979");
		
		//5. Click on Female radio button 
		cap_page.cap_female_radio.click();
		
		//6. Click on Sign Up button.
		cap_page.cap_signup_btn.click();
		
		//7. Quit the Driver
		//Driver.quitDriver();
	}
}