package pageObjects;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegistrationPage {

    public RegistrationPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="")
    public WebElement titleSlct;

    @FindBy(id="")
    public WebElement firstnameTxtFld;

    @FindBy(id="")
    public WebElement lastNameTxtFld;

    @FindBy(id="")
    public WebElement emailTxtFld;

    @FindBy(id="")
    public WebElement passwordTxtFld;


    public void provideRegistrationData (DataTable regDataTable)
    {     //   0   1      2    3                      4            5
         //   |Mr|George|Lynn|georgeLynn@sample.com|georgelynn1$|24 06 90|

        //List, Set, Map, Array

        List<List<String>> rows = regDataTable.asLists();

        for(List<String> row : rows)
        {
            new Select(titleSlct).selectByVisibleText(row.get(0));
            firstnameTxtFld.sendKeys(row.get(1));
            lastNameTxtFld.sendKeys(row.get(2));
            emailTxtFld.sendKeys(row.get(3));
            passwordTxtFld.sendKeys(row.get(4));
        }
    }
}
