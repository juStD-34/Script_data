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
public class OpenArticleSHTTTest {
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
  public void openArticleSHTT() {

    //1. Direct the WebDriver to the SoHuuTriTue website at "https://sohuutritue.net.vn/".
    //Navigate to the SoHuuTriTue homepage using the provided URL.
    //Open the SoHuuTriTue website in the browser window.
    driver.get("https://sohuutritue.net.vn/");
    driver.manage().window().setSize(new Dimension(798, 816));

    //2.Select and click on the first article listed on the page.
    //Navigate to the first article by clicking on its corresponding link.
    //Click on the headline of the initial article to read its content.
    //Access the content of the first article by clicking on its title.
    //Proceed to read the first article on the page by clicking on its link.
    driver.findElement(By.xpath("//div/div[2]/div/h1/a")).click();
    driver.close();
  }
}