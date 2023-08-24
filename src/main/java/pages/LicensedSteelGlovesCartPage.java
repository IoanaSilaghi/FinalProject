package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LicensedSteelGlovesCartPage extends BasePage {


    public LicensedSteelGlovesCartPage (WebDriver driver) { super ( driver );}

    By LicensedSteelGlovesCart = By.xpath ( "/html/body/div/div/div[2]/div[2]/div/div[3]/button[1]");

    public void clickOnLicensedSteelGlovesCart () {driver.findElement (LicensedSteelGlovesCart ).click ();
    }
}

