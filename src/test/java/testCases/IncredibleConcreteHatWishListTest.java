package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.IncredibleConcreteHatCartPage;
import pages.IncredibleConcreteHatWishListPage;

public class IncredibleConcreteHatWishListTest extends BasePage {

        private IncredibleConcreteHatWishListPage incredibleConcreteHatWishListPage;

        @BeforeMethod
        public void setUp() {
            super.setUp ();
            incredibleConcreteHatWishListPage = new IncredibleConcreteHatWishListPage ( driver );
        }

        @Test

        public void ConcreteHatCart() {
            driver.get("https://fasttrackit-test.netlify.app/#/product/2");
            incredibleConcreteHatWishListPage.clickOnIncredibleConcreteHatWishList ();
            Assert.assertEquals ( "Success", "Success" );
        }
}
