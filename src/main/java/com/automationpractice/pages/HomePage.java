package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@class='sf-with-ul' and contains(text(),'Women')]")
    WebElement topMenuWomen;

    @CacheLookup
    @FindBy(xpath = "//ul/li[1]//a[@class='sf-with-ul' and contains(text(),'Dresses')]")
    WebElement topMenuDresses;

    @CacheLookup
    @FindBy(xpath = "//ul/li[1]//a[@title='T-shirts' and contains(text(),'T-shirts')]")
    WebElement topMenuTShirts;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signInButton;

    @CacheLookup
    @FindBy(xpath = "//div[@id='header_logo']")
    WebElement headerLogo;

    public void setTopMenuWomen() {
        clickOnElement(topMenuWomen);
        log.info("Clicking on Women tab " + topMenuWomen.toString());
    }

    public void setTopMenuDresses() {
        clickOnElement(topMenuDresses);
        log.info("Clicking on Dress tab " + topMenuDresses.toString());
    }

    public void setTopMenuTShirts() {
        clickOnElement(topMenuTShirts);
        log.info("Clicking on T-Shirt tab " + topMenuTShirts.toString());
    }

    public void setHeaderLogo() {
        clickOnElement(headerLogo);
        log.info("Clicking on Header Logo" + headerLogo.toString());
    }

    public void clickOnSignInButton() {
        clickOnElement(signInButton);
        log.info("Clicking on Sign In " + signInButton.toString());
    }

}
