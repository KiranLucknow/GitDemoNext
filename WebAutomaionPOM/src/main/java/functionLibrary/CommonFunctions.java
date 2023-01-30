package functionLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class CommonFunctions {

    public static WebDriver driver;

    public static String errorShotsPath = new File("src/main/resources/errShots").getAbsolutePath();

    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        //Dimension dimension = new Dimension(700, 450);
        driver = new ChromeDriver();
        //driver.manage().window().setSize(dimension);
    }

    public void closeBrowser()
    {
        driver.quit();
    }

    public void takeScreenShot(String fileName) throws Exception
    {
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File srcFile = screenshot.getScreenshotAs(OutputType.fileName);

        File destFile = new File(errorShotsPath + "/"+ fileName);

        FileUtils.copyFile(srcFile, destFile);

    }
}
