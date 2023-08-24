package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AwesomeGraniteChipsAddToWishListPage extends BasePage {

    public AwesomeGraniteChipsAddToWishListPage(WebDriver driver) {
        super ( driver );
    }

    By GraniteWishList = By.xpath ( "/html/body/div[1]/div/div[2]/div[2]/div/div[3]/button[2]" );

    public void clickOnGraniteWishList() {driver.findElement ( GraniteWishList ).click ();
    }
}
