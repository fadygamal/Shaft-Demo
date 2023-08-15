package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class AccountDeletedPage {
    SHAFT.GUI.WebDriver driver;

    public AccountDeletedPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    private final By getDeletedMsg = By.xpath("//h2[@class='title text-center']");
    private final By getBackToHomeButton = By.xpath("//a[@class='btn btn-primary']");

    public AccountDeletedPage assertThatAccountDeleted(String expected) {
        driver.element().assertThat(getDeletedMsg).text().isEqualTo(expected).perform();
        return this;
    }

    public AccountDeletedPage clickOnContinueButtonAfterDelete() {
        driver.element().click(getBackToHomeButton);
        return this;
    }
}
