import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        int milis = 1;

        driver.get("https://google.com");
        WebElement searchGoogle = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        searchGoogle.click();
        searchGoogle.sendKeys("https://demoqa.com/");
        searchGoogle.sendKeys(Keys.ENTER);
        WebElement demoqaSelector = driver.findElement(By.xpath("//h3[text()='DEMOQA']"));
        demoqaSelector.click();Thread.sleep(milis);
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0, 300)");
        WebElement element = driver.findElement(By.xpath("//h5[text()='Elements']"));
        element.click();
        WebElement webTables = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        webTables.click();Thread.sleep(milis);
        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();Thread.sleep(milis);
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        firstName.sendKeys("hasan");
        WebElement lastName = driver.findElement(By.cssSelector("#lastName"));
        lastName.sendKeys("hacı");
        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("aha@gmail.com");
        WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
        age.sendKeys("40");
        WebElement salary = driver.findElement(By.xpath("//input[@id='salary']"));
        salary.sendKeys("1000");
        WebElement department = driver.findElement(By.xpath("//input[@id='department']"));
        department.sendKeys("havaCiva");
        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();
        jsx.executeScript("window.scrollBy(0, 300)");Thread.sleep(milis);




        driver.quit();
    }
}
