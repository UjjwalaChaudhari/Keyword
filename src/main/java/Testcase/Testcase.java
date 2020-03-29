package Testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Keyword.Const;
import Keyword.Homepage;
import Keyword.Keyword;
import Utility.Propertyfile;

public class Testcase {
	@Test 
	public void TC_01() 
	   {
		   Keyword.OpenBrowser();
		   Keyword.OpenUrl();
		   Const.driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		   Const.driver.manage().window().maximize();
		   
		}
}
