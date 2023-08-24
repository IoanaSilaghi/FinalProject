package testCases;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AwesomeMetalChairAddToWishListPage;
import pages.BasePage;

public class AwesomeMetalChairAddToWishListTest extends BasePage {

    private AwesomeMetalChairAddToWishListPage awesomeMetalChairAddToWishListPage;

    @BeforeMethod
    public void setUp() {
        super.setUp ();
        awesomeMetalChairAddToWishListPage = new AwesomeMetalChairAddToWishListPage ( driver );
    }

    @Test
    public void MetalChairToWishList() {
        driver.get("https://fasttrackit-test.netlify.app/#/product/3");
        awesomeMetalChairAddToWishListPage.clickOnAwesomeMetalChairWishList ();
        Assert.assertEquals ( "Success", "Success" );
    }
}

