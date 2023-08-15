package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class LoginPage {
    SHAFT.GUI.WebDriver driver;

    public LoginPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    private final By getSignupPageText = By.xpath("//div[@class='signup-form']");
    private final By getSignupName = By.xpath("//form[@action='/signup']//input[@data-qa='signup-name']");
    private final By getSignupMail = By.xpath("//form[@action='/signup']//input[@data-qa='signup-email']");
    private final By getRegesterButton = By.xpath("//form[@action='/signup']//button[@data-qa='signup-button']");

    public LoginPage assertThatSignupPageIsVisibleSuccessfully(String expected) {
        driver.element().assertThat(getSignupPageText).text().contains(expected).perform();
        return this;
    }

    public LoginPage signup(String signupName, String signupMail) {
        driver.element().type(getSignupName,signupName);
        driver.element().type(getSignupMail,signupMail);
        driver.element().click(getRegesterButton);
        return this;
    }
}
