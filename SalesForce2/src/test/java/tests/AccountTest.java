package tests;

import objects.Account;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AccountTest extends BaseTest implements ITestConstants {

    @Test (description = "Сreation account on salesforce.com")
    public void createAccountTest() {
        Account firstAccount = Account.builder()
                .accountName("FirstAccount")
                .type("Customer")
                .website("www.onliner.by")
                .phone("375297738451")
                .industry("Apparel")
                .build();
        firstAccount.setEmployees("60");
        loginPage.openPage(BASE_URL);
        loginPage.login(LOGIN, PASSWORD);
        accountModalPage.openPage(ACCOUNT_MODAL_URL);
        accountModalPage.waitPageLoaded();
        accountModalPage.create(firstAccount);
        accountListPage.openPage(ACCOUNT_LIST_URL);
        Assert.assertEquals(accountListPage.getName(firstAccount.getAccountName()), firstAccount.getAccountName());
        Assert.assertEquals(accountListPage.getPhoneNumber(firstAccount.getPhone()), firstAccount.getPhone());
    }

    @Test(description = "Сreation two accounts on salesforce.com")
    public void createTwoAccountTest() {
        Account firstAccount = Account.builder()
                .accountName("FirstAccount")
                .type("Customer")
                .website("www.onliner.by")
                .phone("375297738451")
                .industry("Chemicals")
                .employees("100")
                .build();
        Account secondAccount = Account.builder()
                .accountName("SecondAccount")
                .type("Analyst")
                .website("www.onliner.by")
                .phone("375297738451")
                .industry("Communications")
                .build();
        secondAccount.setEmployees("200");
        loginPage.openPage(BASE_URL);
        loginPage.login(LOGIN, PASSWORD);
        accountModalPage.openPage(ACCOUNT_MODAL_URL);
        accountModalPage.waitPageLoaded();
        accountModalPage.create(firstAccount);
        accountModalPage.openPage(ACCOUNT_MODAL_URL);
        accountModalPage.waitPageLoaded();
        accountModalPage.create(secondAccount);
        accountListPage.openPage(ACCOUNT_LIST_URL);
        Assert.assertEquals(accountListPage.getName(firstAccount.getAccountName()), firstAccount.getAccountName());
        Assert.assertEquals(accountListPage.getPhoneNumber(firstAccount.getPhone()), firstAccount.getPhone());
        Assert.assertEquals(accountListPage.getName(secondAccount.getAccountName()), secondAccount.getAccountName());
        Assert.assertEquals(accountListPage.getPhoneNumber(secondAccount.getPhone()), secondAccount.getPhone());
    }
}