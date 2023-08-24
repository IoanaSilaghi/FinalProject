package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AwesomeSoftShirtAddToCartPage extends BasePage{

    public AwesomeSoftShirtAddToCartPage(WebDriver driver) {
        super ( driver );
    }

    By AwesomeSoftShirtCart = By.xpath ( "/html/body/div/div/div[2]/div[2]/div/div[3]/button[1]" );

    public void clickOnAwesomeSoftShirtCart() {driver.findElement ( AwesomeSoftShirtCart ).click ();
    }
}

