package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;

public class LogInTest extends BasePage {

    @Test
    public void login() {

        driver.manage().window().maximize();

        //driver.get("https://fasttrackit-test.netlify.app/?#/");

        WebElement checkbox1 = driver.findElement(By.xpath("/html/body/div/div/div[1]/nav/div/div[2]/span/span/span/button"));
        checkbox1.click();


        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));

        WebElement login = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/form/button"));

        username.sendKeys("abc@gmail.com");
        password.sendKeys("your_password");
        login.click();

        //String expectedResult = String.valueOf(driver.findElement(By.xpath("//*[@id=\"signin_signup_form\"]/div[1]/div/div[1]/fieldset/div[5]/div/div")));
        //String actualResult = String.valueOf(driver.findElement(By.xpath("//*[@id=\"signin_signup_form\"]/div[1]/div/div[1]/fieldset/div[5]/div/div")));

       // Assert.assertEquals(expectedResult, actualResult);
        //driver.close();
    }
}