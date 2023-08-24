package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RefinedFrozenMouseWishListPage extends BasePage{


    public RefinedFrozenMouseWishListPage (WebDriver driver) { super ( driver );}

    By RefinedFrozenMouseWishList = By.xpath ( "/html/body/div/div/div[2]/div[2]/div/div[3]/button[2]");

    public void clickOnRefinedFrozenMouseWishList () {driver.findElement (RefinedFrozenMouseWishList ).click ();
    }
}

