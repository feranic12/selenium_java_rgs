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

public class MiteTest extends TestBase {		
		@Parameters({ "path" })
		@BeforeClass
		public void testInit(String path) {
			// Load the page in the browser
			webDriver.get("https://testpartner.rgs.ru/b2c/product/build/test-mite.html");
		}
		
		@Test
		public void test_mite() throws IOException{
		    webDriver.manage().window().setSize(new Dimension(1506, 824));
		    webDriver.switchTo().frame(0);
		    webDriver.findElement(By.cssSelector("div:nth-child(1) > .input-group .calendar-button")).click();
		    webDriver.findElement(By.cssSelector(".w-100:nth-child(1) > .border-0:nth-child(5)")).click();
		    {
		      WebElement element = webDriver.findElement(By.cssSelector(".pt-3:nth-child(3) > .d-none"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element).perform();
		    }
		    webDriver.findElement(By.cssSelector(".pt-3:nth-child(3) > .d-none")).click();
		    webDriver.findElement(By.name("content.insuredPerson.list[0].lastName")).click();
		    webDriver.findElement(By.name("content.insuredPerson.list[0].lastName")).sendKeys("Петров");
		    webDriver.findElement(By.name("content.insuredPerson.list[0].firstName")).sendKeys("Пётр");
		    webDriver.findElement(By.name("content.insuredPerson.list[0].middleName")).sendKeys("Петрович");
		    webDriver.findElement(By.cssSelector(".d-flex > .btn:nth-child(1)")).click();
		    webDriver.findElement(By.cssSelector(".custom-switch > .custom-control-label")).click();
		    {
		      WebElement element = webDriver.findElement(By.cssSelector(".text-right > .btn"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element).perform();
		    }
		    webDriver.findElement(By.cssSelector(".text-right > .btn")).click();
		    webDriver.findElement(By.name("content.policyHolder.phone")).click();
		    webDriver.findElement(By.name("content.policyHolder.phone")).sendKeys("+7(123)123-21-32");
		    webDriver.findElement(By.name("content.policyHolder.email")).click();
		    webDriver.findElement(By.name("content.policyHolder.email")).sendKeys("knikitin@avinfors.ru");
		    webDriver.findElement(By.name("content.policyHolder.email2")).sendKeys("knikitin@avinfors.ru");
		    webDriver.findElement(By.name("content.policyHolder.document.seria")).click();
		    webDriver.findElement(By.name("content.policyHolder.document.seria")).sendKeys("1234");
		    webDriver.findElement(By.name("content.policyHolder.document.number")).click();
		    webDriver.findElement(By.name("content.policyHolder.document.number")).sendKeys("123213");
		    {
		      WebElement element = webDriver.findElement(By.cssSelector(".text-right > .btn"));
		      Actions builder = new Actions(webDriver);
		      builder.moveToElement(element).perform();
		    }
		    webDriver.findElement(By.cssSelector(".text-right > .btn")).click();
		    webDriver.findElement(By.cssSelector(".row:nth-child(2) .custom-control-label")).click();
		  }
		}


