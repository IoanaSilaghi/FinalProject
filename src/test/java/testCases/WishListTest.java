package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;


public class WishListTest extends BasePage {

    @Test
    public void testAutocomplete() {
        //driver.get("https://fasttrackit-test.netlify.app/#/");
        WebElement checkbox1 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[4]/div/div[2]/button[2]"));
        checkbox1.click();
    }
}