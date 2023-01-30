import functionLibrary.CommonFunctions;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    CommonFunctions commonFunctions = new CommonFunctions();

    @Before
    public void BeforeTest() {
        commonFunctions.openBrowser();
    }

    @After
    public void afterTest() {
        commonFunctions.closeBrowser();
    }
}
