package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomersPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement getLogoutButton;

    @CacheLookup
    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement clickOnLogout;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement getYourName;


    //    public void verifyLogoutButton() {
//        Reporter.log("verifyLogoutButton" + getLogoutButton.toString());
//        Boolean logoutButton = driver.findElement((By) getLogoutButton).isDisplayed();
//    }
    public String verifyLogOutText() {

        return getTextFromElement(clickOnLogout);
    }

    public void clickOnLogoutButton() {
        Reporter.log("clickOnLogoutButton" + clickOnLogout.toString());
        clickOnElement(clickOnLogout);
    }

    public String verifyYourNameTextDisplayed() {
        Reporter.log("verifyYourNameTextDisplayed" + getYourName.toString());
        return getTextFromElement(getYourName);
    }

}
