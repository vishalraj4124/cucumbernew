package cucu.objectrepositry;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucu.resources.Base;

public class Selectthepage extends Base{
	public Selectthepage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@data-toggle='dropdown'])[1]")
	public WebElement click4;
	@FindBy(xpath="//span[@class='header-shopping-count']")
    public WebElement Click5;
	@FindBy(xpath="//a[@class='versona-btn']")
	public WebElement click6;
	@FindBy(xpath="(//a[@class='versona-btn'])[2]")
	public WebElement SelectAddress;

	public WebElement getSelectAddress() {
		return SelectAddress;
	}

	public WebElement getClick6() {
		return click6;
	}

	public WebElement getClick5() {
		return Click5;
	}

	public WebElement getClick4() {
		return click4;
	}

}
