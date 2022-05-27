package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class MyAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My addresses')]")
    WebElement myAddressButton;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='last_item item box']/li")
    List<WebElement> myAddressInfo;

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement topMenuDresses;

    @CacheLookup
    @FindBy(xpath = "//li/h5/a[@class='subcategory-name' and contains(text(),'Casual Dresses')]")
    WebElement causalDresses;

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement topMenuWomen;

    @CacheLookup
    @FindBy(xpath = "//li/h5/a[@class='subcategory-name' and contains(text(),'Tops')]")
    WebElement topMenuTopTab;

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]")
    WebElement shoppingCartButton;

    @CacheLookup
    @FindBy(xpath = "//p/a/span[contains(text(),'Check out')]")
    WebElement checkOutButton;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[2]/p")
    WebElement printedDressShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[2]/small")
    WebElement printedDressSKU;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[5]/input[2]")
    WebElement printedDressQty;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[2]/td[2]/p")
    WebElement fadedTShirtShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[2]/td[2]/small")
    WebElement fadedTShirtSKU;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[2]/td[5]/input[2]")
    WebElement fadedTShirtQty;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")
    WebElement proceedToCheckOut;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
    WebElement proceedToCheckOutOnAddress;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]")
    WebElement proceedToCheckOutOnShipping;

    @CacheLookup
    @FindBy(xpath = "//input[@id='cgv']")
    WebElement optInTerms;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/p[1]/a[1]")
    WebElement payByCheck;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
    WebElement confirmOrderButton;

    @CacheLookup
    @FindBy(xpath = "//div[@id='contact-link']/a")
    WebElement contactUsButton;

    public void clickOnMyAddressButton() {
        clickOnElement(myAddressButton);
        log.info("Clicking on My Address Button " + myAddressButton.toString());
    }

    public String[] getAddressInfo() {
        log.info("Getting My address Info " + myAddressInfo.toString());
        String[] addressInfo = new String[8];
        for (int i = 1; i < myAddressInfo.size() - 1; i++) {
            String val = myAddressInfo.get(i).getText();
            addressInfo[i - 1] = val;
        }
        return addressInfo;
    }

    public void selectItemFromTopMenu(String text) {
        if (text.equalsIgnoreCase("Dresses")) {
            clickOnElement(topMenuDresses);
            log.info("Click on Dresses from Top Menu :" + topMenuDresses.toString());

        }
        if (text.equalsIgnoreCase("Women")) {
            clickOnElement(topMenuWomen);
            log.info("Click on Women from Top Menu :" + topMenuDresses.toString());
        }
    }

    public void selectItemFromSubCategoryMenu(String text) {
        if (text.equalsIgnoreCase("CASUAL DRESSES")) {
            clickOnElement(causalDresses);
            log.info("Click on Casual Dresses from Sub Category Menu :" + causalDresses.toString());

        }
        if (text.equalsIgnoreCase("TOPS")) {
            clickOnElement(topMenuTopTab);
            log.info("Click on Women from Top Menu :" + topMenuTopTab.toString());
        }
    }

    public void clickOnCartButton() {
        try {
            mouseHoverToElement(shoppingCartButton);
            clickOnElement(checkOutButton);
        } catch (Exception e) {
            //
        }
        log.info("Mouse Hover on Shopping Cart :" + shoppingCartButton.toString());
        log.info("Click on Shopping Cart :" + checkOutButton.toString());
    }

    public List<String> getTextFromShoppingCart(String text) {
        if (text.equalsIgnoreCase("Printed Dress")) {
            List<String> cartItem = new ArrayList<>();
            cartItem.add(getTextFromElement(printedDressShoppingCart));
            cartItem.add(getTextFromElement(printedDressSKU));
            cartItem.add(getTextFromElementByValue(printedDressQty, "value"));
            return cartItem;
        }
        if (text.equalsIgnoreCase("Faded Short Sleeve T-shirts")) {
            List<String> cartItem = new ArrayList<>();
            cartItem.add(getTextFromElement(fadedTShirtShoppingCart));
            cartItem.add(getTextFromElement(fadedTShirtSKU));
            cartItem.add(getTextFromElementByValue(fadedTShirtQty, "value"));
            return cartItem;
        }
        return null;
    }

    public void clickOnProceedToCheckOut() {
        clickOnElement(proceedToCheckOut);
        log.info("Click on proceed to checkout :" + proceedToCheckOut.toString());
    }

    public void clickOnProceedToCheckOutOnAddress() {
        clickOnElement(proceedToCheckOutOnAddress);
        log.info("Click on proceed to checkout :" + proceedToCheckOutOnAddress.toString());
    }

    public void clickOnProceedToCheckOutOnShipping() {
        clickOnElement(optInTerms);
        log.info("OptIn term and condition :" + optInTerms.toString());
        clickOnElement(proceedToCheckOutOnShipping);
        log.info("Click on proceed to checkout :" + proceedToCheckOutOnShipping.toString());
    }

    public void clickOnPayByCheck() {
        clickOnElement(payByCheck);
        log.info("Click on Payby Check :" + payByCheck.toString());
    }

    public void confirmationOrder() {
        clickOnElement(confirmOrderButton);
        log.info("Click on Confirm Order :" + confirmOrderButton.toString());
    }

    public void clickOnContactUsButton() {
        clickOnElement(contactUsButton);
        log.info("Click on Contact Us Button" + contactUsButton.toString());
    }
}
