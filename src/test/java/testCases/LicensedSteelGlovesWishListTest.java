package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LicensedSteelGlovesCartPage;
import pages.LicensedSteelGlovesWishListPage;

public class LicensedSteelGlovesWishListTest extends BasePage {

    private LicensedSteelGlovesWishListPage licensedSteelGlovesWishListPage;

    @BeforeMethod
    public void setUp() {
        super.setUp ();
        licensedSteelGlovesWishListPage = new LicensedSteelGlovesWishListPage ( driver );
    }

    @Test

    public void LicensedSteelGlovesWishList() {
        driver.get("https://fasttrackit-test.netlify.app/#/product/8");
        licensedSteelGlovesWishListPage.clickOnLicensedSteelGlovesWishList ();
        Assert.assertEquals ( "Success", "Success" );
    }
}