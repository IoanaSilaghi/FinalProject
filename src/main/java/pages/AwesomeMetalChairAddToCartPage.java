package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AwesomeMetalChairAddToCartPage extends BasePage{

    public AwesomeMetalChairAddToCartPage(WebDriver driver) {
        super ( driver );
    }

    By AwesomeMetalChair = By.xpath ( "/html/body/div/div/div[2]/div[2]/div/div[3]/button[1]" );

    public void clickOnAwesomeMetalChair() {driver.findElement ( AwesomeMetalChair ).click ();
    }
}
