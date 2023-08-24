package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondPracticalWoodenBaconAddToWishListPage extends BasePage {
    public SecondPracticalWoodenBaconAddToWishListPage (WebDriver driver) { super ( driver );}

    By SecondPracticalWoodenBaconWishList = By.xpath ( "/html/body/div[1]/div/div[2]/div[2]/div/div[3]/button[2]");

    public void clickOnSecondPracticalWoodenBaconWishList () {driver.findElement (SecondPracticalWoodenBaconWishList ).click ();
    }
}
