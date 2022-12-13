package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Deposit')]")
    WebElement clickOnDepositTab;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement enterAmount1000;

    @CacheLookup
    @FindBy(xpath = "//div[1]/form[1]/button[1]")
    WebElement clickOnDepositTab2;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement getDepositSuccessful;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    WebElement clickOnWithDrawlTab;

    @CacheLookup
    @FindBy(xpath = "//input[@type='number']")
    WebElement enterAmount50;

    @CacheLookup
    //@FindBy(xpath = "//div[1]/form[1]/button[1]")
    @FindBy(xpath = "//button[contains(text(),'Withdraw')and@type='submit']")
    WebElement clickOnWithdrawTab;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement getTransactionText;


    public void clickOnDepositButton() {
        Reporter.log("clickOnDepositButton" + clickOnDepositTab);
        clickOnElement(clickOnDepositTab);
    }

    public void enterAmount100toAmountField(String text) {
        Reporter.log("enterAmount1000toAmountField" + enterAmount1000.toString());
        sendTextToElement(enterAmount1000, text);
    }

    public void clickOnDepositButton2() {
        Reporter.log("click On DepositButton2" + clickOnDepositTab2.toString());
        clickOnElement(clickOnDepositTab2);
    }

    public String verifyDepositSuccessfulText() {
        Reporter.log("verifyDepositSuccessfulText" + getDepositSuccessful.toString());
        return getTextFromElement(getDepositSuccessful);
    }

    public void clickOnWithDrawlButton() {
        Reporter.log("clickOnWithDrawlButton" + clickOnWithDrawlTab.toString());
        clickOnElement(clickOnWithDrawlTab);
    }

    public void enterAmount50toAmountField(String text) {
        Reporter.log("enterAmount50toAmountField" + enterAmount50.toString());
        sendTextToElement(enterAmount50, text);
    }

    public void clickOnWithDrawButton() {
        Reporter.log("clickOnWithDrawButton" + clickOnWithdrawTab.toString());
        clickOnElement(clickOnWithdrawTab);
    }

    public String verifyTransactionSuccessfulText() {
        Reporter.log("verifyTransactionSuccessfulText" + getTransactionText.toString());
        return getTextFromElement(getTransactionText);
    }
}
