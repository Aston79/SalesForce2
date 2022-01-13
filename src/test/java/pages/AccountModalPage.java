package pages;

import elements.DropDown;
import elements.Input;
import objects.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountModalPage extends BasePage {

    public AccountModalPage(WebDriver driver) {
        super(driver);
    }

    By saveButton = By.xpath("//*[@title='Save']/span");

    public void openPage(String url) {
        driver.get(url);
    }

    public void create(Account account) {
        new Input(driver, "Account Name").writeText(account.getAccountName());
        new DropDown(driver, "Type").select(account.getType());
        new Input(driver, "Website").writeText(account.getWebsite());
        new Input(driver, "Phone").writeText(account.getPhone());
        new DropDown(driver, "Industry").select(account.getIndustry());
        new Input(driver, "Employees").writeText(account.getEmployees());
        clickSaveButton();
    }

    public void clickSaveButton() {
        driver.findElement(saveButton).click();
    }

    public AccountModalPage waitPageLoaded() {
        waitElementLocated(saveButton, 20);
        return this;
    }

}