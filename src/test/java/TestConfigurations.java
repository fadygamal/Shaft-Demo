import com.shaft.driver.SHAFT;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class TestConfigurations {
    SHAFT.GUI.WebDriver driver;
    SHAFT.TestData.JSON data;
    @BeforeMethod
    public void setup() {
    driver = new SHAFT.GUI.WebDriver();
    new HomePage(driver).navigate();
    data = new SHAFT.TestData.JSON("Data.json");


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
