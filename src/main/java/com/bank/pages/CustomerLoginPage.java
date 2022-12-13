package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCustomerYouCreated;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement clickOnLogin;



    public void selectCustomerYouCreated() {
        Reporter.log("selectCustomerYouCreated" + searchCustomerYouCreated.toString());
        //selectByContainsTextFromDropDown((By) searchCustomerYouCreated, "Harry Potter");
        selectByVisibleTextFromDropDown(searchCustomerYouCreated,"Harry Potter");
    }

    public void clickOnLoginButton() {
        Reporter.log("clickOnLoginButton" + clickOnLogin.toString());
        clickOnElement(clickOnLogin);
    }

}
