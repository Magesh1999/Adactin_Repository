package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Itinerary {

	public WebDriver driver;

	@FindBy(xpath = "//input[@value='585923']")
	private WebElement checkbox;

	@FindBy(name = "cancelall")
	private WebElement cancel_All;

	@FindBy(id = "logout")
	private WebElement logout;

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCancel_All() {
		return cancel_All;
	}

	public WebElement getLogout() {
		return logout;
	}

	public Book_Itinerary(WebDriver runner_driver) {

		this.driver = runner_driver;
		PageFactory.initElements(driver, this);
	}



}
