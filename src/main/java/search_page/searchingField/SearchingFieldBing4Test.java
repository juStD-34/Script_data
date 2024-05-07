// Generated by Selenium IDE
package search_page.searchingField;
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
public class SearchingFieldBing4Test {
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
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void searchingFieldBing4() {
    // /1. Click on the url: "https://www.bing.com/" and sending "suicide" to the searching field.
    // Open the link "https://www.bing.com/" and input the term "suicide" into the search bar.
    //Navigate to "https://www.bing.com/" and type in "suicide" in the search box.
    //Access the website "https://www.bing.com/" and enter the word "suicide" into the search field.
    //Visit "https://www.bing.com/" and input the keyword "suicide" into the search textbox.
    //Go to the URL "https://www.bing.com/" and type "suicide" into the search input field.
    driver.get("https://www.bing.com/search?q=suicide&form=QBLH&sp=-1&ghc=1&lq=0&pq=suicid&sc=10-6&qs=n&sk=&cvid=4D858D8893584977A26F7A5557C5EC8B&ghsh=0&ghacc=0&ghpl=");
    driver.manage().window().setSize(new Dimension(784, 804));
    vars.put("window_handles", driver.getWindowHandles());

    // 2. There is an annoncement on the top of the result page. Click on the Immediate help button.
    // At the top of the result page, there's a notice. Click the Immediate help button.
    //On the result page's header, there's an announcement. Select the Immediate help button.
    //There's a message displayed at the top of the result page. Choose the Immediate help button.
    //Look for an alert at the top of the result page. Click the Immediate help button.
    //On the top section of the result page, there's an announcement. Press the Immediate help button.
    driver.findElement(By.linkText("Immediate help")).click();
    vars.put("win9185", waitForWindow(2000));
    driver.close();
  }
}