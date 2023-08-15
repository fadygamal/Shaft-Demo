import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class HomePage {
    SHAFT.GUI.WebDriver driver;

    public HomePage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
//    private final By getHomePageText = By.xpath("//span//parent::h1");

    public HomePage navigate(){
        driver.browser().navigateToURL("http://automationexercise.com/");
        return this;

    }
    public HomePage assertThatHomePageIsVisibleSuccessfully( String expected){
        driver.browser().assertThat().title().isEqualTo(expected).perform();
        return this;
    }
}
