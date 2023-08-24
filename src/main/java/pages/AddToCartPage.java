package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage extends BasePage{

    public AddToCartPage(WebDriver driver){super(driver);}

    By CheckBox = By.xpath ( "/html/body/div/div/div[2]/div[2]/div/div[3]/button[1]" );
    public void clickOnCheckBox() {driver.findElement ( CheckBox ).click ();
}
}