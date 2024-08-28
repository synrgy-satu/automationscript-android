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
    By transferButton = By.xpath("(//*[@content-desc='Tombol fitur transfer'])[2]");
    By transferToBCAButton = AppiumBy.id("com.example.satu:id/btnTfBca");
    By transferToNewTargetButton = AppiumBy.id("com.example.satu:id/btn_add");
    By targetRekeningField = AppiumBy.id("com.example.satu:id/et_add_number");
    By lanjutkanButton = AppiumBy.id("com.example.satu:id/btn_next");
    By nominalField = AppiumBy.id("com.example.satu:id/et_nominal");
    By catatanField = AppiumBy.id("com.example.satu:id/et_catatan");
    By lanjutkan2Button = AppiumBy.id("com.example.satu:id/btn_next");
    By konfirmasiButton = AppiumBy.id("com.example.satu:id/btn_confirm");
    By transferBerhasil = By.xpath("//*[@text='Transfer Berhasil']");

    By mutationButton = By.xpath("(//*[@content-desc='Tombol fitur mutasi'])[2]");
    By sumberRekeningMutationButton = By.xpath("//*[@content-desc='Pilih sumber rekening']");
    By gilangtestingButton = By.xpath("//*[@text='GILANGTESTING']");
    By periodeMutasiButton = By.xpath("//*[@text='Pilih rentang tanggal']");
    By selectHariIni = AppiumBy.id("com.example.satu:id/rbTodayDateRange");
    By pilihButton = AppiumBy.id("com.example.satu:id/applyButton");
    By jenisTransaksiButton = AppiumBy.id("com.example.satu:id/tvMutationAccountTransactionType");
    By selectSemua = AppiumBy.id("com.example.satu:id/rbAll");
    By checkMutasiButton = AppiumBy.id("com.example.satu:id/btnCheckMutation");
    By inputPIN1field = AppiumBy.id("com.example.satu:id/tvPassword1");
    By inputPIN1 = AppiumBy.id("com.example.satu:id/tvNumber1");
    By inputPIN2 = AppiumBy.id("com.example.satu:id/tvNumber2");
    By inputPIN3 = AppiumBy.id("com.example.satu:id/tvNumber3");
    By inputPIN4 = AppiumBy.id("com.example.satu:id/tvNumber4");
    By inputPIN5 = AppiumBy.id("com.example.satu:id/tvNumber5");
    By inputPIN6 = AppiumBy.id("com.example.satu:id/tvNumber6");
    By mutationList = By.xpath("(//*[@class='android.widget.LinearLayout'])[16]");

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public String getUserWelcomeText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(userWelcomeText));

        return driver.findElement(userWelcomeText).getText();
    }

    public void clickTransferButton() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(transferButton));
        driver.findElement(transferButton).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(transferToBCAButton));
        driver.findElement(transferToBCAButton).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(transferToNewTargetButton));
        driver.findElement(transferToNewTargetButton).click();
    }

    public void inputInformationAndTargetRekening(String rekeningTujuan, String nominal, String catatan) throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(targetRekeningField));
        driver.findElement(targetRekeningField).sendKeys(rekeningTujuan);
        driver.findElement(lanjutkanButton).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(nominalField));
        driver.findElement(nominalField).sendKeys(nominal);
        driver.findElement(catatanField).sendKeys(catatan);
        driver.findElement(lanjutkan2Button).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(konfirmasiButton));
        driver.findElement(konfirmasiButton).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputPIN1field));
        driver.findElement(inputPIN1field).click();
        driver.findElement(inputPIN1).click();
        driver.findElement(inputPIN2).click();
        driver.findElement(inputPIN3).click();
        driver.findElement(inputPIN4).click();
        driver.findElement(inputPIN5).click();
        driver.findElement(inputPIN6).click();
    }

    public void validationTransferSuccess() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(transferBerhasil));
        driver.findElement(transferBerhasil).isDisplayed();
    }

    public void clickMutationButton() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(mutationButton));
        driver.findElement(mutationButton).click();
    }

    public void inputInformationMutation() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkMutasiButton));
        driver.findElement(sumberRekeningMutationButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(gilangtestingButton));
        driver.findElement(gilangtestingButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(periodeMutasiButton));
        driver.findElement(periodeMutasiButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectHariIni));
        driver.findElement(selectHariIni).click();
        driver.findElement(pilihButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(jenisTransaksiButton));
        driver.findElement(jenisTransaksiButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectSemua));
        driver.findElement(selectSemua).click();
        driver.findElement(pilihButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkMutasiButton));
        driver.findElement(checkMutasiButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputPIN1field));
    }

    public void inputPIN() throws InterruptedException {
        driver.findElement(inputPIN1field).click();
        driver.findElement(inputPIN1).click();
        driver.findElement(inputPIN2).click();
        driver.findElement(inputPIN3).click();
        driver.findElement(inputPIN4).click();
        driver.findElement(inputPIN5).click();
        driver.findElement(inputPIN6).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(mutationList));
    }

    public void mutationIsDisplayed(){
        driver.findElement(mutationList).isDisplayed();
    }
}
