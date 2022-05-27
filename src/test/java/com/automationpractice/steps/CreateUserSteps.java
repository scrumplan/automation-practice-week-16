package com.automationpractice.steps;


import com.automationpractice.pages.AuthPage;
import com.automationpractice.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateUserSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @Then("^Navigate to SignUp page$")
    public void navigateToSignUpPage() {
        new HomePage().clickOnSignInButton();

    }

    @And("^create an account with random username$")
    public void createAnAccountWithRandomUsername() {
        new AuthPage().enterEmailAddressToCreateAnAccount("Lalit12341@gmail.com");
        new AuthPage().clickOnCreateAccount();
        new AuthPage().selectTitle("Mr.");
        new AuthPage().enterFirstNamePersonalInfo("Lalit");
        new AuthPage().enterLastNamePersonalInfo("Popatlal");
        new AuthPage().enterPassword("Lalit0123");
        new AuthPage().selectBirthDate("10","8","1982");
        new AuthPage().optInNewsLetter();
        new AuthPage().optInReceiveOfferCheckBox();
        new AuthPage().enterCompanyName("Yahoo");
        new AuthPage().enterAddress("13 Super Plaza","City Park");
        new AuthPage().enterCityName("Delhi");
        new AuthPage().selectState("Utah");
        new AuthPage().enterPostcode("45678");
        new AuthPage().enterAdditionalInfo("Happy Testing");
        new AuthPage().enterHomePhone("01234567890");
        new AuthPage().enterMobilePhone("0987654321");
        new AuthPage().enterAlias("Popatlal2022");
        new AuthPage().clickOnRegisterButton();
    }
}
