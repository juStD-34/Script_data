package news_page;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class LoginWithFacebook {
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
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void loginWithFacebook() throws InterruptedException {
    driver.get("https://nhandan.vn/");
    driver.manage().window().setSize(new Dimension(804, 816));
    driver.findElement(By.cssSelector(".account-login")).click();
    vars.put("window_handles", driver.getWindowHandles());
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".fb")).click();
    vars.put("win1751", waitForWindow(2000));
    vars.put("root", driver.getWindowHandle());
    driver.switchTo().window(vars.get("win1751").toString());
    driver.findElement(By.id("email")).sendKeys("nt2653454@gmail.com");
    driver.findElement(By.id("pass")).sendKeys("Doanthuyendanhca1958");
    driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
    Thread.sleep(8000);
    driver.findElement(By.cssSelector("div[role='none'")).click();
    Thread.sleep(10000);
    driver.close();
//    driver.switchTo().window(vars.get("root").toString());
//    driver.close();
  }
}
