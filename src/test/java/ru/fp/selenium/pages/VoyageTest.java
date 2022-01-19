package ru.fp.selenium.pages;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class VoyageTest extends TestBase {		
		@Parameters({ "path" })
		@BeforeClass
		public void testInit(String path) {
			// Load the page in the browser
			webDriver.get("https://testpartner.rgs.ru/b2c/product/build/test-voyage.html");
		}
		
		@Test
		public void test_voyage() throws IOException
		{
		    webDriver.manage().window().setSize(new Dimension(728, 692));
		    webDriver.switchTo().frame(0);
		    {
		      WebElement element = webDriver.findElement(By.cssSelector(".calendar-button"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element).perform();
		    }
		    webDriver.findElement(By.cssSelector(".calendar-button")).click();
		    {
		      WebElement element = webDriver.findElement(By.tagName("body"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    webDriver.findElement(By.cssSelector(".w-100:nth-child(1) > .border-0:nth-child(6)")).click();
		    webDriver.findElement(By.cssSelector(".btn-group > .btn:nth-child(1)")).click();
		    webDriver.findElement(By.cssSelector(".SelectFieldInner__value-container")).click();
		    webDriver.findElement(By.id("react-select-2-option-2")).click();
		    {
		      WebElement element = webDriver.findElement(By.id("content.insConditions.currency-EUR"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element).perform();
		    }
		    {
		      WebElement element = webDriver.findElement(By.tagName("body"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    webDriver.findElement(By.id("content.insConditions.currency-EUR")).click();
		    {
		      WebElement element = webDriver.findElement(By.id("content.insConditions.insVariant.risks.medical.limit-50000"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element).perform();
		    }
		    webDriver.findElement(By.id("content.insConditions.insVariant.risks.medical.limit-50000")).click();
		    {
		      WebElement element = webDriver.findElement(By.tagName("body"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    webDriver.findElement(By.cssSelector(".d-flex:nth-child(3) .calendar-button")).click();
		    {
		      WebElement element = webDriver.findElement(By.cssSelector(".d-flex:nth-child(3) .calendar-button"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element).perform();
		    }
		    {
		      WebElement element = webDriver.findElement(By.tagName("body"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    webDriver.findElement(By.cssSelector(".w-100:nth-child(2) > .border-0:nth-child(6)")).click();
		    webDriver.findElement(By.cssSelector(".mt-1 .calendar-button")).click();
		    {
		      WebElement element = webDriver.findElement(By.cssSelector(".mt-1 .calendar-button"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element).perform();
		    }
		    {
		      WebElement element = webDriver.findElement(By.tagName("body"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    webDriver.findElement(By.cssSelector(".w-100:nth-child(5) > .border-0:nth-child(6)")).click();
		    webDriver.findElement(By.cssSelector("div:nth-child(4) > .d-flex > .btn:nth-child(1)")).click();
		    {
		      WebElement element = webDriver.findElement(By.cssSelector("div:nth-child(4) > .d-flex > .btn:nth-child(1)"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element).perform();
		    }
		    {
		      WebElement element = webDriver.findElement(By.tagName("body"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    webDriver.findElement(By.cssSelector("td:nth-child(2) > .d-inline-block")).click();
		    webDriver.findElement(By.cssSelector(".text-right > .btn")).click();
		    webDriver.findElement(By.id("insuredPerson-0-lastName")).click();
		    webDriver.findElement(By.id("insuredPerson-0-lastName")).sendKeys("Петров");
		    webDriver.findElement(By.id("insuredPerson-0-firstName")).sendKeys("Пётр");
		    webDriver.findElement(By.id("insuredPerson-0-middleName")).sendKeys("Петрович");
		    webDriver.findElement(By.id("insuredPerson-0-lastNameLat")).click();
		    webDriver.findElement(By.id("insuredPerson-0-lastNameLat")).sendKeys("PETROV");
		    webDriver.findElement(By.id("insuredPerson-0-firstNameLat")).sendKeys("PETR");
		    webDriver.findElement(By.cssSelector(".d-flex > .btn:nth-child(1)")).click();
		    webDriver.findElement(By.id("insuredPerson-0-document")).click();
		    webDriver.findElement(By.id("insuredPerson-0-document")).sendKeys("12 12345678");
		    webDriver.findElement(By.cssSelector(".text-right > .btn")).click();
		    {
		      WebElement element = webDriver.findElement(By.cssSelector(".text-right > .btn"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element).perform();
		    }
		    webDriver.findElement(By.name("content.policyHolder.lastName")).click();
		    webDriver.findElement(By.name("content.policyHolder.lastName")).sendKeys("Петров");
		    webDriver.findElement(By.name("content.policyHolder.firstName")).sendKeys("Петр");
		    webDriver.findElement(By.name("content.policyHolder.middleName")).sendKeys("Петрович");
		    webDriver.findElement(By.cssSelector(".calendar-button")).click();
		    {
		      WebElement element = webDriver.findElement(By.cssSelector(".calendar-button"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element).perform();
		    }
		    {
		      WebElement element = webDriver.findElement(By.tagName("body"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    webDriver.findElement(By.cssSelector(".calendar-button")).click();
		    webDriver.findElement(By.cssSelector(".calendar-button")).click();
		    {
		      WebElement element = webDriver.findElement(By.cssSelector(".calendar-button"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element).perform();
		    }
		    {
		      WebElement element = webDriver.findElement(By.tagName("body"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    webDriver.findElement(By.cssSelector(".w-100:nth-child(2) > .border-0:nth-child(6)")).click();
		    webDriver.findElement(By.cssSelector(".form-row:nth-child(3) > .col-md-4:nth-child(2)")).click();
		    webDriver.findElement(By.name("content.policyHolder.phone")).click();
		    webDriver.findElement(By.name("content.policyHolder.phone")).sendKeys("+7(123)213-21-32");
		    webDriver.findElement(By.name("content.policyHolder.document.seria")).click();
		    webDriver.findElement(By.name("content.policyHolder.document.seria")).sendKeys("1234");
		    webDriver.findElement(By.name("content.policyHolder.document.number")).click();
		    webDriver.findElement(By.name("content.policyHolder.document.number")).sendKeys("123213");
		    webDriver.findElement(By.name("content.policyHolder.email")).click();
		    webDriver.findElement(By.name("content.policyHolder.email")).sendKeys("knikitin@avinfors.ru");
		    webDriver.findElement(By.name("content.policyHolder.email2")).click();
		    webDriver.findElement(By.name("content.policyHolder.email2")).sendKeys("knikitin@avinfors.ru");
		    webDriver.findElement(By.cssSelector(".text-right > .btn")).click();
		    webDriver.findElement(By.cssSelector(".row:nth-child(2) .custom-control-label")).click();
			Assert.assertTrue(true);
			System.in.read();
		}
}
