package stepDefintions;

import functionLibrary.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.*;



public class LoginSteps extends CommonFunctions {

    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);
    MyAccountPage myAccountPage = new MyAccountPage(driver);

    @Given("I'm on open homepage {string}")
    public void i_m_on_open_homepage(String url) throws Exception{
        driver.get(url);
        takeScreenShot("homepage.jpg");
    }

    @When("I click my account link on header")
    public void i_click_my_account_link_on_header() throws Exception {
        homePage.clickMyAccountLink();
        loginPage.validateLoginPageLanding();
        takeScreenShot("loginpage.jpg");
    }

    @When("I enter username {string}")
    public void i_enter_username(String username) {
        loginPage.enterUsername(username);
    }

    @When("I enter password {string}")
    public void i_enter_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("I click sign in button")
    public void i_click_sign_in_button() {
        loginPage.clickSignInBtn();
    }

    @Then("should login successfully and should be re-directed to account page with text as {string}")
    public void should_login_successfully_and_should_be_re_directed_to_account_page_with_text_as(String expectedLoginText) throws Exception{
        myAccountPage.myAccountPageLandingValidation();
        takeScreenShot("aftervalidLogin.jpg");
    }

    @Then("shouldn't  login successfully with text as {string}")
    public void shouldn_t_login_successfully_with_text_as(String expectedLoginErrorText) throws Exception {
        loginPage.validateLoginFailure(expectedLoginErrorText);
        takeScreenShot("afterInvalidLogin.jpg");
    }

    @Then("I shouldn't get re-directed anywhere and stay on  login page")
    public void i_shouldn_t_get_re_directed_anywhere_and_stay_on_login_page() {
        loginPage.validateLoginPageLanding();
    }


}
