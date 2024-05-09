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

public class OpenArticleTNMTTest {
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
  public void openArticleTNMT() {
    // GENERAL DESCRIPTION: this code is checking the opening article activity on the newspaper page.
    // web URL : "https://baotainguyenmoitruong.vn/"

    //1. Direct the WebDriver to the BaoTainguyenmoitruong website at "https://baotainguyenmoitruong.vn/".
    //Access the BaoTainguyenmoitruong homepage using the provided URL.
    //Open the BaoTainguyenmoitruong website in the browser window.
    //Visit the BaoTainguyenmoitruong webpage to explore environmental news and articles.
    driver.get("https://baotainguyenmoitruong.vn/");
    driver.manage().window().setSize(new Dimension(798, 816));

    //2. Select and click on the "Thời sự" section to access the latest news updates.
    //Navigate to the "Thời sự" section by clicking on its link.
    //Click on the "Thời sự" category to view current affairs and news.
    //Access the latest news stories by clicking on the "Thời sự" section.
    //Proceed to the "Thời sự" section by clicking on its corresponding link
    driver.findElement(By.linkText("Thời sự")).click();

    //3. Select and click on the first article listed on the page.
    //Navigate to the first article by clicking on its corresponding link.
    //Click on the headline of the initial article to read its content.
    //Access the content of the first article by clicking on its title.
    //Proceed to read the first article on the page by clicking on its link.
    driver.findElement(By.xpath("//div/h2/a")).click();
    driver.close();
  }
}
