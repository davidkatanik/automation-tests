package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BuyProcedure {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://automationpractice.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testBuyProcedure() throws Exception {
    driver.get(baseUrl + "/index.php");
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("passwd")).clear();
    driver.findElement(By.id("passwd")).sendKeys("12345");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("o2615080@mvrht.com");
    driver.findElement(By.id("SubmitLogin")).click();
    driver.findElement(By.linkText("Women")).click();
    driver.findElement(By.xpath("//img[@alt='Blouse']")).click();
    new Select(driver.findElement(By.id("group_1"))).selectByVisibleText("M");
    driver.findElement(By.cssSelector("option[title=\"M\"]")).click();
    driver.findElement(By.id("color_8")).click();
    driver.findElement(By.name("Submit")).click();
    driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/span/span")).click();
    driver.findElement(By.cssSelector("li.sfHover > a.sf-with-ul")).click();
    driver.findElement(By.xpath("//img[contains(@src,'http://automationpractice.com/img/c/10-medium_default.jpg')]")).click();
    driver.findElement(By.cssSelector("a.product_img_link > img.replace-2x.img-responsive")).click();
    driver.findElement(By.id("color_24")).click();
    new Select(driver.findElement(By.id("group_1"))).selectByVisibleText("M");
    driver.findElement(By.cssSelector("option[title=\"M\"]")).click();
    driver.findElement(By.name("Submit")).click();
    driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span")).click();
    driver.findElement(By.cssSelector("i.icon-plus")).click();
    driver.findElement(By.cssSelector("li.sfHover > a[title=\"T-shirts\"]")).click();
    driver.findElement(By.cssSelector("a.product_img_link > img.replace-2x.img-responsive")).click();
    driver.findElement(By.name("Submit")).click();
    driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span")).click();
    driver.findElement(By.cssSelector("#1_1_0_15260 > i.icon-trash")).click();
    driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a/span")).click();
    driver.findElement(By.name("processAddress")).click();
    driver.findElement(By.id("cgv")).click();
    driver.findElement(By.name("processCarrier")).click();
    driver.findElement(By.linkText("Pay by check (order processing will be longer)")).click();
    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    driver.findElement(By.cssSelector("span")).click();
    driver.findElement(By.cssSelector("a[title=\"Orders\"] > span")).click();
    driver.findElement(By.xpath("//table[@id='order-list']/tbody/tr/td[7]/a/span")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
