package saucedemologin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage
{
	
	WebDriver driver;
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement backpack;
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	WebElement bikelight;
	
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement tshirt;
	
	@FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
	WebElement jacket;
	
	@FindBy(id="add-to-cart-sauce-labs-onesie")
	WebElement onesie;
	
	@FindBy(id="add-to-cart-test.allthethings()-t-shirt-(red)")
	WebElement tshirtred;
	
	@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
	WebElement carticon;
	
	@FindBy(xpath = "//*[@id=\"checkout\"]")
	WebElement checkoutbutton;
	
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	public void addtocart()
	{
		backpack.click();
		bikelight.click();
		tshirt.click();
		jacket.click();
		onesie.click();
		tshirtred.click();
	}
	public void carticonclick()
	{
		carticon.click();
	}
	public void checkoutclick()
	{
		checkoutbutton.click();
	}

}
