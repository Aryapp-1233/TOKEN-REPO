package saucedemotest;
import java.time.Duration;

import org.testng.annotations.Test;
import baseclasssauce.SaucedemoBase;
import excelutilitiessaucedemo.ExcelUtils;
import saucedemologin.CartPage;
import saucedemologin.Logoutpage;
import saucedemologin.PageCheckOut;
import saucedemologin.SauceDemoPage;
public class SauceDemoTest extends SaucedemoBase
{
	@Test
	public void logintest() throws Exception
	{
		SauceDemoPage sdemo=new SauceDemoPage(driver);
		String xl="C:\\Users\\ARYA\\Downloads\\ssdemo.xlsx";
		String sheet="Sheet1";
		int rowcount=ExcelUtils.getrowcount(xl,sheet);
		for(int i=1;i<=rowcount;i++)
		{

	    	String username=ExcelUtils.getCellValue(xl, sheet,i,0);
	    	System.out.println("username is" +username);
	    	
	    	String password=ExcelUtils.getCellValue(xl, sheet,i, 1);
	    	System.out.println("password is" +password);
	    	
	    	sdemo.setvalues(username, password);
	    	sdemo.saucelogin1();
	    	String expectedurl="https://www.saucedemo.com/inventory.html";
	    	String actualurl=driver.getCurrentUrl();
	    	if(expectedurl.equalsIgnoreCase(actualurl))
	    	{
	           System.out.println("loged successfully"); 		
	   		}
	    	else 
	    	{
	    		System.out.println("login failed");
	    	}	
		}	
		
		CartPage cart=new CartPage(driver);
		cart.addtocart();
		cart.carticonclick();
		cart.checkoutclick();
			
		PageCheckOut page=new PageCheckOut(driver);
		page.checkoutdetails("abc", "hai", "01234");
		page.tocontinue();
		
		Logoutpage L=new Logoutpage(driver);
		L.hamburger();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		L.loggingout();
		
	}
}
