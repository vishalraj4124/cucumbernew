package cucu.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
public static WebDriver driver;
public static WebDriver getDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\eclipse-vishalSel\\cucumberproject\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	return driver;
}
public static void browserlauch(String url) {
driver.get(url);
}
public static void sendkeys(WebElement txt ,String name) {
txt.sendKeys(name);
}
public static void click(WebElement clk) {
	clk.click();
}

}
//https://www.shopversona.com
//private void sendkeys(WebElement txtUsername, String string) {
	// TODO Auto-generated method stub
	
