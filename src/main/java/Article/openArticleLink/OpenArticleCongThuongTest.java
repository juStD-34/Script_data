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
public class OpenArticleCongThuongTest {
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
  public void openArticleCongThuong() {

    //1. Visit the webpage "https://congthuong.vn/".
    //Access the site at "https://congthuong.vn/".
    //Go to "https://congthuong.vn/".
    //Open the URL "https://congthuong.vn/".
    //Direct your browser to "https://congthuong.vn/"
    driver.get("https://congthuong.vn/");
    driver.manage().window().setSize(new Dimension(798, 816));

    //2.Click on the first article displayed in the list.
    //Select the first article from the list of options.
    //Choose the first article shown in the list.
    //Click on the first article listed among the options.
    //Locate and click on the first article from the list.
    driver.findElement(By.xpath("//li[2]/div/h2/a")).click();
    driver.close();
  }
}
