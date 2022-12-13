package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {
    @CacheLookup
    @FindBy(name = "userSelect")
    WebElement customerCreatedInFirstTest;


    @CacheLookup
    @FindBy(id = "currency")
    WebElement selectCurrency;


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement clickOnProcess;




    public void selectCustomerCreatedInFirstTest(){
        Reporter.log("selectCustomerCreatedInFirstTest" + customerCreatedInFirstTest.toString());
        selectByVisibleTextFromDropDown(customerCreatedInFirstTest,"Harry Potter");
    }
    public void selectCurrency(){
        Reporter.log("selectCurrency" + selectCurrency.toString());
        selectByVisibleTextFromDropDown(selectCurrency,"Pound");
    }
    public void clickOnProcessButton(){
        Reporter.log("clickOnProcessButton" + clickOnProcess.toString());
        clickOnElement(clickOnProcess);
    }
    public void popUpDisplay() {
        Reporter.log("popUpDisplay");
        switchToAlert();
    }

    public String verifyAlertText() {
        Reporter.log("verifyAndGetAlertText");
        String text = getTextFromAlert();
        return text;
    }

    public void clickOnOkButtonOnPopup() {
        Reporter.log("clickOnOkButtonOnPopup");
        acceptAlert();
    }
}
