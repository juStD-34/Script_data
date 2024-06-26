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
public class openArticleBaoAnh {
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
  public void openArticleBaoAnh() {
    // GENERAL DESCRIPTION: this code is checking the opening article activity on the newspaper page.
    // WEB URL : "https://vietnam.vnanet.vn/vietnamese/"

    //Action: Navigate to the webpage at "https://vietnam.vnanet.vn/vietnamese/".
    //Action: Access the site "https://vietnam.vnanet.vn/vietnamese/".
    //Action: Go to "https://vietnam.vnanet.vn/vietnamese/".
    //Action: Open the URL "https://vietnam.vnanet.vn/vietnamese/".
    //Action: Direct your browser to "https://vietnam.vnanet.vn/vietnamese/".
    driver.get("https://vietnam.vnanet.vn/vietnamese/");
    driver.manage().window().setSize(new Dimension(1552, 832));

    //Action: Click on the "Tin tức" section on the mainboard.
    //Action: Navigate to the "News" section located on the main dashboard.
    //Action: Select the "Tin tức" category from the main menu.
    //Action: Click on the "Tin tức" tab displayed on the main interface.
    //Action: Access the "Tin tức" segment found on the mainboard.
    //Action: Choose the "Tin tức" option available on the main dashboard.
    driver.findElement(By.cssSelector(".uk-navbar-nav > li:nth-child(2) > a")).click();

    //Action: Click on the title of the first article.
    //Action: Choose the first article title to proceed.
    //Action: Click on the headline of the initial article.
    //Action: Select the first article title to continue.
    //Action: Click on the first article displayed on the page.
    driver.findElement(By.xpath("//h3/a")).click();
    driver.close();
  }
}
