package Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyword 
{
	public static void OpenBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Varsha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    Const.driver=new ChromeDriver();
	}
	public static void OpenUrl() 
	{
		 Const.driver.get("https://www.flipkart.com");	
	}
	private static WebElement getWebElement(String locatorType,String locatorValue) 
	   {
	 WebElement element=null;
		   switch(locatorType) 
		   {
		    	   case "XPATH":
					   Const.driver.findElement(By.xpath(locatorValue)).click();
				   break;
				   case "CSS":
					   Const.driver.findElement(By.cssSelector(locatorValue)).click();
				   break;
				   case "ID":
					   Const.driver.findElement(By.id(locatorValue)).click();
				   break;
				   case "LINKTEXT":
					   Const.driver.findElement(By.linkText(locatorValue)).click();
				   break;
				   case "PARTIALLLINKTEXT":
					   Const.driver.findElement(By.partialLinkText(locatorValue)).click();
				   break;
				   case "CLASS":
					   Const.driver.findElement(By.className(locatorValue)).click();
				   break;
				   default:
					   System.err.println("Invalide locator name:"+locatorType+",Excepted:CSS.Xpath,LinkText,Partiall link text,class name");
				   break;
		    }
		      return element;
	      }
	public static void clickonElement(String locatorType,String locatorValue) 
	{
		getWebElement(locatorType,locatorValue);
	}
	public static void enter(String locatorType,String locatorValue,String text)
	{
		switch(locatorType) 
		   {
		    	   case "XPATH":
		    		   Const.driver.findElement(By.xpath(locatorValue)).sendKeys(text);
				   break;
				   case "CSS":
					   Const.driver.findElement(By.cssSelector(locatorValue)).sendKeys(text);
				   break;
				   case "ID":
					   Const.driver.findElement(By.id(locatorValue)).sendKeys(text);
				   break;
				   case "LINKTEXT":
					   Const.driver.findElement(By.linkText(locatorValue)).sendKeys(text);
				   break;
				   case "PARTIALLLINKTEXT":
					   Const.driver.findElement(By.partialLinkText(locatorValue)).sendKeys(text);
				   break;
				   case "CLASS":
					   Const.driver.findElement(By.className(locatorValue)).sendKeys(text);
				   break;
				   default:
					   System.err.println("Invalide locator name:"+locatorType+",Excepted:CSS.Xpath,LinkText,Partiall link text,class name");
				   break;
		    }
	      }

	public static void enterdata(String locatorType,String locatorValue,String locatortext)
	{
		enter(locatorValue, locatorValue, locatortext);
	}
}
