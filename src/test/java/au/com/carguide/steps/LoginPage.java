package au.com.carguide.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPage {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I acceptcookies$")
    public void iAcceptcookies() {
        new Login().clickOnCookies();
    }

    @And("^I enter on login$")
    public void iEnterOnLogin() {
        new Login().clickOnloginLink();
    }

    @And("^I enter Emailaddress into the email address field$")
    public void iEnterEmailaddressIntoTheEmailAddressField() {
        new NewLogin().enterEmail("abc@yahoo.com");
    }

    @And("^I enter password into the password Field$")
    public void iEnterPasswordIntoThePasswordField() {
        new NewLogin().enterPassword("Happ123");
    }

    @And("^I click on loginbutton$")
    public void iClickOnLoginbutton() {
        new NewLogin().clickOnloginButton();
    }
}
