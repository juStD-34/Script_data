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
public class SearchingFieldBing2Test {
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
  public void searchingFieldBing2() {
    // GENERAL DESCRIPTION: searching field bing test
    // WEB URL: https://www.bing.com/

    //1. Click on the url "ttps://www.bing.com/" and field this paragraph "The weather
    // outside is crisp and clear, with a gentle breeze blowing
    //through the trees, signaling the arrival of autumn. The
    // sun casts a warm glow across the landscape, painting
    // the sky with hues of orange and pink as it begins to set
    // behind the horizon. Meanwhile, inside, the atmosphere
    //is buzzing with excitement as movie night approaches.
    // Popcorn is popping, drinks are chilling, and anticipation
    //fills the air as friends gather to watch the latest blockbuster
    // on the big screen. Laughter, gasps, and cheers fill the room
    // as the movie unfolds, transporting everyone to a world of
    //adventure, romance, and intrigue." into the searching field.
    driver.get("https://www.bing.com/search?q=The+weather%0D%0A+outside+is+crisp+and+clear%2C+with+a+gentle+breeze+blowing+%0D%0Athrough+the+trees%2C+signaling+the+arrival+of+autumn.+The%0D%0A+sun+casts+a+warm+glow+across+the+landscape%2C+painting%0D%0A+the+sky+with+hues+of+orange+and+pink+as+it+begins+to+set%0D%0A+behind+the+horizon.+Meanwhile%2C+inside%2C+the+atmosphere+%0D%0Ais+buzzing+with+excitement+as+movie+night+approaches.%0D%0A+Popcorn+is+popping%2C+drinks+are+chilling%2C+and+anticipation+%0D%0Afills+the+air+as+friends+gather+to+watch+the+latest+blockbuster%0D%0A+on+the+big+screen.+Laughter%2C+gasps%2C+and+cheers+fill+the+room%0D%0A+as+the+movie+unfolds%2C+transporting+everyone+to+a+world+of+%0D%0Aadventure%2C+romance%2C+and+intrigue&form=QBLH&sp=-1&lq=1&sc=0-627&qs=n&sk=&cvid=3C02CA3ED474484AAB80962B443CE5BC&ghsh=0&ghacc=0&ghpl=");
    driver.manage().window().setSize(new Dimension(784, 804));

    // 2. click on the first result appeared.
    // Click on the first result appeared in the new page.
    // Select the initial result that shows up on the fresh page.
    //Choose the first outcome displayed on the newly opened page.
    //Click on the initial search result visible on the recently loaded page.
    //Opt for the first link that appears on the newly opened page.
    //Click on the primary result presented on the fresh page.
    driver.findElement(By.linkText("The Sound of the Trees Poem Summary and Analysis | LitCharts")).click();
    driver.close();
  }
}
