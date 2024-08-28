package Appium.stepdef;



import Appium.pages.HomePage;
import Appium.pages.LoginPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class LoginStepDef {
    public static AndroidDriver driver;

    @Given("user is on login page")
    public void userIsOnLoginPage(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("appPackage", "com.example.satu");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appActivity", "com.example.satu.ui.activities.splash.SplashScreenActivity");

        driver = new AndroidDriver(capabilities);
    }

    @And("user click on masuk m-banking satu button")
    public void userClickOnMasukButton(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickMasukButton();
    }

    @And("user input email with {string}")
    public void userInputEmailWith(String email){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputEmail(email);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputPassword(password);
    }

    @When("user click on login button")
    public void userClickLoginButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLanjutButton();
    }

    @Then("user is on home page")
    public void userIsOnHomePage(){
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getUserWelcomeText(),"GILANGTESTING");
        driver.terminateApp("com.example.satu");
    }
}
