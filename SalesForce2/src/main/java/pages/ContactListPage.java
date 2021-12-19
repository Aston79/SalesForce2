package pages;

import org.openqa.selenium.WebDriver;

public class ContactListPage extends BasePage {

    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    public void openPage(String url) {
        driver.get(url);
    }

    //TODO: Implement this method
}