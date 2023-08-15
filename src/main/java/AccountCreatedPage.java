import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class AccountCreatedPage {
    private SHAFT.GUI.WebDriver driver;

    public AccountCreatedPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    private final By getAccountCreated = By.xpath("//h2[@class='title text-center']");
    private final By getContinueButton = By.xpath("//a[@class='btn btn-primary']");

    public AccountCreatedPage assertThatAccountCreatedSuccessfully(String expected) {
        driver.element().assertThat(getAccountCreated).text().isEqualTo(expected).perform();return this;
    }

    public AccountCreatedPage clickOnContinueButton() {
        driver.element().click(getContinueButton);
        return this;
    }

}
