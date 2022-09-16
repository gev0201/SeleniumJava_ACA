package Page;

import Utils.Helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class BankPage {
    public BankPage(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;
    BasePage basePage;
    Helpers helpers = new Helpers();

    public void goToBankProject(Map credentials){
        basePage  = new BasePage(driver);
        basePage.clickOnElement("text", "Bank Project");
        String login = (String) credentials.get("login");
        String password = (String) credentials.get("password");
        basePage.insertInto("name", "uid", login);
        basePage.insertInto("name", "password", password);
        basePage.clickOnElement("name", "btnLogin");
    }
}
