package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticalWoodenBaconWishListPage extends BasePage {

    public PracticalWoodenBaconWishListPage (WebDriver driver) { super ( driver );}

    By PracticalWoodenBaconWishList = By.xpath ( "/html/body/div/div/div[2]/div[2]/div/div[3]/button[2]");

    public void clickOnPracticalWoodenBaconWishList () {driver.findElement (PracticalWoodenBaconWishList ).click ();
    }
}
