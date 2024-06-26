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
public class TNMT2Test {
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
  public void tNMT2() {

    // GENERAL DESCRIPTION: this test well checking reading article by topic.
    // WEB URL: "https://baotainguyenmoitruong.vn/"

    // Action: Open the url "https://baotainguyenmoitruong.vn/"
    //Action: Access the webpage "https://baotainguyenmoitruong.vn/"
    //Action: Navigate to the URL "https://baotainguyenmoitruong.vn/"
    //Action: Visit the link "https://baotainguyenmoitruong.vn/"
    //Action: Go to the address "https://baotainguyenmoitruong.vn/"
    //Action: Browse to the website "https://baotainguyenmoitruong.vn/"
    driver.get("https://baotainguyenmoitruong.vn/");
    driver.manage().window().setSize(new Dimension(1552, 832));

    // Action: Click on the "thời sự" button.
    //Action: Select the "thời sự" button with a click.
    //Action: Access the "thời sự" button by clicking.
    //Action: Engage with the "thời sự" button by clicking.
    //Action: Choose the "thời sự" button by clicking on it.
    //Action: Click on the "thời sự" option.
    driver.findElement(By.cssSelector(".icon24-home-primary")).click();

    //Action: Click on the "Biến đổi khí hậu" button.
    //Action: Select the "Biến đổi khí hậu" button with a click.
    //Action: Access the "Biến đổi khí hậu" button by clicking.
    //Action: Engage with the "Biến đổi khí hậu" button by clicking.
    //Action: Choose the "Biến đổi khí hậu" button by clicking on it.
    //Action: Click on the "Biến đổi khí hậu" option.
    driver.findElement(By.xpath("//li[8]/a")).click();

    //Action: Click on the first article on new page.
    //Action: Select the first article on the new page with a click.
    //Action: Access the first article on the new page by clicking.
    //Action: Engage with the first article on the new page by clicking.
    //Action: Choose the first article on the new page by clicking on it.
    //Action: Click on the first article option on the new page.
    driver.findElement(By.xpath("//h2/a")).click();
    driver.findElement(By.xpath("//div[3]/div/div/div[2]/div/ul/li/div/div[2]/div/h3/a")).click();
    js.executeScript("window.scrollTo(0,252.8000030517578)");
    driver.close();
  }
}
