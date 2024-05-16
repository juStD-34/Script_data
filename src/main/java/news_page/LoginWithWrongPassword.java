package news_page;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class LoginWithWrongPassword {
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
    public void logintest() throws InterruptedException, UnhandledAlertException {
        // GENERAL DESCRIPTION : This code tests the function login to the website https://nhandan.vn/ with wrong password and correct username
        // WEB URL: https://nhandan.vn/

        // Action: Open website "https://nhandan.vn/"
        driver.get("https://nhandan.vn/");
        driver.manage().window().setSize(new Dimension(804, 816));
        // Action: Click on Login button
        driver.findElement(By.cssSelector(".account-login")).click();
        Thread.sleep(2000);
        // Action: Click on Email text field
        driver.findElement(By.id("txtLoginEmail")).click();
        // Action: Enter "thht200603@gmail.com" into email field
        driver.findElement(By.id("txtLoginEmail")).sendKeys("thht200603@gmail.com");
        // Action: Click on Password text field
        driver.findElement(By.id("txtLoginPassword")).click();
        // Action: Enter "abcxyz" into password field
        driver.findElement(By.id("txtLoginPassword")).sendKeys("abcxyz");
        // Action: Press ENTER
        driver.findElement(By.id("txtLoginPassword")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        String errorMgs = driver.switchTo().alert().getText();
        Assert.assertEquals("Bạn nhập sai mật khẩu.", errorMgs);
        // Action: Click OK in the alert box
        alert.accept();
        driver.close();
    }
}
