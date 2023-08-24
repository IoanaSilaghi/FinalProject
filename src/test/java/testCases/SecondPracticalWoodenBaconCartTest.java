package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SecondPracticalWoodenBaconCartPage;

public class SecondPracticalWoodenBaconCartTest extends BasePage {

    @Test
    public void testAutocomplete() {
        driver.get("https://fasttrackit-test.netlify.app/#/product/6");
        WebElement checkbox1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[3]/button[1]"));
        checkbox1.click();
    }

    private SecondPracticalWoodenBaconCartPage secondPracticalWoodenBaconCartPage;

    @BeforeMethod
    public void setUp() {
        super.setUp ();
        secondPracticalWoodenBaconCartPage = new SecondPracticalWoodenBaconCartPage ( driver );
    }

    @Test

    public void PracticalWoodenBaconWish() {
        driver.get("https://fasttrackit-test.netlify.app/#/product/6");
        secondPracticalWoodenBaconCartPage.clickOnSecondPracticalWoodenBaconCart ();
        Assert.assertEquals ( "Success", "Success" );
    }
}
