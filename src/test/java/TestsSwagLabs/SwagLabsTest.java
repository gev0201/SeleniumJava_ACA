package TestsSwagLabs;

import Base.SeleniumBase;
import Page.*;
import Utils.Helpers;
import org.testng.annotations.Test;

import java.util.Map;

public class SwagLabsTest extends SeleniumBase {

    SwagLabLoginPage swagLabLoginPage;
    BasePage basePage;
    SwagLabsProducts swagLabsProducts;
    Helpers helpers = new Helpers();


    @Test
    public void BlazeDemoTest() {
        basePage = new BasePage(driver);
        swagLabLoginPage = new SwagLabLoginPage(driver);
        swagLabsProducts = new SwagLabsProducts(driver);
        swagLabLoginPage.login();
        swagLabsProducts.checkIsWebPageOpened("PRODUCTS");
        swagLabsProducts.filter("Price (low to high)");
        swagLabsProducts.addToCard("Sauce Labs Bolt T-Shirt");
        swagLabsProducts.goToCard();
        swagLabsProducts.checkIsItemAddedToCard();
        swagLabsProducts.processCheckout();

    }

}
