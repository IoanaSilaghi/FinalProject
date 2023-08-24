package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticalWoodenBaconAddToCartPage extends BasePage {
    public PracticalWoodenBaconAddToCartPage (WebDriver driver) { super ( driver );}

    By PracticalWoodenBaconCart = By.xpath ( "/html/body/div/div/div[2]/div[2]/div/div[3]/button[1]");

    public void clickOnPracticalWoodenBaconCart () {driver.findElement (PracticalWoodenBaconCart ).click ();
    }
}

