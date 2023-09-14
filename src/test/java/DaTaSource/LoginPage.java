package DaTaSource;

import Util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id = "email")
	public WebElement loginPage_emailBox;
	
	@FindBy (id = "pass")
	public WebElement loginPage_passwordBox;
	
	@FindBy (id = "login")
	public WebElement loginPage_login_btn;
	
	@FindBy (linkText = "Forgot password?")
	public WebElement loginPage_forgotPassword_link;
	
	@FindBy (xpath = "//a[@data-testid='open-registration-form-button']")
	public WebElement loginPage_createAccountBtn;
	
	@FindBy (linkText = "Create a Page")
	public WebElement loginPage_createPage_link;

	
	
	
	
}
