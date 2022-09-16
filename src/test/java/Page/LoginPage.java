package Page;

import Utils.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;
    BasePage basePage;
    Helpers helpers = new Helpers();

    public void login(){
        basePage  = new BasePage(driver);
        basePage.getUrl("https://demo.guru99.com/");
        basePage.checkPageTitle("Guru99 Bank Home Page");
        basePage.insertInto("name", "emailid", helpers.randomStr(8) + "@mail.ccc");
        basePage.clickOnElement("name", "btnLogin");
    }

    public Map getCredentials(){
        basePage  = new BasePage(driver);
        login();
        Map<String, String> credentials = new HashMap<>();
        WebElement loginWebElement = basePage.getElement("css", "tr:nth-child(4)  td[align='center']:nth-child(2)");
        WebElement password = basePage.getElement("css", "tr:nth-child(5)  td[align='center']:nth-child(2)");
        credentials.put("login", loginWebElement.getText());
        credentials.put("password", password.getText());
        return credentials;
    }
}
