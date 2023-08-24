package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;

public class SearchTest extends BasePage {

    @Test
    public void testAutocomplete() {
        //driver.get("https://fasttrackit-test.netlify.app/#/");
        WebElement inputField = driver.findElement(By.id("input-search"));
        Actions actions = new Actions(driver);
        actions.sendKeys(inputField, Keys.ENTER).perform();
        //String expectedText = "You entered: CHAIR";
       // WebElement resultText = driver.findElement(By.id("chair"));
        //String actualText = resultText.getText();

        //Assert.assertEquals(actualText, expectedText,  "Entered text is not as expected");
    }
}

