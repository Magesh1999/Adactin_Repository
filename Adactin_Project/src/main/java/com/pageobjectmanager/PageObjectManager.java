package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pom.Adactin_Login_Pom;
import com.pom.Book_Hotel_Pom;
import com.pom.Book_Itinerary;
import com.pom.Booking_Confirm_Pom;
import com.pom.Search_Hotel_Pom;
import com.pom.Select_Hotel_Pom;

public class PageObjectManager {

	WebDriver driver;
	private Adactin_Login_Pom login;
	private Search_Hotel_Pom search;
	private Select_Hotel_Pom select;
	private Book_Hotel_Pom book;
	private Booking_Confirm_Pom book_confirm;
	private Book_Itinerary itenerary;

	
	public Adactin_Login_Pom getLogin() {
		login = new Adactin_Login_Pom(driver);
		return login;
	}
	public Search_Hotel_Pom getSearch() {
		search = new Search_Hotel_Pom(driver);
		return search;
	}

	public Select_Hotel_Pom getSelect() {
		select = new Select_Hotel_Pom(driver);
		return select;
	}

	public Book_Hotel_Pom getBook() {
		book = new Book_Hotel_Pom(driver);
		return book;
	}

	public Booking_Confirm_Pom getBook_confirm() {
		book_confirm = new Booking_Confirm_Pom(driver);
		return book_confirm;
	}

	public Book_Itinerary getItenerary() {
		itenerary = new Book_Itinerary(driver);
		return itenerary;
	}
	
	public PageObjectManager(WebDriver runner_driver) {
		this.driver = runner_driver;
	}



}
