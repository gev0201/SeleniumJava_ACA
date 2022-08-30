package Test;

import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

public class Asertions {
//    WebDriver driver;
//    @Test
//    public void hardAssertion(){
////        ArrayList<String> aa = new ArrayList<>();
////        String a = null;
////        a = "";
////        Assert.assertTrue(true, "The condition is FALSE");
////        Assert.assertEquals(5, 5, "The numbers is not equal");
////        Assert.assertNotNull(driver);
//        Assert.fail();
//
//    }

    @Test
    public void softAssertion(){
        SoftAssert softAssertion= new SoftAssert();
        softAssertion.assertTrue(false);
        softAssertion.assertEquals(5,5);
        softAssertion.assertNotEquals(3,3);
        Assert.assertTrue(false);
        softAssertion.assertAll();


    }
}
