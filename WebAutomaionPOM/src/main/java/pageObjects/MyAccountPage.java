package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    public MyAccountPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//span[text()='Customer Number:']")
    public WebElement customerNumberLabel;

    public void myAccountPageLandingValidation()
    {
        Assert.assertTrue(customerNumberLabel.isDisplayed());
    }
}
