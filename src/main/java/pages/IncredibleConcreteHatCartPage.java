package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IncredibleConcreteHatCartPage extends BasePage {

    public IncredibleConcreteHatCartPage(WebDriver driver) { super ( driver );}

    By IncredibleConcreteHatCart = By.xpath ( "/html/body/div[1]/div/div[2]/div[2]/div/div[3]/button[1]");

    public void clickOnIncredibleConcreteHatCart () {driver.findElement (IncredibleConcreteHatCart ).click ();
    }
}
