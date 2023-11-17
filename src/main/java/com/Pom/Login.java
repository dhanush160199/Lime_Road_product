package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base_class.Methods;

public class Login extends Methods{
//	public WebDriver driver;
	public Login() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="shopMen")
	private WebElement shopmen;
	@FindBy(id="men_category")
	private WebElement men; 
	@FindBy(xpath="(//a[text()='t-shirts'])[1]")
	private WebElement t_shirts;	
	@FindBy(id="15230812")
	private WebElement product;
	@FindBy(id="size_19788991")
	private WebElement selectsize;
	@FindBy(xpath="//div[text()='ADD TO CART']")
	private WebElement addtocart;
	
	
	
			
	public WebElement getT_shirts() {
		return t_shirts;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getSelectsize() {
		return selectsize;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getShopmen() {
		return shopmen;
	}

	public WebElement getMen() {
		return men;
	}

	
}
