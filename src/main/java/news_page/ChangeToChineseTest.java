package news_page;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ChangeToChineseTest {
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
    public void changeToChinese() {
        // GENERAL DESCRIPTION : This code tests the function change language to Chinese of the website https://nhandan.vn/
        // WEB URL: https://nhandan.vn/

        // Action: Open website "https://nhandan.vn/"
        // Action: Enter url https://nhandan.vn/
        // Action: Visit https://nhandan.vn/
        driver.get("https://nhandan.vn/");
        driver.manage().window().setSize(new Dimension(1552, 832));
        vars.put("window_handles", driver.getWindowHandles());
        // Action: Click on 中文 at the top bar
        //Action: Click the text 中文 at the top bar
        driver.findElement(By.linkText("中文")).click();
        vars.put("win8086", waitForWindow(2000));
        driver.switchTo().window(vars.get("win8086").toString());
        assertThat(driver.getTitle(), is("越南人民报网"));
    }
}
