package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Pom {

	WebDriver driver;

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement room;

	@FindBy(id = "room_nos")
	private WebElement no_of_rooms;

	@FindBy(id = "datepick_in")
	private WebElement checkIn;

	@FindBy(id = "datepick_out")
	private WebElement checkOut;

	@FindBy(id = "adult_room")
	private WebElement adult_Room;

	@FindBy(id = "child_room")
	private WebElement Child_Room;

	@FindBy(id = "Submit")
	private WebElement search_Btn;

	@FindBy(id = "Reset")
	private WebElement reset_Btn;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNo_of_rooms() {
		return no_of_rooms;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdult_Room() {
		return adult_Room;
	}

	public WebElement getChild_Room() {
		return Child_Room;
	}

	public WebElement getSearch_Btn() {
		return search_Btn;
	}

	public WebElement getReset_Btn() {
		return reset_Btn;
	}

	public Search_Hotel_Pom(WebDriver runner_driver) {
		this.driver = runner_driver;
		PageFactory.initElements(driver, this);
	}


}
