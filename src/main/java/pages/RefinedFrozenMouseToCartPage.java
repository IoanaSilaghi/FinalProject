package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RefinedFrozenMouseToCartPage extends BasePage {

    public RefinedFrozenMouseToCartPage (WebDriver driver) { super ( driver );}

    By RefinedFrozenMouseCart = By.xpath ( "/html/body/div/div/div[2]/div[2]/div/div[3]/button[1]");

    public void clickOnRefinedFrozenMouseCart () {driver.findElement (RefinedFrozenMouseCart ).click ();
    }
}
