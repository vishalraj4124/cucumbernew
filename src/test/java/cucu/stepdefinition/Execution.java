package cucu.stepdefinition;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;

import cucu.objectrepositry.Login;
import cucu.objectrepositry.Selectthepage;
import cucu.objectrepositry.username;
import cucu.resources.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Execution extends Base {
	public static WebDriver driver;
	@Given("user should launch the browser")
	public void user_should_launch_the_browser() {
		getDriver();
		browserlauch("https://www.shopversona.com");	    
			}

	@Given("user click the login link")
	public void user_click_the_login_link() throws InterruptedException {
		Login n=new Login();
	//	click(n.getClick2());
		Thread.sleep(3000);
		click(n.getClick()); 
		
	  }

	@When("user will provide username ad password and purchase the product")
	public void user_will_provide_username_ad_password_and_purchase_the_product() throws AWTException, InterruptedException {
	  username a=new username();  
	 sendkeys(a.txtusername, "demoautotesting@gmail.com");
	 sendkeys(a.txtpassword, "demodemo");
	 click(a.getClicklogin());
	 Selectthepage b=new Selectthepage();
	 click(b.getClick4());
	 Robot v=new Robot();
	 //down
	 v.keyPress(KeyEvent.VK_DOWN);
	 v.keyRelease(KeyEvent.VK_DOWN);
	 //Enter
	 v.keyPress(KeyEvent.VK_ENTER);
	 v.keyRelease(KeyEvent.VK_ENTER);
	 Thread.sleep(1000);
	 click(b.getClick5());
	 //Checkout
	 click(b.getClick6());
	 //select the address
	 click(b.getSelectAddress());
	}
   
	

	@Then("to verified the amount is paid")
	public void to_verified_the_amount_is_paid() {
	    
	
	}

}
 
