package news_page;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.util.*;

public class LoginTest {
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
  public void logintest() throws InterruptedException {
    // GENERAL DESCRIPTION : This code tests the function login to the website https://nhandan.vn/
    // WEB URL: https://nhandan.vn/

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
    driver.close();
  }
}
