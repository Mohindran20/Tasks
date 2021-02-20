package com.cg.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cg.base.TestBase;

public class Sliders extends TestBase{
	
	@FindBy(xpath = "//a[contains(text(),'Shop')]")
	WebElement shop;
	
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement home;
	
	
	public Sliders() 
	{
		init();
		PageFactory.initElements(driver, this);
	}
	
	public void Shop() 
	{
		shop.click();
	}
	
	public void Home() 
	{
		home.click();
	}
	
	public void checkSlider() 
	{
		
	}
	
	public String getTitle() 
	{
		return driver.getTitle();
	}

}
