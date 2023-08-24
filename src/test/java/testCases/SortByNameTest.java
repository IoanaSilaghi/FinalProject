package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;

public class SortByNameTest extends BasePage {

    @Test
    public void testAutocomplete() {
        //driver.get("https://fasttrackit-test.netlify.app/#/");
        WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/form/div[2]/select"));
        Actions actions = new Actions(driver);
       actions.sendKeys(inputField, Keys.ENTER).perform();
        String expectedText = "Sort by name (A to Z)";
        //WebElement resultText = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/form/div[2]/select"));
        //String actualText = resultText.getText();

        Assert.assertEquals(expectedText,  "Sort by name (A to Z)");
    }
}

