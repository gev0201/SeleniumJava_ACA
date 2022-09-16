package Page;

import Utils.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class SwagLabLoginPage {

    public SwagLabLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;
    BasePage basePage;
    Helpers helpers = new Helpers();

    public void getSwagLabs() {
        basePage = new BasePage(driver);
        basePage.getUrl("https://www.saucedemo.com/");
        basePage.checkPageTitle("Swag Labs");
    }

    public Map getCredentials() {
        basePage = new BasePage(driver);
        WebElement user = basePage.getElement("css", "#login_credentials");
        String usr = user.getText().split("\n")[1];
        WebElement pass = basePage.getElement("css", ".login_password");
        String password = pass.getText().split("\n")[1];
        Map<String, String> credentials = new HashMap<>();
        credentials.put("user", usr);
        credentials.put("pass", password);
        return credentials;
    }

    public void login() {
        basePage = new BasePage(driver);
        getSwagLabs();
        Map<String, String> creds = new HashMap<>();
        creds = getCredentials();
        basePage.insertInto("id", "user-name", creds.get("user"));
        basePage.insertInto("id", "password", creds.get("pass"));
        basePage.clickOnElement("id", "login-button");

    }
}
