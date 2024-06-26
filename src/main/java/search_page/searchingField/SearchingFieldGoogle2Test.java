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
public class SearchingFieldGoogle2Test {
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
  public void searchingFieldGoogle2() {

    // General Description: this code is checking the searching field of searching tool Google with negative content.
    // WEB URL : "https://www.google.com/"

    try {
      //Action: Click on the URL: "https://www.google.com/" and enter "suicide" into the search field.
      //Action: Visit the URL: "https://www.google.com/" and type "suicide" into the search box.
      //Action: Open the URL: "https://www.google.com/" and input "suicide" into the search field.
      //Action: Navigate to the URL: "https://www.google.com/" and put "suicide" into the search field.
      //Action: Access the URL: "https://www.google.com/" and insert "suicide" into the search field.
      driver.get("https://www.google.com/search?q=suicide&sca_esv=3d5aec0ebbda9031&sxsrf=ACQVn0_nFGDxe4br5FjzJ7GSPdryi3XwTQ%3A1712616737156&source=hp&ei=IXUUZoPLB8DO1e8P8faRyAU&iflsig=ANes7DEAAAAAZhSDMV1wMTkA1oLvw0Uw43JUsIi4aHuw&udm=&ved=0ahUKEwjD34LC2rOFAxVAZ_UHHXF7BFkQ4dUDCBU&uact=5&oq=suicide&gs_lp=Egdnd3Mtd2l6IgdzdWljaWRlMgUQABiABDIFEAAYgAQyBRAAGIAEMgsQLhiABBixAxiDATIFEAAYgAQyBRAAGIAEMggQLhiABBixAzIFEAAYgAQyBRAAGIAEMgUQLhiABEjUElCuBFi-D3ABeACQAQCYAYkBoAH2BaoBAzIuNbgBA8gBAPgBAZgCCKACnAaoAgrCAgcQIxjqAhgnwgIKECMYgAQYigUYJ8ICChAuGIAEGIoFGEPCAgsQABiABBixAxiDAcICERAuGIAEGLEDGIMBGMcBGNEDwgIEEAAYA8ICDhAAGIAEGIoFGLEDGIMBwgIQEC4YgAQYigUYQxixAxiDAcICCBAAGIAEGLEDwgIHEAAYgAQYCpgDCJIHAzMuNaAHmFI&sclient=gws-wiz");
      driver.manage().window().setSize(new Dimension(784, 804));

      //Action: An announcement appears at the top of the result page. Click the "Call" button.
      //Action: A notification is displayed at the top of the result page. Click the "Call" button.
      //Action: At the top of the result page, there is an announcement. Click the "Call" button.
      //Action: An alert shows up at the top of the result page. Click the "Call" button.
      //Action: There is an announcement at the top of the result page. Click the "Call" button.
      driver.findElement(By.cssSelector(".xPmOaf:nth-child(1) > .hhWEGd")).click();
      Thread.sleep(4000);
      driver.close();
    } catch(InterruptedException e) {

    }
  }
}
