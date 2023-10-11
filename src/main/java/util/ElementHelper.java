package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementHelper {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    public ElementHelper(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.actions = new Actions(driver);
    }
}
