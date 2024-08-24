package Appium.stepdef;

import Appium.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Appium.stepdef.LoginStepDef.driver;

public class TransferStepDef {

    @And("user click transfer button and transfer to new target")
    public void user_click_transfer_button_and_transfer_to_new_target(){
        HomePage homePage = new HomePage(driver);
        homePage.clickTransferButton();
    }

    @When("user input information and target rekening")
    public void user_input_information_and_target_rekening(){
        HomePage homePage = new HomePage(driver);
        homePage.inputInformationAndTargetRekening("1111111155", "10000", "testing automation", "123456");
    }

    @Then("user success transfer")
    public void user_success_transfer(){
        HomePage homePage = new HomePage(driver);
        homePage.validationTransferSuccess();
        driver.terminateApp("com.example.satu");
    }
}
