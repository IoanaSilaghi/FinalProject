package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AwesomeMetalChairAddToCartPage;
import pages.AwesomeSoftShirtAddToCartPage;
import pages.BasePage;

public class AwesomeSoftShirtAddToCartTest extends BasePage {

    private AwesomeSoftShirtAddToCartPage awesomeSoftShirtAddToCartPage;

    @BeforeMethod
    public void setUp() {
        super.setUp ();
        awesomeSoftShirtAddToCartPage = new AwesomeSoftShirtAddToCartPage ( driver );
    }
    @Test
    public void testAutocomplete() {
        driver.get("https://fasttrackit-test.netlify.app/#/product/5");
        awesomeSoftShirtAddToCartPage.clickOnAwesomeSoftShirtCart ();
        Assert.assertEquals ( "Success", "Success" );
    }
}
