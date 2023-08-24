package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LicensedSteelGlovesWishListPage extends BasePage {

    public LicensedSteelGlovesWishListPage (WebDriver driver) { super ( driver );}

    By LicensedSteelGlovesWishList = By.xpath ( "/html/body/div/div/div[2]/div[2]/div/div[3]/button[2]");

    public void clickOnLicensedSteelGlovesWishList () {driver.findElement (LicensedSteelGlovesWishList ).click ();
    }
}
