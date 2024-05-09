// Generated by Selenium IDE
package search_page.functionalityTest;
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
public class VirtualKeyboardTest {
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
  public static void waitForWindow(int timeout) {
      try {
          Thread.sleep(timeout);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
  }
  @Test
  public void virtualKeyboard() {
    // GENERAL DESCRIPTION: test virtual keyboard
    // WEB URL: "https://www.google.com/"

    // 1. Click on the url: "https://www.google.com/"
    // Open searching page by clicking on the link: "https://www.google.com/"
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    waitForWindow(3000);

    // 2. CLick on the Virtual Keyboard button.
    // Click on the keyboard button in the end of the searching field.
    driver.findElement(By.cssSelector(".ly0Ckb")).click();
    waitForWindow(3000);

    // 3. Type "tiktok" into the searching field by virtual keyboard.
    // Field "tiktok" by typing text on virtual keyboard.
    // Input "tiktok" into the search field using the virtual keyboard.
    //Enter the term "tiktok" into the search field using the virtual keyboard.
    //Key in "tiktok" via the virtual keyboard into the search field.
    //Type out "tiktok" using the virtual keyboard in the search field.
    //Use the virtual keyboard to input "tiktok" into the search field.
    {
      WebElement element = driver.findElement(By.cssSelector(".vk-t"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("kbd"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("kbd"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".vk-t")).click();
    driver.findElement(By.id("K84")).click();
    driver.findElement(By.id("K73")).click();
    driver.findElement(By.cssSelector(".vk-sf-h:nth-child(1)")).click();
    driver.findElement(By.id("K84")).click();
    driver.findElement(By.cssSelector(".vk-sf-h:nth-child(1)")).click();
    driver.findElement(By.id("K75")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".vk-t"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("#kbd > div:nth-child(2) > div:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("#kbd > div:nth-child(2) > div:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".vk-t")).click();
    driver.findElement(By.id("APjFqb")).click();
    waitForWindow(3000);

    // 4. Click on the first suggested keyword.
    // Click on the "tiktok" on the suggested list under the searching field.
    //Select "tiktok" from the list of suggestions below the search field and click on it.
    //Choose "tiktok" from the suggested options under the search field and proceed with a click.
    //Opt for "tiktok" from the list of recommendations beneath the search field and give it a click.
    //Click on "tiktok" from the suggestions listed below the search field to proceed.
    //Choose the option "tiktok" from the suggested list under the search field and click on it.
    driver.findElement(By.xpath("//div[@id=\'jZ2SBf\']/div/span")).click();
      waitForWindow(3000);

    // Click on the first result appeared in the new page.
    // Select the initial result that shows up on the fresh page.
    //Choose the first outcome displayed on the newly opened page.
    //Click on the initial search result visible on the recently loaded page.
    //Opt for the first link that appears on the newly opened page.
    //Click on the primary result presented on the fresh page.
    driver.findElement(By.cssSelector(".tF2Cxc > .yuRUbf .LC20lb")).click();
    driver.close();
  }
}
