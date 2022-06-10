package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLoginLogoutPage extends BasePage{
	
	public FacebookLoginLogoutPage(WebDriver driver,WebDriverWait explicitWait) {
		this.driver = driver;
		this.explicitWait = explicitWait;
	}
   
    By userNameEditBox = By.id("email");
	By passWordEditBox = By.id("pass");
	By loginButtonLocator = By.name("login");
	By accountDropDown = By.xpath("//div[contains(@aria-label,'Your profile')]");
	By logoutButton = By.xpath("//span[.='Log Out']");
	
	
	public void launchFacebook(String facebookURL) {
	    driver.get(facebookURL);	
	}
	
	public void waitForFacebookLoginLogoutPageToLoad() {
		explicitWait.until(ExpectedConditions.presenceOfElementLocated(userNameEditBox));
	}
	
	public void enterUserName(String userName) {
		locateInputField(userNameEditBox).sendKeys(userName);
	}
		
	
	public void enterPassWord(String password) {
		locateInputField(passWordEditBox).sendKeys(password);
	}
	
	public void clickLoginButton() {
		explicitWait.until(ExpectedConditions.elementToBeClickable(loginButtonLocator)).click();
	}
	
	

}
