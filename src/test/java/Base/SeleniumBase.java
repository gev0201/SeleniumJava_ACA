package Base;

import Utils.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class SeleniumBase {

    public WebDriver driver;
    Helpers helpers = new Helpers();


    /**
     * This is the main method to init the WebDriver
     */
    @BeforeTest
    public void InitDriver() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
//        helpers.loging().info("Driver initialized");
    }

    /**
     * This is the main method to quit the WebDriver
     */
    @AfterTest
    public void quitDriver() {
        driver.quit();
    }

}
