package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirm_Pom {

	public WebDriver driver;

	@FindBy(id = "search_hotel")
	private WebElement search_hotel_Btn;

	@FindBy(id = "my_itinerary")
	private WebElement itinerary;

	@FindBy(id = "logout")
	private WebElement logout_Btn;


	public WebElement getSearch_hotel_Btn() {
		return search_hotel_Btn;
	}

	public WebElement getItinerary() {
		return itinerary;
	}

	public WebElement getLogout_Btn() {
		return logout_Btn;
	}

	public Booking_Confirm_Pom(WebDriver runner_driver) {
		this.driver = runner_driver;
		PageFactory.initElements(driver, this);
	}




}
