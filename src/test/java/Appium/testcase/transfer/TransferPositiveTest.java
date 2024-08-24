package Appium.testcase.transfer;

import Appium.pages.HomePage;
import Appium.pages.LoginPage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TransferPositiveTest {
    protected static AndroidDriver driver;

    @BeforeClass
    public static void setUp(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("appPackage", "com.example.satu");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appActivity", "com.example.satu.ui.activities.splash.SplashScreenActivity");

        driver = new AndroidDriver(capabilities);
    }

    @Test
    public static void transferPositiveTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        //Element action
        loginPage.clickMasukButton();
        loginPage.inputEmail("gilangzhanuardy3222@gmail.com");
        loginPage.inputPassword("Testing123*");
        loginPage.clickLanjutButton();

        //Assertion
        Assert.assertEquals(homePage.getUserWelcomeText(),"GILANGTESTING");

        //Element action
        homePage.clickTransferButton();
        homePage.inputInformationAndTargetRekening("1111111155", "10000", "testing automation", "123456");
        homePage.validationTransferSuccess();
    }

    @AfterClass
    public static void tearDown(){
        driver.terminateApp("com.example.satu");
    }
}
