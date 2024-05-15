package weather;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class ViewDetailOfLocation {
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
    public void search() throws InterruptedException {
        driver.get("https://www.accuweather.com/");
//        driver.manage().window().setSize(new Dimension(804, 816));
        driver.findElement(By.name("query")).click();
        driver.findElement(By.name("query")).sendKeys("hai");
        Thread.sleep(2000);
        driver.findElement(By.name("query")).sendKeys(Keys.DOWN);
        Thread.sleep(2000);
        driver.findElement(By.name("query")).sendKeys(Keys.DOWN);
        Thread.sleep(2000);
        driver.findElement(By.name("query")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.className("cur-con-weather-card__cta")).click();
        Thread.sleep(5000);
        driver.close();
    }
}
