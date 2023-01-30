package stepDefintions;

import functionLibrary.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.*;


public class RegistrationTestSteps extends CommonFunctions {

    LoginPage loginPage = new LoginPage(driver);
    RegistrationPage registrationPage = new RegistrationPage(driver);

    @When("I click register now button")
    public void i_click_register_now_button() {
     loginPage.clickRegisterNowBtn();
    }
    @When("I provide data for registration")
    public void i_provide_data_for_registration(io.cucumber.datatable.DataTable dataTable) {
        registrationPage.provideRegistrationData(dataTable);
    }
    @When("I click register button")
    public void i_click_register_button() {
     
    }
    @Then("I should get registered successfully")
    public void i_should_get_registered_successfully() {
     
    }
}
