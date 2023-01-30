package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public WebDriver localDriver;

    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.localDriver = driver;
    }

    @FindBy(id="header-logo")
    public WebElement logoIcon;

    @FindBy(id="sli_search_1")
    public WebElement searchTxtFld;

    @FindBy(className="SearchButton")
    public WebElement searchIcon;

    @FindBy(linkText="My Account")
    public WebElement myAccountLnk;

    @FindBy(id="helpsite")
    public WebElement helpLink;

    @FindBy(linkText="Store Locator")
    public WebElement storeLocatorLink;

    @FindBy(xpath="//a[@data-link-name='Shopping Bag']")
    public WebElement bagIcon;

    @FindBy(linkText="Checkout")
    public WebElement checkoutBtn;

    @FindBy(xpath="//div[@class='flagContainer']")
    public WebElement languageIcon;


    public void clickLogo()
    {
        logoIcon.click();
    }

    public void assertLogo()
    {
        Assert.assertTrue(logoIcon.isDisplayed());
    }

    public void typeSearchTerm(String searchTerm)
    {
        searchTxtFld.sendKeys(searchTerm);
    }

    public void validatePlaceHolderInSearchFld(String expectedPlaceholder)
    {
        String actualPlaceholderText = searchTxtFld.getAttribute("placeholder");
        Assert.assertEquals(expectedPlaceholder, actualPlaceholderText);
    }

    public void clickSearchIcon()
    {
        searchIcon.click();
    }

    public void clickMyAccountLink()
    {
        myAccountLnk.click();
    }

    public void clickHelpLink()
    {
        Actions actions = new Actions(localDriver);
        actions.moveToElement(helpLink).build().perform();
        //localDriver.switchTo().alert().accept();
        localDriver.switchTo().frame(2);
        helpLink.click();
    }

    public void clickHeaderLinks(String linkText)
    {
        //localDriver.switchTo().parentFrame();
        localDriver.findElement(By.xpath("//a[text()='"+linkText+"']")).click();
    }

    public void headerLinksReDirectionVal(String expectedPageTitle)
    {
        String actualPageTitle = localDriver.getTitle();
        Assert.assertTrue(actualPageTitle.contains(expectedPageTitle));
    }


}
