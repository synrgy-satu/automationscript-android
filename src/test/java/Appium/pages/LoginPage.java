package Appium.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    AndroidDriver driver;
    WebDriverWait wait;

    By masukButton = By.xpath("//*[@text='Masuk M-Banking SATU']");
    By emailField = By.xpath("//*[@content-desc='Tombol input email']");
    By passwordField = By.xpath("//*[@content-desc='Tombol input password']");
    By lanjutButton = By.xpath("//*[@text='Lanjut']");
    By lanjut2Button = By.xpath("//*[@content-desc='Tombol Lanjut']");

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void clickMasukButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(masukButton));
        driver.findElement(masukButton).click();
    }

    public void inputEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        driver.findElement(emailField).sendKeys(email);
    }

    public void inputPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLanjutButton() throws InterruptedException {
        driver.findElement(lanjutButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(lanjut2Button));
        driver.findElement(lanjut2Button).click();
        Thread.sleep(1000);
    }
}
