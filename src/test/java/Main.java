import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        WebElement searchGoogle = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        searchGoogle.click();
        searchGoogle.sendKeys("https://demoqa.com/");
        searchGoogle.sendKeys(Keys.ENTER);
        WebElement demoqaSelector = driver.findElement(By.xpath("//h3[text()='DEMOQA']"));
        demoqaSelector.click();Thread.sleep(2000);
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0, 300)");
        WebElement element = driver.findElement(By.xpath("//h5[text()='Elements']"));
        element.click();
        WebElement webTables = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        webTables.click();




        driver.quit();
    }
}
