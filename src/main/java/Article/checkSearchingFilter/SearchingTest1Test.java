// Generated by Selenium IDE
package Article.checkSearchingFilter;
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

public class SearchingTest1Test {
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
  public void searchingTest1() {
    try {
      driver.get("https://vietnam.vnanet.vn/vietnamese/");
      driver.manage().window().maximize();
      driver.findElement(By.cssSelector(".icon-search")).click();
      Thread.sleep(1000); // Nghỉ 5 giây

      driver.findElement(By.id("txtkeyword")).click();
      driver.findElement(By.id("txtkeyword")).sendKeys("Nam Định");
      driver.findElement(By.cssSelector("#btnsearch > svg")).click();
      driver.findElement(By.id("ContentPlaceHolder1_uc_zone_search_advance_fromdate")).click();
      Thread.sleep(1000);
      driver.findElement(By.linkText("1")).click();
      driver.findElement(By.id("ContentPlaceHolder1_uc_zone_search_advance_todate")).click();
      Thread.sleep(1000);
      driver.findElement(By.linkText("6")).click();
      driver.findElement(By.id("ddlChuyenMuc_select")).click();
      Thread.sleep(1000);
      {
        WebElement dropdown = driver.findElement(By.id("ddlChuyenMuc_select"));
        dropdown.findElement(By.xpath("//option[. = 'Tin tức']")).click();
      }

      driver.findElement(By.cssSelector(".btn-search-nc")).click();
      Thread.sleep(1000);
      driver.close();
    } catch (InterruptedException e) {
      // Xử lý nếu có lỗi trong quá trình nghỉ
    }
  }
}
