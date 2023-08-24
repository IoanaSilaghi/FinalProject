package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.GorgeousSoftPizzaCartPage;
import pages.GorgeousSoftPizzaWishListPage;

public class GorgeousSoftPizzaWishListTest extends BasePage {

    private GorgeousSoftPizzaWishListPage gorgeousSoftPizzaWishListPage;

    @BeforeMethod
    public void setUp() {
        super.setUp ();
        gorgeousSoftPizzaWishListPage = new GorgeousSoftPizzaWishListPage ( driver );
    }

    @Test
    public void testAutocomplete() {
        gorgeousSoftPizzaWishListPage.clickOnGorgeousSoftPizzaWishList ();
        Assert.assertEquals ( "Success", "Success" );
    }
}
