package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IncredibleConcreteHatWishListPage extends BasePage {

      public IncredibleConcreteHatWishListPage(WebDriver driver) { super ( driver );}

      By IncredibleConcreteHatWishList = By.xpath ( "/html/body/div[1]/div/div[2]/div[2]/div/div[3]/button[2]");

      public void clickOnIncredibleConcreteHatWishList () {driver.findElement (IncredibleConcreteHatWishList ).click ();
      }
}

