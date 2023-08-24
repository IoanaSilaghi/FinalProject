package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AwesomeMetalChairAddToWishListPage extends BasePage{
    public AwesomeMetalChairAddToWishListPage(WebDriver driver) {
        super ( driver );
    }

    By AwesomeMetalChairWish = By.xpath ( "/html/body/div[1]/div/div[2]/div[2]/div/div[3]/button[2]" );

    public void clickOnAwesomeMetalChairWishList() {driver.findElement ( AwesomeMetalChairWish ).click ();
    }
}
