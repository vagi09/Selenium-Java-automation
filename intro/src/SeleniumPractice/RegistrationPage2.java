package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage2 {

	WebDriver driver;

	// @FindBy(how = How.LINK_TEXT, using = "REGISTER")
//	WebElement RegLink;
	
	
    
	@FindBy(linkText = "REGISTER")
	WebElement RegLink;

	@FindBy(name = "firstName")
	WebElement FirstName;

	@FindBy(name = "lastName")
	WebElement LastName;

	@FindBy(name = "phone")
	WebElement phone;

	@FindBy(name = "userName")
	WebElement email;

	@FindBy(name = "address1")
	WebElement address1;

	@FindBy(name = "city")
	WebElement city;

	@FindBy(name = "state")
	WebElement state;

	@FindBy(name = "postalCode")
	WebElement postalCode;

	@FindBy(name = "country")
	WebElement country;

	@FindBy(name = "email")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "confirmPassword")
	WebElement confirmpassword;

	@FindBy(name = "submit")
	WebElement registerBtn;

	RegistrationPage2(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}

	public void clickRegLink() {

		RegLink.click();
	}

	public void setFirstName(String fname)

	{
		FirstName.sendKeys(fname);

	}

	public void setLastName(String lname)

	{
		LastName.sendKeys(lname);

	}

	public void setPhone(String ph)

	{
		phone.sendKeys(ph);

	}

	public void setemail(String mail)

	{
		email.sendKeys(mail);

	}

	public void setAddress1(String addr1)

	{
		address1.sendKeys(addr1);

	}

	public void setState(String state1)

	{
		state.sendKeys(state1);

	}

	public void setPostalCode(String pcode)

	{
		postalCode.sendKeys(pcode);

	}

	public void setCity(String ci)

	{
		city.sendKeys(ci);

	}

	public void setCountry(String cn)

	{

		//WebElement con = driver.findElement(country);
		Select drop = new Select(country);
		drop.selectByVisibleText(cn);

	}

	public void setUserName(String uname)

	{
		username.sendKeys(uname);

	}

	public void setPassword(String passwrd)

	{
		password.sendKeys(passwrd);

	}

	public void setConfrimPassword(String passwrd)

	{
		confirmpassword.sendKeys(passwrd);

	}

	public void clickRegBtn()

	{
		registerBtn.click();

	}

}
