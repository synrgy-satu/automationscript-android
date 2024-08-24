package Appium.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    AndroidDriver driver;
    WebDriverWait wait;

    By userWelcomeText = By.xpath("//*[@text='GILANGTESTING']");
    By transferButton = By.xpath("(//*[@content-desc='Tombol fitur transfer'])[1]");
    By transferToBCAButton = AppiumBy.id("com.example.satu:id/btnTfBca");
    By transferToNewTargetButton = AppiumBy.id("com.example.satu:id/btn_add");
    By targetRekeningField = AppiumBy.id("com.example.satu:id/et_add_number");
    By lanjutkanButton = AppiumBy.id("com.example.satu:id/btn_next");
    By nominalField = AppiumBy.id("com.example.satu:id/et_nominal");
    By catatanField = AppiumBy.id("com.example.satu:id/et_catatan");
    By lanjutkan2Button = AppiumBy.id("com.example.satu:id/btn_next");
    By konfirmasiButton = AppiumBy.id("com.example.satu:id/btn_confirm");
    By pinField = AppiumBy.id("com.example.satu:id/et_verif_pin");
    By bayarButton = AppiumBy.id("com.example.satu:id/btn_lanjut");
    By transferBerhasil = By.xpath("//*[@text='Transfer Berhasil']");

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public String getUserWelcomeText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(userWelcomeText));

        return driver.findElement(userWelcomeText).getText();
    }

    public void clickTransferButton() {
        driver.findElement(transferButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(transferToBCAButton));
        driver.findElement(transferToBCAButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(transferToNewTargetButton));
        driver.findElement(transferToNewTargetButton).click();
    }

    public void inputInformationAndTargetRekening(String rekeningTujuan, String nominal, String catatan, String PIN){
        wait.until(ExpectedConditions.visibilityOfElementLocated(targetRekeningField));
        driver.findElement(targetRekeningField).sendKeys(rekeningTujuan);
        driver.findElement(lanjutkanButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(nominalField));
        driver.findElement(nominalField).sendKeys(nominal);
        driver.findElement(catatanField).sendKeys(catatan);
        driver.findElement(lanjutkan2Button).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(konfirmasiButton));
        driver.findElement(konfirmasiButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(pinField));
        driver.findElement(pinField).sendKeys(PIN);
        driver.findElement(bayarButton).click();
    }

    public void validationTransferSuccess(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(transferBerhasil));
        driver.findElement(transferBerhasil).isDisplayed();
    }
}
