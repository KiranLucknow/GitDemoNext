package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//span[@class='customerText']")
    public WebElement existingCustomerText;

    @FindBy(name="EmailOrAccountNumber")
    public WebElement usernameTxtFld;

    @FindBy(name="Password")
    public WebElement passwordTxtFld;

    @FindBy(name="SignInNow")
    public WebElement signInBtn;

    @FindBy(xpath="")
    public WebElement rememberEmailCheckBox;

    @FindBy(xpath="")
    public WebElement forgotPasswordLnk;

    @FindBy(xpath="//a[text()='now']")
    public WebElement registerNowBtn;

    @FindBy(xpath="//div[@class='SignInTo']/div/div/span")
    public WebElement loginFailureMsg;

    public void validateLoginPageLanding()
    {
        Assert.assertTrue(existingCustomerText.isDisplayed());
    }

    public void enterUsername(String username)
    {
        usernameTxtFld.sendKeys(username);
    }

    public void enterPassword(String password)
    {
        passwordTxtFld.sendKeys(password);
    }

    public void clickSignInBtn()
    {
        signInBtn.click();
    }

    public void validateLoginFailure(String expectedLoginFailureMsg)
    {
        String actualLoginFailureText = loginFailureMsg.getText();
        Assert.assertEquals(expectedLoginFailureMsg, actualLoginFailureText);
    }

    public void clickRegisterNowBtn()
    {
        registerNowBtn.click();
    }

}
