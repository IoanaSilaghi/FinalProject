package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.BasePage;

public class ItemSearchTest extends BasePage {
    public String baseUrl= "https://fasttrackit-test.netlify.app/#/";
    public WebDriver driver = new ChromeDriver();

    @Test
    public void verifyHomePageTitle() {
        driver.get(baseUrl);
        //Accept cookies
        //WebElement cookies = driver.findElement(By.id("L2AGLb"));
        //cookies.click();
        // Find the text input element by its name
        WebElement element = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/form/div[1]/input"));
        // Enter something to search for
        element.sendKeys("Awesome Metal Chair");
        element.submit();
        element = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/div/h1/small"));
        element.click();

        // Now submit the form. WebDriver will find the form for us from the element
        //element.submit();
        // Check the title of the page
       // System.out.println("Page title is: " + driver.getTitle());
        //driver.quit();
    }

}
