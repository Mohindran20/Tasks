package com.cg.page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cg.base.TestBase;

public class Arrivals extends TestBase {

	@FindBy(xpath = "//a[contains(text(),'Shop')]")
	WebElement shopClick;
	
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement homeClick;
	Actions action;

	public Arrivals() 
	{
		init();
		PageFactory.initElements(driver, this);
	}

	public void clickShop()
	{
		shopClick.click();
	}

	public void clickHome() 
	{
		homeClick.click();
	}

	public void checkArrival() 
	{

		List<WebElement> arrivals = driver.findElements(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]"));
		for (WebElement list : arrivals) {
			
			List<WebElement> books = driver.findElements(By.tagName("h3"));

			if (books.size() == 3) {
				System.out.println("There are only three arrivals in the home page");
			}
		}
	}

	public void confirm() 
	{

		List<WebElement> arrivals = driver.findElements(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]"));

		List<WebElement> books = driver.findElements(By.tagName("h3"));

		Assert.assertTrue(books.size() == 3);

	}
}
