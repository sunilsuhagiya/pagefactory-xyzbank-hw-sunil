package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    WebElement clickOnAddCustomer;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Open Account')]")
    WebElement clickOnOpenAccount;


    public void clickOnAddCustomerTab() {
        Reporter.log("clickOnAddCustomerTab" + clickOnAddCustomer.toString());
        clickOnElement(clickOnAddCustomer);
    }

    public void clickOnOpenAccountTab() {
        Reporter.log("clickOnOpenAccountTab" + clickOnOpenAccount.toString());
        clickOnElement(clickOnOpenAccount);
    }
}
