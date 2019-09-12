package cucu.objectrepositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucu.resources.Base;

public class Login extends Base {
	public Login() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='header-login']")
	public WebElement click;
	@FindBy(id="x-mark-icon")
	public WebElement click2;
	public WebElement getClick() {
		return click;
		
	}
	public WebElement getClick2() {
		return click2;
		
	}
}
 