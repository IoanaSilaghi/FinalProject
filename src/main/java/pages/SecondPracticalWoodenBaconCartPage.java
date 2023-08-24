package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondPracticalWoodenBaconCartPage extends BasePage{

    public SecondPracticalWoodenBaconCartPage (WebDriver driver) { super ( driver );}

    By SecondPracticalWoodenBaconCart = By.xpath ( "/html/body/div[1]/div/div[2]/div[2]/div/div[3]/button[2]");

    public void clickOnSecondPracticalWoodenBaconCart () {driver.findElement (SecondPracticalWoodenBaconCart ).click ();
    }
}
