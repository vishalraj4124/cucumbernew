package cucu.objectrepositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucu.resources.Base;

public class username extends Base {

	
	@FindBy(xpath="//input[@name='emailAddress']")
    public WebElement txtusername;
    @FindBy(xpath="//input[@name='passwrd']")
    public WebElement txtpassword;
    @FindBy(id="signin")
    public WebElement clicklogin;
    public username()
	{
		PageFactory.initElements(driver, this);
	}
    public WebElement gettxtUsername() {
		return txtusername;
	}
	public WebElement gettxtPassword() {
		return txtpassword;
	}
	public WebElement getClicklogin() {
		return clicklogin;
	}
}
