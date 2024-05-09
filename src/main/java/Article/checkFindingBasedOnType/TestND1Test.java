// Generated by Selenium IDE
package Article.checkFindingBasedOnType;
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
public class TestND1Test {
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
  public void waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  @Test
  public void testND1() {

    // GENERAL DESCRIPTION: This test is going to the finding function of the newspaper.
    // WEB URL: "https://nhandan.vn/"

    // Action: Open the url "https://nhandan.vn/"
    // Action: Access the webpage "https://nhandan.vn/"
    // Action: Navigate to the URL "https://nhandan.vn/"
    // Action: Visit the link "https://nhandan.vn/"
    // Action: Go to the address "https://nhandan.vn/"
    // Action: Browse to the website "https://nhandan.vn/"
    driver.get("https://nhandan.vn/");
    driver.manage().window().setSize(new Dimension(1552, 832));

    // Action: Click on the "Nhân dân cuối tuần" button
    //Action: Select the "Nhân dân cuối tuần" button with a click.
    //Action: Access the "Nhân dân cuối tuần" button by clicking.
    //Action: Engage with the "Nhân dân cuối tuần" button by clicking.
    //Action: Choose the "Nhân dân cuối tuần" button by clicking on it.
    //Action: Click on the "Nhân dân cuối tuần" option.
    driver.findElement(By.xpath("//div[3]/div/ul/li[2]/a")).click();

    // Action: Click on the "Đời sống xã hội" button.
    //Action: Select the "Đời sống xã hội" button with a click.
    //Action: Access the "Đời sống xã hội" button by clicking.
    //Action: Engage with the "Đời sống xã hội" button by clicking.
    //Action: Choose the "Đời sống xã hội" button by clicking on it.
    //Action: Click on the "Đời sống xã hội" option.
    driver.findElement(By.xpath("//li[6]/a")).click();

    // Action: Click on the "Xem thêm" button.
    //Action: Select the "Xem thêm" button with a click.
    //Action: Access the "Xem thêm" button by clicking.
    //Action: Engage with the "Xem thêm" button by clicking.
    //Action: Choose the "Xem thêm" button by clicking on it.
    //Action: Click on the "Xem thêm" option.
    driver.findElement(By.cssSelector(".text")).click();
    waitForWindow(5000);

    // Action: Click on the 40th article
    //Action: Select the 40th article with a click.
    //Action: Access the 40th article by clicking.
    //Action: Engage with the 40th article by clicking.
    //Action: Choose the 40th article by clicking on it.
    //Action: Click on the 40th article option.
    driver.findElement(By.xpath("//article[40]/h3/a")).click();
    driver.close();
  }
}
