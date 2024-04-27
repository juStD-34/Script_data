// Generated by Selenium IDE
package Article.checkSearchingFilter;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class SearchingTestND2Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  public static void waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void searchingTestND2() {
    // 1.Click on the url: "https://nhandan.vn/"
    // Visit the website at the following URL: "https://nhandan.vn/".
    // Access the link: 'https://nhandan.vn/".
    // Navigate to 'https://nhandan.vn/' by clicking on the URL.
    // Follow the hyperlink provided: 'https://nhandan.vn/'.
    // Direct your browser to 'https://nhandan.vn/' by selecting the link
    driver.get("https://nhandan.vn/");
    driver.manage().window().setSize(new Dimension(1552, 832));
    {
      WebElement element = driver.findElement(By.cssSelector(".region-3 > ul > li:nth-child(2) > a"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }

    // 2. Click on the searching button.
    driver.findElement(By.cssSelector(".search-button")).click();
    driver.findElement(By.cssSelector(".txtsearch")).click();

    //3. Field "30/4" into the searching field and press Enter.
    driver.findElement(By.cssSelector(".txtsearch")).sendKeys("30/4");
    driver.findElement(By.cssSelector(".txtsearch")).sendKeys(Keys.ENTER);

    // 4. Find the 35rd article in the result page and click it.
    waitForWindow(3000);
    driver.findElement(By.cssSelector(".control__loadmore")).click();
    waitForWindow(3000);
    driver.findElement(By.xpath("//article[35]/h3/a")).click();
    driver.close();
  }
}