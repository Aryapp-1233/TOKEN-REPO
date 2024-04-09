package saucedemologin;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoPage 
{
	WebDriver driver;
	
	@FindBy (id="user-name")
	WebElement susername;
	
	@FindBy (id="password")
	WebElement upswd;
	
	@FindBy(id="login-button")
	WebElement loginbutton;
	

	

	public SauceDemoPage(WebDriver driver)
	{
		this.driver=driver;
		System.out.println(driver);
		PageFactory.initElements(driver,this);
	}

	public void setvalues(String email,String pswd)
	{
		susername.clear();
		susername.sendKeys(email);
		upswd.clear();
		upswd.sendKeys(pswd);
	}
	
	public void saucelogin1()
	{
		loginbutton.click();
	}
	

}
