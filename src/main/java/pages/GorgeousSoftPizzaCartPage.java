package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GorgeousSoftPizzaCartPage extends BasePage {

    public GorgeousSoftPizzaCartPage (WebDriver driver) { super ( driver );}

    By GorgeousSoftPizzaCart = By.xpath ( "/html/body/div/div/div[2]/div[2]/div[2]/div[4]/div/div[2]/button[1]" );

    public void clickOnGorgeousSoftPizzaCart () {driver.findElement ( GorgeousSoftPizzaCart ).click ();
    }
}

