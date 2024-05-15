package Article.openArticleLink;
// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

public class openArticleVNnet {
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
    public void openArticleVNnet() {
        // GENERAL DESCRIPTION: this code is checking the opening article activity on the newspaper page.
        // WEB URL : "https://vietnamnet.vn/".

        //1. Direct the WebDriver to the Vietnamnet website at "https://vietnamnet.vn/".
        //Access the Vietnamnet homepage using the provided URL.
        //Open the Vietnamnet website in the browser window.
        //Visit the Vietnamnet webpage to read the latest news and articles.
        //Load the Vietnamnet site to explore updates on various topics.
        driver.get("https://vietnamnet.vn/");
        driver.manage().window().setSize(new Dimension(1552, 832));
        {
            WebElement element = driver.findElement(By.cssSelector(".header__logo img"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.linkText("Thời sự"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }

        //2. Choose the "Thể thao" section from the main navigation menu.
        //Select the "Thể thao" category from the menu bar.
        //Access the "Thể thao" tab to explore sports-related content.
        //Navigate to the "Thể thao" section by clicking its link in the menu.
        //Click on the "Thể thao" option in the navigation menu to view sports news
        driver.findElement(By.cssSelector(".mainNav__list-item:nth-child(5)")).click();
        driver.findElement(By.linkText("Thể thao")).click();
        js.executeScript("window.scrollTo(0,68)");
        js.executeScript("window.scrollTo(0,1220)");
        js.executeScript("window.scrollTo(0,1276)");
        js.executeScript("window.scrollTo(0,1751.199951171875)");
        js.executeScript("window.scrollTo(0,2044.800048828125)");
        js.executeScript("window.scrollTo(0,2268)");

        //3Navigate down the page until you reach the segment dedicated to live coverage "Tường thuật trực tiếp", then select the first event.
        //
        //3. Scroll downwards on the webpage until you locate the section highlighting live coverage "Tường thuật trực tiếp".
        //Continue scrolling until you find the live coverage segment "Tường thuật trực tiếp", then proceed to select the initial event.
        //Scroll through the page until you encounter the part dedicated to live event coverage "Tường thuật trực tiếp", then click on the inaugural event.
        //Move down the webpage until you identify the area showcasing live coverage "Tường thuật trực tiếp", then click on the first event.
        //Navigate downwards on the page until you reach the section dedicated to live event coverage "Tường thuật trực tiếp", then click on the initial event.
        driver.findElement(By.cssSelector(".boxCate:nth-child(6) .boxCateItem:nth-child(1) > .boxCateItem__main a")).click();
        js.executeScript("window.scrollTo(0,88)");
        driver.close();
    }
}
