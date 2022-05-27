package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthPage extends Utility {

    private static final Logger log = LogManager.getLogger(AuthPage.class.getName());

    public AuthPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailAddressToCreateAnAccount;

    @CacheLookup
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    WebElement createAccount;

    @CacheLookup
    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElement signInButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement titleMr;

    @CacheLookup
    @FindBy(xpath = "//input[@id='id_gender2']")
    WebElement titleMrs;

    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstNamePersonalInfo;

    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastNamePersonalInfo;

    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailAddress;

    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//select[@id='days']")
    WebElement birthDays;

    @CacheLookup
    @FindBy(xpath = "//select[@id='months']")
    WebElement birthMonth;

    @CacheLookup
    @FindBy(xpath = "//select[@id='years']")
    WebElement birthYear;

    @CacheLookup
    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement newsLetter;

    @CacheLookup
    @FindBy(xpath = "//input[@id='optin']")
    WebElement receiveOfferCheckBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement firstNameOfAddress;

    @CacheLookup
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lastNameOfAddress;

    @CacheLookup
    @FindBy(xpath = "//input[@id='company']")
    WebElement company;

    @CacheLookup
    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressLine1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='address2']")
    WebElement addressLine2;

    @CacheLookup
    @FindBy(xpath = "//input[@id='city']")
    WebElement city;

    @CacheLookup
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement state;

    @CacheLookup
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement postcode;

    @CacheLookup
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement country;

    @CacheLookup
    @FindBy(xpath = "//textarea[@id='other']")
    WebElement additionalInfo;

    @CacheLookup
    @FindBy(xpath = "//input[@id='phone']")
    WebElement homePhone;

    @CacheLookup
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobilePhone;

    @CacheLookup
    @FindBy(xpath = "//input[@id='alias']")
    WebElement alias;

    @CacheLookup
    @FindBy(xpath = "//button[@id='submitAccount']")
    WebElement registerButton;

    public void enterEmailAddressToCreateAnAccount(String text) {

        sendTextToElement(emailAddressToCreateAnAccount, text );
        log.info("Entering email Create Account" + emailAddressToCreateAnAccount.toString());
    }

    public void clickOnCreateAccount() {
        clickOnElement(createAccount);
        log.info("Clicking on Create Account" + createAccount.toString());
    }
    public void clickOnSignInButton() {
        clickOnElement(signInButton);
        log.info("Clicking on Sign IN " + signInButton.toString());
    }

    public void selectTitle(String text) {
        if (text == "Mr.") {
            clickOnElement(titleMr);
            log.info("Clicking on Gender Radio " + titleMr.toString());
        }

        if (text == "Mrs.") {
            clickOnElement(titleMrs);
            log.info("Clicking on Gender Radio " + titleMrs.toString());
        }

    }

    public void enterFirstNamePersonalInfo(String text) {
        sendTextToElement(firstNamePersonalInfo, text);
        log.info("Sending firstname " + text + " to " + firstNamePersonalInfo.toString());
    }

    public void enterLastNamePersonalInfo(String text) {
        sendTextToElement(lastNamePersonalInfo, text);
        log.info("Sending lastname " + text + " to " + lastNamePersonalInfo.toString());
    }

    public void enterEmailAddress(String text) {
        sendTextToElement(emailAddress, text);
        log.info("Sending emailaddress " + text + " to " + emailAddress.toString());
    }

    public void enterPassword(String text) {
        sendTextToElement(password, text);
        log.info("Sending password " + text + " to " + password.toString());
    }

    public void selectBirthDate(String day, String month, String year) {
        selectByValueFromDropDown(birthDays, day);
        selectByValueFromDropDown(birthMonth, month);
        selectByValueFromDropDown(birthYear, year);
        log.info("Setting BirthDate  " + day + "/" + month + "/" + year + " to " + birthDays.toString() + " " + birthMonth.toString() + " " + birthYear.toString());
    }

    public void optInNewsLetter() {
        clickOnElement(newsLetter);
        log.info("Clicking on Newsletter checkbox " + newsLetter.toString());
    }

    public void optInReceiveOfferCheckBox() {
        clickOnElement(receiveOfferCheckBox);
        log.info("Clicking on offer checkbox " + receiveOfferCheckBox.toString());
    }

    public void enterFirstNameOfAddress(String text) {
        sendTextToElement(firstNameOfAddress, text);
        log.info("Sending firstname " + text + " to " + firstNameOfAddress.toString());
    }

    public void enterLastNameOfAddress(String text) {
        sendTextToElement(lastNameOfAddress, text);
        log.info("Sending lastname " + text + " to " + lastNameOfAddress.toString());
    }

    public void enterCompanyName(String text) {
        sendTextToElement(company, text);
        log.info("Sending company " + text + " to " + company.toString());
    }

    public void enterAddress(String line1, String line2) {
        sendTextToElement(addressLine1, line1);
        sendTextToElement(addressLine2, line2);
        log.info("Sending Address " + line1 + " " + line1 + " to " + addressLine1.toString() + " " + addressLine2.toString());
    }

    public void enterCityName(String text) {
        sendTextToElement(city, text);
        log.info("Sending city " + text + " to " + city.toString());
    }

    public void selectState(String text) {
        selectByVisibleTextFromDropDown(state, text);
        log.info("setting state " + text + " to " + state.toString());
    }

    public void enterPostcode(String text) {
        sendTextToElement(postcode, text);
        log.info("Sending Postcode " + text + " to " + postcode.toString());
    }

    public void selectCountry(String text) {
        selectByVisibleTextFromDropDown(country, text);
        log.info("Setting Country " + text + " to " + country.toString());
    }

    public void enterAdditionalInfo(String text) {
        sendTextToElement(additionalInfo, text);
        log.info("Sending additional info " + text + " to " + additionalInfo.toString());
    }

    public void enterHomePhone(String text) {
        sendTextToElement(homePhone, text);
        log.info("Sending homephone " + text + " to " + homePhone.toString());
    }

    public void enterMobilePhone(String text) {
        sendTextToElement(mobilePhone, text);
        log.info("Sending mobile " + text + " to " + mobilePhone.toString());
    }

    public void enterAlias(String text) {
        sendTextToElement(alias, text);
        log.info("Sending alias " + text + " to " + alias.toString());
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        log.info("Clicking on register button " + registerButton.toString());
    }


}
