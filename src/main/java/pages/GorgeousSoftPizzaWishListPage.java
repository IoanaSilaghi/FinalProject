package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GorgeousSoftPizzaWishListPage extends BasePage {

    public GorgeousSoftPizzaWishListPage (WebDriver driver) { super ( driver );}

    By GorgeousSoftPizzaWishList = By.xpath ( "/html/body/div/div/div[2]/div[2]/div[2]/div[4]/div/div[2]/button[2]" );

    public void clickOnGorgeousSoftPizzaWishList () {driver.findElement ( GorgeousSoftPizzaWishList ).click ();
    }
}

