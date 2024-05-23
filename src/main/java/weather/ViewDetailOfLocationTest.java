package weather;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ViewDetailOfLocationTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("./extension/AdBlock.crx"));
        driver = new ChromeDriver(options);
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void viewDetail() throws InterruptedException {
        // GENERAL DESCRIPTION: view detail of a location
        // WEB URL: "https://www.accuweather.com/"

        // Action: Open link https://www.accuweather.com/
        // Action: Enter link https://www.accuweather.com/
        // Action: Visit this url https://www.accuweather.com/
        driver.get("https://www.accuweather.com/");
        // Action: Click on the search input area
        driver.findElement(By.name("query")).click();
        // Action: Type "hai" in the search area
        driver.findElement(By.name("query")).sendKeys("hai");
        Thread.sleep(2000);
        // Action: Press DOWN button
        driver.findElement(By.name("query")).sendKeys(Keys.DOWN);
        Thread.sleep(2000);
        // Action: Press DOWN button
        driver.findElement(By.name("query")).sendKeys(Keys.DOWN);
        Thread.sleep(2000);
        // Action: Press ENTER button
        driver.findElement(By.name("query")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        // Action: Click "MORE DETAILS" in the "CURRENT WEATHER" section
        driver.findElement(By.className("cur-con-weather-card__cta")).click();
        Thread.sleep(5000);
        driver.close();
    }
}
