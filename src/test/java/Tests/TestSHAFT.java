package Tests;

import org.testng.annotations.Test;
import Pages.*;
public class TestSHAFT extends TestConfigurations {
    
    @Test
    public void TestCase1RegisterUser() {
        new HomePage(driver).assertThatHomePageIsVisibleSuccessfully("Automation Exercise");
        new MainMenuPage(driver).clickOnSignupButton();

        new LoginPage(driver)
                .assertThatSignupPageIsVisibleSuccessfully("New User Signup!")
                .signup(data.getTestData("Name"), "fadygamal"+System.currentTimeMillis()+"@gmail.com");
        new SignupPage(driver)
                .assertThatAccountInformationPageIsVisibleSuccessfully("ENTER ACCOUNT INFORMATION")
                .enterAccountInformation("Mr", "fadygamal", "123456", "3", "3", "2000")
                .enterAddressInformation("fady", "gamal", "vois", "alex", "cairo", "Canada", "newyork", "torino", "123", "01220202002");

        new AccountCreatedPage(driver).assertThatAccountCreatedSuccessfully("ACCOUNT CREATED!")
                .clickOnContinueButton();
//        new MainMenuPage(driver).assertThatLoggedInAsUsername("fady")
//                .deleteAccount();
//        new AccountDeletedPage(driver).assertThatAccountDeleted("ACCOUNT DELETED!")
//                .clickOnContinueButtonAfterDelete();

    }

}
