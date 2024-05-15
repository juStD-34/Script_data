// Generated by Selenium IDE
package Article.anotherNewsFunctionality;
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
public class MostReadTest {
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
  public void mostRead() {
    // GENERAL DESCRIPTION: This test is going to check if the most read article of a newspaper page is working from any context appearing this property.
    // WEB URL: https://nhandan.vn/

    // Action: Open the url "https://nhandan.vn/"
    // Action: Access the webpage "https://nhandan.vn/"
    // Action: Navigate to the URL "https://nhandan.vn/"
    // Action: Visit the link "https://nhandan.vn/"
    // Action: Go to the address "https://nhandan.vn/"
    // Action: Browse to the website "https://nhandan.vn/"
    driver.get("https://nhandan.vn/");
    driver.manage().window().setSize(new Dimension(787, 816));

    // Action: Scroll to the "Tin đọc nhiều" section.
    // Action: Move down to the "Tin đọc nhiều" segment.
    // Action: Navigate to the "Tin đọc nhiều" section.
    // Action: Browse to the part labeled "Tin đọc nhiều".
    // Action: Find the "Tin đọc nhiều" section and scroll to it.
    // Action: Locate the "Tin đọc nhiều" section and scroll there.
    js.executeScript("window.scrollTo(0,231.1999969482422)");
    js.executeScript("window.scrollTo(0,390.3999938964844)");

    // Action: Click on the first article in this section.
    //Action: Select the initial article within this section.
    //Action: Choose the first piece in this section to read.
    //Action: Tap on the opening article in this section.
    //Action: Open the foremost article in this section.
    //Action: Engage with the primary article displayed in this section.
    driver.findElement(By.xpath("//div[2]/div/div/div/div/div[2]/article/h3/a")).click();
    driver.close();
  }
}