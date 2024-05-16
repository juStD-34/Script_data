package news_page;// Generated by Selenium IDE
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
public class EditprofileTest {
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
  public void editprofile() throws InterruptedException {
    // GENERAL DESCRIPTION: edit profile
    // WEB URL: "https://nhandan.vn/"

    // Action: Open website "https://nhandan.vn/"
    // Action: Enter url https://nhandan.vn/
    // Action: Visit https://nhandan.vn/
    driver.get("https://nhandan.vn/");
    driver.manage().window().setSize(new Dimension(804, 816));
    // Action: Click on Login button
    // Action: Login to your account
    driver.findElement(By.cssSelector(".account-login")).click();
    Thread.sleep(3000);
    // Action: Click on Email text field
    driver.findElement(By.id("txtLoginEmail")).click();
    // Action: Enter "thht200603@gmail.com" into email field
    // Action: In the email field, type "thht200603@gmail.com"
    driver.findElement(By.id("txtLoginEmail")).sendKeys("thht200603@gmail.com");
    // Action: Click on Password text field
    driver.findElement(By.id("txtLoginPassword")).click();
    // Action: Enter "123456789" into password field
    // Action: In the password field, type "123456789"
    driver.findElement(By.id("txtLoginPassword")).sendKeys("123456789");
    // Action: Press ENTER
    driver.findElement(By.id("txtLoginPassword")).sendKeys(Keys.ENTER);
    {
      Thread.sleep(3000);
      WebElement element = driver.findElement(By.linkText("tinhieu"));
      Actions builder = new Actions(driver);
      // Action: Hover the account name button
      builder.moveToElement(element).perform();
    }
    // Action: Click "Thông tin cá nhân"
    driver.findElement(By.linkText("Thông tin cá nhân")).click();
    // Action: Click text field "Giới tính"
    driver.findElement(By.id("lsGender")).click();
    {
      WebElement dropdown = driver.findElement(By.id("lsGender"));
      // Action: Select option "Nam"
      dropdown.findElement(By.xpath("//option[. = 'Nam']")).click();
    }
    // Action: Click "Ngày"
    driver.findElement(By.id("lsBirthDay")).click();
    {
      WebElement dropdown = driver.findElement(By.id("lsBirthDay"));
      // Action: Select option "20"
      dropdown.findElement(By.xpath("//option[. = '20']")).click();
    }
    // Action: Click "Tháng"
    driver.findElement(By.id("lsBirthMonth")).click();
    {
      WebElement dropdown = driver.findElement(By.id("lsBirthMonth"));
      // Action: Select option "06"
      dropdown.findElement(By.xpath("//option[. = '06']")).click();
    }
    // Action: Click "Năm"
    driver.findElement(By.id("lsBirthYear")).click();
    {
      WebElement dropdown = driver.findElement(By.id("lsBirthYear"));
      // Action: Select option "2003"
      dropdown.findElement(By.xpath("//option[. = '2003']")).click();
    }
    // Action: Click button "Cập nhật"
    driver.findElement(By.id("btnUpdateProfile")).click();
//    driver.findElement(By.cssSelector(".btn-1")).click();
    driver.close();
  }
}
