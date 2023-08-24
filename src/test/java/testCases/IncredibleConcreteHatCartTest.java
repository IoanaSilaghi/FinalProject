package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.GorgeousSoftPizzaCartPage;
import pages.IncredibleConcreteHatCartPage;

public class IncredibleConcreteHatCartTest extends BasePage {

    private IncredibleConcreteHatCartPage incredibleConcreteHatCartPage;

    @BeforeMethod
    public void setUp() {
        super.setUp ();
        incredibleConcreteHatCartPage = new IncredibleConcreteHatCartPage ( driver );
    }

    @Test

    public void ConcreteHatCart() {
        driver.get("https://fasttrackit-test.netlify.app/#/product/2");
        incredibleConcreteHatCartPage.clickOnIncredibleConcreteHatCart ();
        Assert.assertEquals ( "Success", "Success" );
    }
}

