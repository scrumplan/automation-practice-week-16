package com.automationpractice.steps;


import com.automationpractice.pages.ContactPage;
import com.automationpractice.pages.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class ContactSteps {
    @And("^I am on the contact page$")
    public void iAmOnTheContactPage() {
        new MyAccountPage().clickOnContactUsButton();
    }


    @Then("^I send refund request to customer care for previous order$")
    public void iSendRefundRequestToCustomerCareForPreviousOrder() {
        new ContactPage().selectSubjectHeading("Customer service");
        new ContactPage().selectOrderRef();
        new ContactPage().messageBox("Please cancel this order and refund me.");
        new ContactPage().clickOnSendButton();
        Assert.assertEquals("Your message has been successfully sent to our team.",new ContactPage().getCancellationConfirm());
    }

}
