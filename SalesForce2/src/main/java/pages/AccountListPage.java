package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountListPage extends BasePage{

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    public static final String ACCOUNTS_TABLE = "//*[@data-aura-class='uiVirtualDataTable']";
    public static final String NAME_FIELD = ACCOUNTS_TABLE + "//*[contains(@title,'%s')]";
    public static final String PHONE_FIELD = ACCOUNTS_TABLE + "//*[@class='enabledState']//*[contains(text(),'%s')]";

    public void openPage(String url) {
        driver.get(url);
    }

    public String getName(String accountName) {
        return driver.findElement(By.xpath(String.format(NAME_FIELD, accountName))).getText();
    }

    public String getPhoneNumber(String phone) {
        return driver.findElement(By.xpath(String.format(PHONE_FIELD, phone))).getText();
    }

}