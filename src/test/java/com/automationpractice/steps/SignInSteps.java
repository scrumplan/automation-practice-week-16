package com.automationpractice.steps;


import com.automationpractice.pages.AuthPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SignInSteps {
    @Given("^I am on the Sign In Page$")
    public void iAmOnTheSignInPage() {
        new HomePage().clickOnSignInButton();
    }

    @When("^Login using newly create credentials$")
    public void loginUsingNewlyCreateCredentials() {
        new AuthPage().enterEmailAddress("Lalit12341@gmail.com");
        new AuthPage().enterPassword("Lalit0123");
        new AuthPage().clickOnSignInButton();

    }

    @Then("^I shall verify the address information in my address section$")
    public void iShallVerifyTheAddressInformationInMyAddressSection() {
        new MyAccountPage().clickOnMyAddressButton();
        String[] expected = {"Lalit Popatlal", "Yahoo", "13 Super Plaza City Park", "Delhi, Utah 45678", "United States", "01234567890", "0987654321"};
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], new MyAccountPage().getAddressInfo()[i]);
        }
    }


}
