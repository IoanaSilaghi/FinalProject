package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AwesomeSoftShirtAddToCartPage;
import pages.AwesomeSoftShirtAddToWishListPage;
import pages.BasePage;

public class AwesomeSoftShirtAddToWishListTest extends BasePage {


        private AwesomeSoftShirtAddToWishListPage awesomeSoftShirtAddToWishListPage;

        @BeforeMethod
        public void setUp() {
            super.setUp ();
            awesomeSoftShirtAddToWishListPage = new AwesomeSoftShirtAddToWishListPage( driver );
        }

        @Test
        public void testAutocomplete() {
            driver.get ( "https://fasttrackit-test.netlify.app/#/product/5" );
            awesomeSoftShirtAddToWishListPage.clickOnAwesomeSoftShirtWishList ();
            Assert.assertEquals ( "Success", "Success" );
        }
    }

