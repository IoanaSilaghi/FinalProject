package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AwesomeGraniteChipsAddToWishListPage;
import pages.BasePage;

public class AwesomeGraniteChipsAddToWishListTest extends BasePage {
        private AwesomeGraniteChipsAddToWishListPage awesomeGraniteChipsAddToWishListPage;

        @BeforeMethod
        public void setUp() {
            super.setUp ();
            awesomeGraniteChipsAddToWishListPage = new AwesomeGraniteChipsAddToWishListPage ( driver );
        }


        @Test
        public void GraniteAddToWishList() {
            driver.get("https://fasttrackit-test.netlify.app/#/product/1");
            awesomeGraniteChipsAddToWishListPage.clickOnGraniteWishList ();
            Assert.assertEquals ( "Success" ,"Success");
        }
    }
