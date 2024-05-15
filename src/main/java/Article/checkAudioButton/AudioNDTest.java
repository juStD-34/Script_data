// Generated by Selenium IDE
package Article.checkAudioButton;
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
public class AudioNDTest {
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
  public void audioND() {

    // GENERAL DESCRIPTION: This test is going to test the audio volume of newspaper
    // WEB URL: "https://nhandan.vn/"

    // Action: Open the url "https://nhandan.vn/"
    // Action: Access the webpage "https://nhandan.vn/"
    // Action: Navigate to the URL "https://nhandan.vn/"
    // Action: Visit the link "https://nhandan.vn/"
    // Action: Go to the address "https://nhandan.vn/"
    // Action: Browse to the website "https://nhandan.vn/"
    driver.get("https://nhandan.vn/");
    driver.manage().window().setSize(new Dimension(788, 816));

    // Action: Click on the center article in the main page.
    //Action: Clicking on the center article in the main page.
    //Action: Selecting the center article on the main page with a click.
    //Action: Accessing the center article on the main page by clicking.
    //Action: Engaging with the center article on the main page by clicking.
    //Action: Choosing the center article on the main page with a click.
    driver.findElement(By.xpath("//body/div/div/div/div[2]/div[2]/div/article/h2/a")).click();
    js.executeScript("window.scrollTo(0,402.3999938964844)");

    // Action: Click the audio play button
    //Action: Engaging the audio play button.
    //Action: Selecting the audio play option.
    //Action: Accessing the audio play feature.
    //Action: Choosing to play the audio.
    //Action: Clicking on the button for audio playback.
    driver.findElement(By.cssSelector(".fa-play")).click();

    // Action: Change the volume of the audio by click on it.
    //Action: Adjust the audio volume by clicking on it.
    //Action: Modify the audio volume through a click.
    //Action: Alter the audio volume by clicking on it.
    //Action: Adjust the volume of the audio with a click.
    //Action: Change the audio volume by clicking on it.
    {
      WebElement element = driver.findElement(By.cssSelector(".fa-volume"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".volume-slider-handle")).click();
    driver.close();
  }
}