package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends Utility {
    private static final Logger log = LogManager.getLogger(ContactPage.class.getName());

    public ContactPage() {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='id_contact']")
    WebElement dropDownSubject;
    @CacheLookup
    @FindBy(xpath = "//select[@name='id_order']")
    WebElement dropDownOrderRef;

    @CacheLookup
    @FindBy(xpath = "//textarea[@id='message']")
    WebElement messageBox;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/fieldset[1]/div[2]/button[1]/span[1]")
    WebElement sendButton;

    @CacheLookup
    @FindBy(xpath = "//p[contains(text(),'Your message has been successfully sent to our tea')]")
    WebElement cancellationConfirm;

    public void selectSubjectHeading(String text) {
        selectByVisibleTextFromDropDown(dropDownSubject,text);
        log.info("Selecting Customer Service from drop down : " + dropDownSubject.toString());
    }

    public void selectOrderRef() {
        selectByIndexFromDropDown(dropDownOrderRef,2);
        log.info("Selecting Order Ref from drop down : " + dropDownOrderRef.toString());
    }

    public void messageBox(String text) {
        sendTextToElement(messageBox,text);
        log.info("Sending info to message box : " + messageBox.toString());
    }

    public void clickOnSendButton() {
        clickOnElement(sendButton);
        log.info("Click on message send button : " + sendButton.toString());
    }

    public String getCancellationConfirm(){
        log.info("Getting confirmation message : " + sendButton.toString());
        return getTextFromElement(cancellationConfirm);
    }

}
