package pages;

import org.openqa.selenium.WebDriver;

public class ContactModalPage extends BasePage {

    public ContactModalPage(WebDriver driver) {
        super(driver);
    }

    public void openPage(String url) {
        driver.get(url);
    }

    //TODO: Implement this method
}