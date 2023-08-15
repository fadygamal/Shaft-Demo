package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class MainMenuPage {
    SHAFT.GUI.WebDriver driver;

    public MainMenuPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    private final By getSignupButton = By.cssSelector("i[class='fa fa-lock']");
    private final By getLoggedinName = By.xpath("//i[@class='fa fa-user']//parent::a");
    private final By getDeleteAccount = By.xpath("//a[@href='/delete_account']");

    public MainMenuPage clickOnSignupButton(){
        driver.element().click(getSignupButton);return this;
    }
    public MainMenuPage assertThatLoggedInAsUsername(String expected){
        driver.element().assertThat(getLoggedinName).text().contains(expected).perform();return this;
    }
    public MainMenuPage deleteAccount(){
        driver.element().click(getDeleteAccount);return this;
    }
}
