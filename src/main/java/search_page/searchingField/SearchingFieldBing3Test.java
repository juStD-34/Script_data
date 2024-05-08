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
public class SearchingFieldBing3Test {
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
  public void searchingFieldBing3() {
      // General description: searching field bing test
      // Web URL: https://www.bing.com/

      //1. Click on the url: "https://www.bing.com/" and sending "cdvnevker eerjhrivjee ievjevdscjfnv icevvjnfvjev iecdvvervdv" to the searching field.
      driver.get("https://www.bing.com/search?form=&q=cdvnevker+eerjhrivjee%0D%0A+ievjevdscjfnv+icevvjnfvjev+iecdvvervdv&form=QBLH&sp=-1&lq=1&pq=cdvnevker+eerjhrivjee+ievjevdscjfnv+icevvjnfvjev+iecdvvervdv&sc=0-61&qs=n&sk=&cvid=BF8CB132394B462E9FC8DF24EFC7B756&ghsh=0&ghacc=0&ghpl=");
      driver.manage().window().setSize(new Dimension(787, 807));

      driver.close();
      // result: No such a result on the result page.
  }
}
