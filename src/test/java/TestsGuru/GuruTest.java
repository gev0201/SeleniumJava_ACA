package TestsGuru;

import Base.SeleniumBase;
import Page.BankPage;
import Page.BasePage;
import Page.LoginPage;
import Utils.Helpers;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class GuruTest extends SeleniumBase {

    static Logger log = Logger.getLogger(GuruTest.class.getName());

    LoginPage loginPage;
    BasePage basePage;
    BankPage bankPage;
    Helpers helpers = new Helpers();

//    @BeforeClass
//    public void setupDriver() {
//        InitDriver();
//    }
//
//    @AfterClass
//    public void tearDown() {
//        quitDriver();
//    }

    @Test
    public void BlazeDemoTest() {
        log.info("Starting Test ------------------------------");
        basePage = new BasePage(driver);
        loginPage = new LoginPage(driver);
        bankPage = new BankPage(driver);
        Map<String, String> credentials = loginPage.getCredentials();
        bankPage.goToBankProject(credentials);
    }


    @Test
    public void mmm(){
        Map<String, String> mm = new HashMap<>();
        mm.put("Name", "Gevorg");
        mm.put("Surname", "Gevorgyan");
        mm.put("age", "39");
        mm.put("ocupation", "esim inch");
        String ss = mm.get("age");
        System.out.println(ss);
    }

}
