package com.bank.testsuite;

import com.bank.customlisteners.CustomListeners;
import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class BankPageTest extends BaseTest {
    HomePage homePage;
    BankManagerLoginPage bankManagerLoginPage;
    AddCustomerPage addCustomerPage;
    OpenAccountPage openAccountPage;
    CustomerLoginPage customerLoginPage;
    CustomersPage customersPage;
    AccountPage accountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        bankManagerLoginPage = new BankManagerLoginPage();
        addCustomerPage = new AddCustomerPage();
        openAccountPage = new OpenAccountPage();
        customerLoginPage = new CustomerLoginPage();
        customersPage = new CustomersPage();
        accountPage = new AccountPage();
    }


    @Test(groups = {"sanity","regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {
        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnAddCustomerTab();
        addCustomerPage.enterTextInFirstNameField("Jack");
        addCustomerPage.enterTextInLastNameField("Jill");
        addCustomerPage.enterTextInPostcodeField("HA5 7NN");
        addCustomerPage.clickOnAddCustomerButton();
        addCustomerPage.popUpDisplay();
        Assert.assertTrue(addCustomerPage.verifyAlertText().contains("Customer added successfully"));
        addCustomerPage.clickOnOkButtonOnPopup();

    }

    @Test(groups = {"smoke","regression"})
    public void bankManagerShouldOpenAccountSuccessfully() {
        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnOpenAccountTab();
        openAccountPage.selectCustomerCreatedInFirstTest();
        openAccountPage.selectCurrency();
        openAccountPage.clickOnProcessButton();
        openAccountPage.popUpDisplay();
        Assert.assertTrue(openAccountPage.verifyAlertText().contains("Account created successfully"));
        openAccountPage.clickOnOkButtonOnPopup();

    }

    @Test(groups = {"regression"})
    public void customerShouldLoginAndLogoutSuccessfully() {
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.selectCustomerYouCreated();
        customerLoginPage.clickOnLoginButton();
        customersPage.verifyLogOutText();
        customersPage.clickOnLogoutButton();
        Assert.assertEquals(customersPage.verifyYourNameTextDisplayed(), "Your Name :", "Your name text not displayed");

    }

    @Test(groups = {"regression"})
    public void customerShouldDepositMoneySuccessfully() {
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.selectCustomerYouCreated();
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnDepositButton();
        accountPage.enterAmount100toAmountField("1000");
        accountPage.clickOnDepositButton2();
        Assert.assertEquals(accountPage.verifyDepositSuccessfulText(), "Deposit Successful", "Message not displayed");

    }

    @Test(groups = {"regression"})
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.selectCustomerYouCreated();
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnDepositButton();
        accountPage.enterAmount100toAmountField("1000");
        accountPage.clickOnDepositButton2();
        accountPage.clickOnWithDrawlButton();
        accountPage.enterAmount50toAmountField("50");
        accountPage.clickOnWithDrawButton();
        Assert.assertEquals(accountPage.verifyTransactionSuccessfulText(), "Transaction successful", "not displayed");

    }
}
