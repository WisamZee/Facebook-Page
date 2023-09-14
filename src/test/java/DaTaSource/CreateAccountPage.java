package DaTaSource;

import Util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreateAccountPage {
	public CreateAccountPage() {


	PageFactory.initElements(Driver.getDriver(), this);
	
	}
	
	@FindBy (xpath = "//div[text()='Sign Up']")
	public WebElement cap_signUp_text;
	
	@FindBy (name = "firstname")
	public WebElement cap_firstName_box;
	
	@FindBy (name = "lastname")
	public WebElement cap_lastName_box;
	
	@FindBy (name = "reg_email__")
	public WebElement cap_mobile_email_box;
	
	@FindBy (name = "reg_email_confirmation__")
	public WebElement cap_email_retype_box;
	
	@FindBy (id = "password_step_input")
	public WebElement cap_password_box;
	
	@FindBy (id = "month")
	public WebElement cap_month_dropdown;
	
	@FindBy (id = "day")
	public WebElement cap_day_dropdown;
	
	@FindBy (id = "year")
	public WebElement cap_year_dropdown;
	
	@FindBy (xpath = "//label[text()='Female']")
	public WebElement cap_female_radio;
	
	@FindBy (xpath = "//label[text()='Male']")
	public WebElement cap_male_radio;
	
	@FindBy (xpath = "//label[text()='Custom']")
	public WebElement cap_somethingElse_gender_radio;
	
	@FindBy (name = "websubmit")
	public WebElement cap_signup_btn;
}
	