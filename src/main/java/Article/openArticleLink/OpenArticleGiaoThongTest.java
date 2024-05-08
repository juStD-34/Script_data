// Generated by Selenium IDE
package Article.openArticleLink;
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

public class OpenArticleGiaoThongTest {
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
  public void openArticleGiaoThong() {

    // General Description: this code is checking the opening article activity on the newspaper page.
    // web URL : "https://www.baogiaothong.vn/"

    //Action: Direct the  Baogiaothong website at "https://www.baogiaothong.vn/".
    //Action: Access the Baogiaothong homepage using the provided URL.
    //Action: Open the Baogiaothong website in the browser window.
    //Action: Visit the Baogiaothong webpage to read the latest traffic news and articles.
    //Action: Load the Baogiaothong site to explore traffic-related content.
    driver.get("https://www.baogiaothong.vn/");
    driver.manage().window().setSize(new Dimension(798, 816));

    //Action: Select and click on the first article listed on the page.
    //Action: Navigate to the first article by clicking on its corresponding link.
    //Action: Click on the headline of the initial article to read its content.
    //Action: Access the content of the first article by clicking on its title.
    //Action: Proceed to read the first article on the page by clicking on its link.
    driver.findElement(By.xpath("//h2/a")).click();
    js.executeScript("window.scrollTo(0,0)");
    driver.close();
  }
}
