package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLoginTab;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement clickCustomerLoginTab;


    public void clickOnBankManagerLoginTab(){
        Reporter.log("clickOnBankManagerLoginTab" + bankManagerLoginTab.toString());
        clickOnElement(bankManagerLoginTab);
    }
    public void clickOnCustomerLoginTab(){
        Reporter.log("clickOnCustomerLoginTab" + clickCustomerLoginTab.toString());
        clickOnElement(clickCustomerLoginTab);
    }
}

