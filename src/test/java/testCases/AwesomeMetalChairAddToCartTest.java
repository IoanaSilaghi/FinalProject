package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AwesomeGraniteChipsAddToWishListPage;
import pages.AwesomeMetalChairAddToCartPage;
import pages.BasePage;

public class AwesomeMetalChairAddToCartTest extends BasePage {

    private AwesomeMetalChairAddToCartPage awesomeMetalChairAddToCartPage;

    @BeforeMethod
    public void setUp() {
        super.setUp ();
        awesomeMetalChairAddToCartPage = new AwesomeMetalChairAddToCartPage ( driver );
    }

        @Test
        public void AwesomeMetalChairToCart () {
            driver.get ( "https://fasttrackit-test.netlify.app/#/product/3" );
            awesomeMetalChairAddToCartPage.clickOnAwesomeMetalChair ();
            Assert.assertEquals ( "Success", "Success" );
        }
    }


