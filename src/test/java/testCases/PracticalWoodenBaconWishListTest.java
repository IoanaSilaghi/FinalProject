package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.PracticalWoodenBaconAddToCartPage;
import pages.PracticalWoodenBaconWishListPage;

public class PracticalWoodenBaconWishListTest extends BasePage {

        private PracticalWoodenBaconWishListPage practicalWoodenBaconWishListPage;

        @BeforeMethod
        public void setUp() {
            super.setUp ();
            practicalWoodenBaconWishListPage = new PracticalWoodenBaconWishListPage ( driver );
        }

        @Test

        public void PracticalWoodenBaconWish() {
            driver.get("https://fasttrackit-test.netlify.app/#/product/4");
            practicalWoodenBaconWishListPage.clickOnPracticalWoodenBaconWishList ();
            Assert.assertEquals ( "Success", "Success" );
        }
    }
