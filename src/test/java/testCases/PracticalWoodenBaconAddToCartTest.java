package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LicensedSteelGlovesCartPage;
import pages.PracticalWoodenBaconAddToCartPage;

public class PracticalWoodenBaconAddToCartTest extends BasePage {

    private PracticalWoodenBaconAddToCartPage practicalWoodenBaconAddToCartPage;

    @BeforeMethod
    public void setUp() {
        super.setUp ();
        practicalWoodenBaconAddToCartPage = new PracticalWoodenBaconAddToCartPage ( driver );
    }

    @Test

    public void PracticalWoodenBaconCart() {
        driver.get("https://fasttrackit-test.netlify.app/#/product/4");
        practicalWoodenBaconAddToCartPage.clickOnPracticalWoodenBaconCart ();
        Assert.assertEquals ( "Success", "Success" );
    }
}

