// Generated by Selenium IDE
package search_page.searchingField;
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
public class SearchingFieldGoogle4Test {
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
  public void searchingFieldGoogle4() {
    // GENERAL DESCRIPTION: this code is checking the searching field of searching tool Google with meaningless input.
    // WEB URL : "https://www.google.com/"

    //Action: Click on the url "https://www.google.com/" and field "cdvnevker eerjhrivjee ievjevdscjfnv icevvjnfvjev iecdvvervdv" into the searching field.
    //Action: Click on the URL "https://www.google.com/" and enter "cdvnevker eerjhrivjee ievjevdscjfnv icevvjnfvjev iecdvvervdv" into the search field.
    //Action: Visit the URL "https://www.google.com/" and type "cdvnevker eerjhrivjee ievjevdscjfnv icevvjnfvjev iecdvvervdv" into the search box.
    //Action: Open the URL "https://www.google.com/" and input "cdvnevker eerjhrivjee ievjevdscjfnv icevvjnfvjev iecdvvervdv" into the search field.
    //Action: Navigate to the URL "https://www.google.com/" and put "cdvnevker eerjhrivjee ievjevdscjfnv icevvjnfvjev iecdvvervdv" into the search field.
    //Action: Access the URL "https://www.google.com/" and insert "cdvnevker eerjhrivjee ievjevdscjfnv icevvjnfvjev iecdvvervdv" into the search field.
    driver.get("https://www.google.com/search?q=cdvnevker+eerjhrivjee%0D%0A+ievjevdscjfnv+icevvjnfvjev+iecdvvervdv&sca_esv=3d5aec0ebbda9031&sxsrf=ACQVn09osP4hmWauoyd8B8lY0chMTBwZOA%3A1712618206638&source=hp&ei=3noUZrP4JMuB2roP9pir2Aw&iflsig=ANes7DEAAAAAZhSI7u9hF1CqEuh7E5WAwjQBRLocR05H&udm=&ved=0ahUKEwiz39z-37OFAxXLgFYBHXbMCssQ4dUDCBU&uact=5&oq=cdvnevker+eerjhrivjee%0D%0A+ievjevdscjfnv+icevvjnfvjev+iecdvvervdv&gs_lp=Egdnd3Mtd2l6Ij1jZHZuZXZrZXIgZWVyamhyaXZqZWUKIGlldmpldmRzY2pmbnYgaWNldnZqbmZ2amV2IGllY2R2dmVydmR2SABQAFgAcAB4AJABAJgBAKABAKoBALgBA8gBAPgBAvgBAZgCAKACAJgDAJIHAKAHAA&sclient=gws-wiz");
    driver.manage().window().setSize(new Dimension(784, 804));
    driver.close();

    // Expected output: There is no result appeared. An annoucement for checking the
    // grammar for best experience.
  }
}
