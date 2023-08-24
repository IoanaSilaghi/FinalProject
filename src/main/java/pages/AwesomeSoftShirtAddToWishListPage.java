package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AwesomeSoftShirtAddToWishListPage extends BasePage {

    public AwesomeSoftShirtAddToWishListPage (WebDriver driver) {
        super ( driver );
    }

    By AwesomeSoftShirtWishList = By.xpath ( "/html/body/div/div/div[2]/div[2]/div/div[3]/button[2]" );

    public void clickOnAwesomeSoftShirtWishList() {driver.findElement ( AwesomeSoftShirtWishList ).click ();
    }
}
