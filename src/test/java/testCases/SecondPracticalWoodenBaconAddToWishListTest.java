package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.PracticalWoodenBaconWishListPage;
import pages.SecondPracticalWoodenBaconAddToWishListPage;

public class SecondPracticalWoodenBaconAddToWishListTest extends BasePage {

    private SecondPracticalWoodenBaconAddToWishListPage secondPracticalWoodenBaconAddToWishListPage;

    @BeforeMethod
    public void setUp() {
        super.setUp ();
       secondPracticalWoodenBaconAddToWishListPage = new SecondPracticalWoodenBaconAddToWishListPage ( driver );
    }

    @Test

    public void PracticalWoodenBaconWish() {
        driver.get("https://fasttrackit-test.netlify.app/#/product/6");
        secondPracticalWoodenBaconAddToWishListPage.clickOnSecondPracticalWoodenBaconWishList ();
        Assert.assertEquals ( "Success", "Success" );
    }
}




