// Generated by Selenium IDE
package Article.checkSearchingFilter;
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
import org.openqa.selenium.Keys;
import java.util.*;

public class SearchND6Test {

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
  public void searchND6() {

    // GENERAL DESCRIPTION: this code is checking the filter article functionality of newspaper page.
    // web URL "https://nhandan.vn/"

    ///Action: Click on the URL: "https://nhandan.vn/"
    //Action: Visit the website at the following URL: "https://nhandan.vn/".
    //Action: Access the link: 'https://nhandan.vn/".
    //Action: Navigate to 'https://nhandan.vn/' by clicking on the URL.
    //Action: Follow the hyperlink provided: 'https://nhandan.vn/'.
    //Action: Direct your browser to 'https://nhandan.vn/' by selecting the link.
    driver.get("https://nhandan.vn/");
    driver.manage().window().setSize(new Dimension(1552, 832));
    {
      WebElement element = driver.findElement(By.cssSelector(".fa-search:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".fa-search:nth-child(1)")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }

    // Action: Click on the searching field.
    //Action: Select the searching field by clicking.
    //Action: Access the searching field by clicking.
    //Action: Engage with the searching field by clicking.
    //Action: Choose the searching field by clicking on it.
    //Action: Click on the searching field option.
    driver.findElement(By.cssSelector(".txtsearch")).click();

    // Action: Field ""Cùng thời điểm này, tại đường Nguyễn Du - Đồng Khởi (phía trước Sở Văn hóa và Thể thao),
    // Ban Tổ chức cũng trưng bày triển lãm với chủ đề “Công nhân Thành phố Hồ Chí Minh phát huy truyền thống, bản lĩnh,
    // trí tuệ, sáng tạo, dám nghĩ, dám làm” gồm 70 ảnh. Triển lãm giới thiệu những hình ảnh sinh động về phong trào đấu
    // tranh của công nhân Sài Gòn - Gia Định - Chợ Lớn trong cuộc kháng chiến chống Mỹ, cứu nước" into the searching field.
    driver.findElement(By.cssSelector(".txtsearch")).sendKeys("Cùng thời điểm này, tại đường Nguyễn Du - Đồng Khởi (phía trước Sở Văn hóa và Thể thao), Ban Tổ chức cũng trưng bày triển lãm với chủ đề “Công nhân Thành phố Hồ Chí Minh phát huy truyền thống, bản lĩnh, trí tuệ, sáng tạo, dám nghĩ, dám làm” gồm 70 ảnh. Triển lãm giới thiệu những hình ảnh sinh động về phong trào đấu tranh của công nhân Sài Gòn - Gia Định - Chợ Lớn trong cuộc kháng chiến chống Mỹ, cứu nước");
    driver.findElement(By.cssSelector(".txtsearch")).sendKeys(Keys.ENTER);

    // Action: Click on the first article appeared.
    //Action: Select the first appearing article with a click.
    //Action: Access the first article that appears by clicking.
    //Action: Engage with the first appearing article by clicking.
    //Action: Choose the first article that appears by clicking on it.
    //Action: Click on the first appearing article option.
    driver.findElement(By.xpath("//h3/a")).click();
    driver.close();
  }
}
