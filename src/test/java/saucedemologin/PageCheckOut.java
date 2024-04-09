package saucedemologin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageCheckOut 
{
	
	WebDriver driver;
	
	@FindBy(id="first-name")
	WebElement fname;
	@FindBy(id="last-name")
	WebElement lname;
	@FindBy(xpath = "//*[@id=\"postal-code\"]")
	WebElement zipcode;
	@FindBy(xpath ="//*[@id=\"continue\"]")
	WebElement continuebutton;
	
	public PageCheckOut(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void checkoutdetails(String firstname,String lastname,String zippostalcode)
	{
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		zipcode.sendKeys(zippostalcode);
	}
	
	public void tocontinue()
	{
		continuebutton.click();
	}
	

}
