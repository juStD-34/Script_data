package news_page;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;

public class RecentReadTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void viewRecentRead() throws InterruptedException {
        // General description: show recent read
        // Web URL: "https://nhandan.vn/"


        // Pre-condition: Login successfully
        // Action: Open website "https://nhandan.vn/"
        driver.get("https://nhandan.vn/");
        driver.manage().window().setSize(new Dimension(804, 816));
        // Action: Click on Login button
        // Action
        driver.findElement(By.cssSelector(".account-login")).click();
        Thread.sleep(3000);
        // Action: Click on Email text field
        driver.findElement(By.id("txtLoginEmail")).click();
        // Action: Enter "thht200603@gmail.com" into  email field
        driver.findElement(By.id("txtLoginEmail")).sendKeys("thht200603@gmail.com");
        // Action: Click on Password text field
        driver.findElement(By.id("txtLoginPassword")).click();
        // Action: Enter "123456789" into password field
        driver.findElement(By.id("txtLoginPassword")).sendKeys("123456789");
        // Action: Press ENTER
        driver.findElement(By.id("txtLoginPassword")).sendKeys(Keys.ENTER);
        {
            Thread.sleep(3000);
            WebElement element = driver.findElement(By.linkText("tinhieu"));
            Actions builder = new Actions(driver);
            // Action: Hover the account name button
            builder.moveToElement(element).perform();
        }
        // Action: Click "Đọc gần đây"
        driver.findElement(By.linkText("Đọc gần đây")).click();
        driver.close();
    }
}
