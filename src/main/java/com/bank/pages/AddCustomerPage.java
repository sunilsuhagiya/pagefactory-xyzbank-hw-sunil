package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;


    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postcode;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit' and contains(text(),'Add Customer')]")
    WebElement clickAddCustomerButton;


    public void enterTextInFirstNameField(String firstNm) {
        Reporter.log("enterTextInFirstNameField" + firstName.toString());
        sendTextToElement(firstName, firstNm);
    }

    public void enterTextInLastNameField(String lastNm) {
        Reporter.log("enterTextInLastNameField" + lastName.toString());
        sendTextToElement(lastName, lastNm);
    }

    public void enterTextInPostcodeField(String postCd) {
        Reporter.log("enterTextInPostcodeField" + postcode.toString());
        sendTextToElement(postcode, postCd);
    }

    public void clickOnAddCustomerButton() {
        Reporter.log("clickOnAddCustomerButton" + clickAddCustomerButton.toString());
        clickOnElement(clickAddCustomerButton);
    }

    public void popUpDisplay() {
        Reporter.log("popUpDisplay");
        switchToAlert();
    }

    public String verifyAlertText() {
        Reporter.log("verifyAlertText");
        String text = getTextFromAlert();
        return text;
    }

    public void clickOnOkButtonOnPopup() {
        Reporter.log("clickOnOkButtonOnPopup");
        acceptAlert();
    }


}
