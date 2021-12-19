package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {

    WebDriver driver;
    String label;
    private static final String DROPDOWN = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInputSelect')]//a";
    private static final String SELECT_OPTION = "//*[contains(@class,'select-options')]/descendant::a[contains(text(),'%s')]";

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void select(String option) {
        driver.findElement(By.xpath(String.format(DROPDOWN,label))).click();
        driver.findElement(By.xpath(String.format(SELECT_OPTION,option))).click();
    }
}