package Appium.stepdef;

import Appium.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Appium.stepdef.LoginStepDef.driver;

public class MutationStepDef {

    @And("user click mutation button")
    public void userClickMutationButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.clickMutationButton();
    }

    @And("user click input information for mutation")
    public void userClickInputInformationForMutation() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.inputInformationMutation();
    }

    @When("user input PIN")
    public void userInputPIN() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.inputPIN();
    }

    @Then("user can check the mutation")
    public void userCanCheckTheMutation(){
        HomePage homePage = new HomePage(driver);
        homePage.mutationIsDisplayed();
        driver.terminateApp("com.example.satu");
    }
}
