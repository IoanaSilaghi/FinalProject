package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AwesomeGraniteChipsAddToCartPage extends BasePage {

    public AwesomeGraniteChipsAddToCartPage(WebDriver driver) {
        super ( driver );
    }

    By GraniteCheckBox = By.xpath ( "/html/body/div[1]/div/div[2]/div[2]/div/div[3]/button[1]" );

    public void clickOnGraniteCheckBox() {driver.findElement ( GraniteCheckBox ).click ();
    }
}
