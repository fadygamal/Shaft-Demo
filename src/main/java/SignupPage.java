import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class SignupPage {
    SHAFT.GUI.WebDriver driver;

    public SignupPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    private final By getAccountInformation = By.xpath("//div[@class='login-form']/h2/b");

    private By getGender(String gender) {
        return By.xpath("//input[@value='" + gender + "']");
    }

    private final By getName = By.id("name");
    private final By getPassword = By.id("password");
    private final By getDays = By.id("days");

    private By getDaysValue(String day) {
        return By.xpath("//select[@id='days']//option[@value='" + day + "']");
    }

    private final By getMonths = By.id("months");

    private By getMonthsValue(String month) {
        return By.xpath("//select[@id='months']//option[@value='" + month + "']");
    }

    private final By getYears = By.id("years");

    private By getYearsValue(String year) {
        return By.xpath("//select[@id='years']//option[@value='" + year + "']");
    }

    private final By getNewsLetter = By.id("newsletter");
    private final By getOffers = By.id("optin");
    private final By getFirstName = By.id("first_name");
    private final By getLastName = By.id("last_name");
    private final By getCompany = By.id("company");
    private final By getAddress1 = By.id("address1");
    private final By getAddress2 = By.id("address2");
    private final By getCountry = By.id("country");

    private By getCountryName(String country) {
        return By.xpath("//select[@id='country']//option[@value='" + country + "']");
    }

    private final By getState = By.id("state");
    private final By getCity = By.id("city");
    private final By getZibCode = By.id("zipcode");
    private final By getMobileNumber = By.id("mobile_number");
    private final By getCreateAccountButton = By.xpath("//button[@data-qa='create-account']");

    public SignupPage assertThatAccountInformationPageIsVisibleSuccessfully(String expected) {
        driver.element().assertThat(getAccountInformation).text().isEqualTo(expected).perform();
        return this;
    }

    public SignupPage enterAccountInformation(String gender, String name, String password, String dayOfBirth
            , String numberOfMonth, String year) {
        driver.element().click(getGender(gender));
        driver.element().clear(getName);
        driver.element().type(getName,name);
        driver.element().type(getPassword,password);
        driver.element().select(getDays,dayOfBirth);
        driver.element().select(getMonths,numberOfMonth);
        driver.element().select(getYears,year);
        driver.element().click(getNewsLetter);
        driver.element().click(getOffers);
        return this;
    }

    public SignupPage enterAddressInformation(String firstName, String lastName, String company, String address1
            , String address2, String country, String state, String city, String zibCode, String mobileNumber) {
        driver.element().type(getFirstName,firstName);
        driver.element().type(getLastName,lastName);
        driver.element().type(getCompany,company);
        driver.element().type(getAddress1,address1);
        driver.element().type(getAddress2,address2);
        driver.element().click(getCountry);
        driver.element().click(getCountryName(country));
        driver.element().type(getState,state);
        driver.element().type(getCity,city);
        driver.element().type(getZibCode,zibCode);
        driver.element().type(getMobileNumber,mobileNumber);
        driver.element().click(getCreateAccountButton);
        return this;
    }

}
