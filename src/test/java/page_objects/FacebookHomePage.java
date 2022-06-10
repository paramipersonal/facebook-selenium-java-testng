package page_objects;

import org.openqa.selenium.By;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookHomePage extends BasePage {
	
	
	public FacebookHomePage(WebDriver driver,WebDriverWait explicitWait) {
		this.driver = driver;
		this.explicitWait = explicitWait;
	}
	
	By facebookHomeButtonLocator = By.xpath("//a[contains(@aria-label,'Home')]");
	By createPostBoxLocator = By.xpath("//div[contains(@aria-label,'Create a post')]//div[contains(@role,'button')]");
	By textAreaForPostLocator = By.xpath("//form[contains(@method,'POST')]//div[contains(@role,'presentation')]");
	By postButtonLocator = By.cssSelector("div[aria-label='Post']");
	By textAreaPlaceHolderLocator = By.cssSelector("div[aria-describedby*='placeholder-']");
	By findPostLocator;

	public By buildLocatorToFindStatus(String statusText) {
		String xpathForStatus = "//*[text()='"+statusText+"']";
		return By.xpath(xpathForStatus);
	}
	
	public void waitForHomePageToLoad() {
		explicitWait.until(ExpectedConditions.presenceOfElementLocated(facebookHomeButtonLocator));
		assertEquals(driver.getTitle(),"Facebook");
	}
	
	public void clickWhatsOnYourMindBox() {
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(createPostBoxLocator)).click();
	}
	
	public void typeStatus(String statusText) {
		WebElement textArea = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(textAreaForPostLocator)).findElement(textAreaPlaceHolderLocator);
		textArea.click();
		textArea.sendKeys(statusText);
		explicitWait.until(ExpectedConditions.elementToBeClickable(postButtonLocator));
	}
	
	public void clickStatusPostButton() {  
		WebElement postButton = explicitWait.until(ExpectedConditions.elementToBeClickable(postButtonLocator));
		postButton.click();
		 
		 
	}
	
	public void verifyStatus(String statusText) {
		findPostLocator = buildLocatorToFindStatus(statusText);
		WebElement locatedPost = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(findPostLocator));
		assertEquals(locatedPost.getText(), statusText);
	}

}
