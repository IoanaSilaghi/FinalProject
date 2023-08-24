package testCases;
import org.testng.annotations.Test;
import pages.BasePage;

public class OpenPageTest extends BasePage {
    @Test
    public void testAutocomplete() {
        driver.get("https://fasttrackit-test.netlify.app/#/");
    }
}
