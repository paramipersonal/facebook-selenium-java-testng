package test_scenarios;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import page_objects.FacebookHomePage;
import page_objects.FacebookLoginLogoutPage;
import resources.Messages;

public class FacebookBasicTestSpec {

	WebDriver driver;
	WebDriverWait explicitWait;
	FacebookLoginLogoutPage facebookLoginPage;
	FacebookHomePage facebookHomePage;
	Logger logger;


	@BeforeTest
	public void beforetest() {

		logger = LogManager.getLogger();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		explicitWait = new WebDriverWait(driver,30,100);
		driver.manage().window().maximize();
		
	}

	@Test(priority = 0)
	public void verifyLogin() {
		logger.info("Test 1:Login to facebook");
		facebookLoginPage = new FacebookLoginLogoutPage(driver,explicitWait);
		logger.info("Step1: Launch facebook");
		facebookLoginPage.launchFacebook(Messages.getString("FacebookLink")); 
		logger.info("Step2: Waiting for Login Logout Page to Load.");
		facebookLoginPage.waitForFacebookLoginLogoutPageToLoad();
		logger.info("Step3: Enter email Id in user name");
		facebookLoginPage.enterUserName(Messages.getString("FacebookUserNameEmail")); 
		logger.info("Step4: Enter password in password field");
		facebookLoginPage.enterPassWord(Messages.getString("FacebookPassword"));
		logger.info("Step5: Click the login Button");
		facebookLoginPage.clickLoginButton();
		facebookHomePage = new FacebookHomePage(driver,explicitWait);
		logger.info("Step6: Wait for facebook home page to load, post log-in");
		facebookHomePage.waitForHomePageToLoad();
	}



	
	@Test(priority = 1) 
	public void postStatus() {
		logger.info("Test 2: Post a status in Facebook");
		facebookHomePage = new FacebookHomePage(driver,explicitWait);
		logger.info("Step1: Waiting for the facebook Home Page to Load");
		facebookHomePage.waitForHomePageToLoad();
		logger.info("Step2: Click on the What's on your mind box to post a status");
		facebookHomePage.clickWhatsOnYourMindBox();
		logger.info("Step3: Type the status message to post");
		facebookHomePage.typeStatus(Messages.getString("FacebookStatus")); 
		logger.info("Step4: Click on the 'post' button to post the status");
		facebookHomePage.clickStatusPostButton();
	}




	@Test(priority = 2)
	public void verifyStatus() {
		logger.info("Test3: Verify Posted Status");
		facebookHomePage = new FacebookHomePage(driver,explicitWait);
		logger.info("Step1: Wait for home page to load.");
		facebookHomePage.waitForHomePageToLoad(); 
		logger.info("Step2: Verify the posted status");
		facebookHomePage.verifyStatus(Messages.getString("FacebookStatus")); 

	}

	

	@AfterTest
	public void afterTest() {
		driver.close();
	}


}
