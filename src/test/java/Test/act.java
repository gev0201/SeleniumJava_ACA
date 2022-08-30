package Test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class act {
    @Test
    public void asc() {
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement td_Home = driver
                .findElement(By
                        .xpath("//html/body/div"
                                + "/table/tbody/tr/td"
                                + "/table/tbody/tr/td"
                                + "/table/tbody/tr/td"
                                + "/table/tbody/tr"));

        Actions builder = new Actions(driver);
        Action mouseOverHome = builder
                .moveToElement(link_Home)
                .build();

        String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);
        mouseOverHome.perform();
        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
        driver.close();
    }

    @Test
    public void fb(){
        String baseUrl = "http://www.facebook.com/";
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        WebElement txtUsername = driver.findElement(By.id("email"));

        Actions builder = new Actions(driver);
        builder.moveToElement(txtUsername);
        builder.click();
        builder.keyDown(txtUsername, Keys.SHIFT);
        builder.sendKeys(txtUsername, "hello");
        builder.keyUp(txtUsername, Keys.SHIFT);
        builder.doubleClick(txtUsername);
        builder.contextClick();
        Action seriesOfActions = builder
                .build();

        seriesOfActions.perform() ;

    }

//    @Test
//    public void Login()
//    {
//        WebDriver driver= new ChromeDriver();
//
//        //Creating the JavascriptExecutor interface object by Type casting
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//
//        //Launching the Site.
//        driver.get("http://demo.guru99.com/V4/");
//
//        WebElement button =driver.findElement(By.name("btnLogin"));
//
//        //Login to Guru99
//        driver.findElement(By.name("uid")).sendKeys("mngr34926");
//        driver.findElement(By.name("password")).sendKeys("amUpenu");
//
//        //Perform Click on LOGIN button using JavascriptExecutor
//        js.executeScript("arguments[0].click();", button);
//
//        //To generate Alert window using JavascriptExecutor. Display the alert message
//        js.executeScript("alert('Welcome to Guru99');");
//
//    }
@Test
    public void Login()
    {
        WebDriver driver= new ChromeDriver();

        //Creating the JavascriptExecutor interface object by Type casting
        JavascriptExecutor js = (JavascriptExecutor)driver;

        //Launching the Site.
        driver.get("http://demo.guru99.com/V4/");

        //Fetching the Domain Name of the site. Tostring() change object to name.
        String DomainName = js.executeScript("return document.domain;").toString();
        System.out.println("Domain name of the site = "+DomainName);

        //Fetching the URL of the site. Tostring() change object to name
        String url = js.executeScript("return document.URL;").toString();
        System.out.println("URL of the site = "+url);

        //Method document.title fetch the Title name of the site. Tostring() change object to name
        String TitleName = js.executeScript("return document.title;").toString();
        System.out.println("Title of the page = "+TitleName);


        //Navigate to new Page i.e to generate access page. (launch new url)
        js.executeScript("window.location = 'http://demo.guru99.com/'");
    }
}
