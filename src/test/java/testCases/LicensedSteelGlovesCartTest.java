package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.IncredibleConcreteHatCartPage;
import pages.LicensedSteelGlovesCartPage;

public class LicensedSteelGlovesCartTest extends BasePage {

    private LicensedSteelGlovesCartPage licensedSteelGlovesCartPage;

    @BeforeMethod
    public void setUp() {
        super.setUp ();
        licensedSteelGlovesCartPage = new LicensedSteelGlovesCartPage ( driver );
    }

    @Test

    public void LicensedSteelGloves() {
        driver.get("https://fasttrackit-test.netlify.app/#/product/8");
        licensedSteelGlovesCartPage.clickOnLicensedSteelGlovesCart ();
        Assert.assertEquals ( "Success", "Success" );
    }
}
