package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.BasePage;


public class AddToCartTest extends BasePage {

    private AddToCartPage addToCartPage;

    @BeforeMethod
    public void setUp() {
        super.setUp ();
        addToCartPage = new AddToCartPage ( driver );
    }

    @Test
    public void AddtoCart() {
        driver.get("https://fasttrackit-test.netlify.app/#/product/9");
        addToCartPage.clickOnCheckBox ();
        Assert.assertEquals ( "Success" ,"Success");
    }
}