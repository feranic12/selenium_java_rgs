package ru.fp.selenium.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import ru.fp.selenium.util.DateTimeHelper;

public class FlatbaseTest extends TestBase {		
		@Parameters({ "path" })
		@BeforeClass
		public void testInit(String path) {
			// Load the page in the browser
			webDriver.get("https://testpartner.rgs.ru/b2c/product/build/test-flatbase.html");
		}
		
		@Test
		public void test_flatbase() throws IOException, InterruptedException{
		    webDriver.manage().window().setSize(new Dimension(1506, 824));
		    webDriver.switchTo().frame(0);
		    {
		      WebElement element = webDriver.findElement(By.cssSelector(".col .btn:nth-child(1)"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element).perform();
		    }
		    {
		      WebElement element = webDriver.findElement(By.tagName("body"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    webDriver.findElement(By.name("content.object.data.area")).click();
		    webDriver.findElement(By.name("content.object.data.area")).sendKeys("100,00");
		    webDriver.findElement(By.cssSelector(".col .btn:nth-child(1)")).click();
		    {
		      WebElement element = webDriver.findElement(By.cssSelector(".col .btn:nth-child(1)"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element).perform();
		    }
		    {
		      WebElement element = webDriver.findElement(By.tagName("body"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    webDriver.findElement(By.cssSelector(".row:nth-child(3) > .col-md-6:nth-child(1) .btn:nth-child(1)")).click();
		    {
		      WebElement element = webDriver.findElement(By.cssSelector(".row:nth-child(3) > .col-md-6:nth-child(1) .btn:nth-child(1)"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element).perform();
		    }
		    {
		      WebElement element = webDriver.findElement(By.tagName("body"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    webDriver.findElement(By.cssSelector(".col-md-6:nth-child(2) .btn:nth-child(1)")).click();
		    webDriver.findElement(By.cssSelector(".btn-outline-primary:nth-child(1)")).click();
		    webDriver.findElement(By.cssSelector(".n-card-0-2-7:nth-child(2) .btn")).click();
		    webDriver.findElement(By.name("content.contract.beginDate")).click();
		    webDriver.findElement(By.name("content.contract.beginDate")).click();
		    webDriver.findElement(By.name("content.contract.beginDate")).sendKeys(DateTimeHelper.getBeginDate(6));
		    TimeUnit.SECONDS.sleep(1);
		    webDriver.findElement(By.cssSelector(".position-relative > .form-control")).sendKeys("г Москва, г Зеленоград, пл Юности, д 1");
		    TimeUnit.SECONDS.sleep(1);
		    webDriver.findElement(By.cssSelector(".position-relative > .form-control")).sendKeys(Keys.ARROW_DOWN);
		    TimeUnit.SECONDS.sleep(1);
		    webDriver.findElement(By.cssSelector(".position-relative > .form-control")).sendKeys(Keys.ENTER);
		    webDriver.findElement(By.name("content.object.data.address.registration.flat")).click();
		    webDriver.findElement(By.name("content.object.data.address.registration.flat")).sendKeys("77");
		    webDriver.findElement(By.cssSelector(".text-right > .btn")).click();
		    {
		      WebElement element = webDriver.findElement(By.cssSelector(".text-right > .btn"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element).perform();
		    }
		    webDriver.findElement(By.name("content.policyHolder.lastName")).click();
		    webDriver.findElement(By.name("content.policyHolder.lastName")).sendKeys("Петров");
		    webDriver.findElement(By.name("content.policyHolder.firstName")).sendKeys("Пётр");
		    webDriver.findElement(By.name("content.policyHolder.middleName")).sendKeys("Петрович");
		    webDriver.findElement(By.name("content.policyHolder.dob")).sendKeys("01011990");
		    webDriver.findElement(By.name("content.policyHolder.phone")).click();
		    webDriver.findElement(By.name("content.policyHolder.phone")).sendKeys("+7(123)213-21-32");
		    webDriver.findElement(By.cssSelector(".d-flex > .btn:nth-child(1)")).click();
		    webDriver.findElement(By.name("content.policyHolder.email")).click();
		    webDriver.findElement(By.name("content.policyHolder.email")).sendKeys("knikitin@avinfors.ru");
		    webDriver.findElement(By.cssSelector(".col-md-4:nth-child(9) > .form-group")).click();
		    webDriver.findElement(By.name("content.policyHolder.email2")).click();
		    webDriver.findElement(By.name("content.policyHolder.email2")).sendKeys("knikitin@avinfors.ru");
		    webDriver.findElement(By.name("content.policyHolder.document.seria")).click();
		    webDriver.findElement(By.name("content.policyHolder.document.seria")).sendKeys("1234");
		    webDriver.findElement(By.cssSelector(".col-6:nth-child(3) > .form-group")).click();
		    webDriver.findElement(By.cssSelector(".col-6:nth-child(3) > .form-group")).click();
		    {
		      WebElement element = webDriver.findElement(By.cssSelector(".col-6:nth-child(3) > .form-group"));
		      Actions builder = new Actions(webDriver);
		      builder.doubleClick(element).perform();
		    }
		    webDriver.findElement(By.name("content.policyHolder.document.number")).click();
		    webDriver.findElement(By.name("content.policyHolder.document.number")).sendKeys("123123");
		    webDriver.findElement(By.cssSelector(".text-right > .btn")).click();
		    webDriver.findElement(By.cssSelector(".row:nth-child(2) .custom-control-label")).click();
		  }
}