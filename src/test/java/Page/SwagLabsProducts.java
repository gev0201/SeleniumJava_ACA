package Page;

import Utils.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SwagLabsProducts {

    public SwagLabsProducts(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;
    BasePage basePage;
    Helpers helpers = new Helpers();

    public void checkIsWebPageOpened(String pageTitle){
        basePage = new BasePage(driver);
        String pageHeader = basePage.getElement("css", ".title").getText();
        Assert.assertEquals(pageTitle, pageHeader, "The PRODUCTS page is not opened");
    }

    public void filter(String filterValue){
        basePage = new BasePage(driver);
        basePage.selectFromDropDown("css", "[data-test='product_sort_container']", filterValue);
    }

    public void addToCard(String name){
        basePage = new BasePage(driver);
        List<WebElement> items =  basePage.getElements("css", ".inventory_item_description");
        for (WebElement itm : items) {
            if (itm.getText().contains(name)){
                itm.findElement(By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt")).click();
            }
        }
    }

    public void goToCard(){
        basePage = new BasePage(driver);
        basePage.clickOnElement("css", ".shopping_cart_link");
        checkIsWebPageOpened("YOUR CART");
    }

    public void checkIsItemAddedToCard(){
        basePage = new BasePage(driver);
        WebElement itm = basePage.getElement("css", ".inventory_item_name");
        Assert.assertNotNull(itm);
    }

    public void processCheckout(){
        basePage = new BasePage(driver);
        basePage.clickOnElement("id", "checkout");
        checkIsWebPageOpened("CHECKOUT: YOUR INFORMATION");
        basePage.insertInto("id", "first-name", "aaa");
        basePage.insertInto("id", "last-name", "bbbb");
        basePage.insertInto("id", "postal-code", "11111");
        basePage.clickOnElement("id", "continue");
        checkIsWebPageOpened("CHECKOUT: OVERVIEW");
        basePage.checkElemetText("css", ".inventory_item_price", "$15.99");
        basePage.clickOnElement("id", "finish");
        checkIsWebPageOpened("CHECKOUT: COMPLETE!");
    }
}
