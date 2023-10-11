package util;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Properties;

public class Hooks {
    WebDriver driver;
    Properties properties;
    @BeforeTest
    public void before(){
        String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
        properties = ConfigReader.initialize_Properties();
        driver =DriverFactory.initialize_Driver(browser);
    }
    @AfterTest
    public void after(){
        driver.quit();
    }
}
