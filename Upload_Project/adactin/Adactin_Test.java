package com.adactin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.BaseClass.AdactinBaseClass;
import com.pageobjectmanager.PageObjectManager;
import com.pom.Adactin_Login_Pom;
import com.pom.Search_Hotel_Pom;

public class Adactin_Test extends AdactinBaseClass{
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		driver = browserLaunch("chrome");
		UrlLaunch("http://adactinhotelapp.com/");

		//---------------------------------Login-----------------------------------------------


		PageObjectManager pom = new PageObjectManager(driver);
		sendValues(pom.getLogin().getUsername(), "Mageshyadav1999");
		sendValues(pom.getLogin().getPassword(), "I19K0F");
		btnClick(pom.getLogin().getLogin_Btn());

		//---------------------------------Search-----------------------------------------------

		dropselect(pom.getSearch().getLocation(), "index", "1");
		dropselect(pom.getSearch().getHotels(), "value", "Hotel Sunshine");
		dropselect(pom.getSearch().getRoom(), "text", "Double");
		dropselect(pom.getSearch().getNo_of_rooms(), "index", "2");
		clearInput(pom.getSearch().getCheckIn());
		sendValues(pom.getSearch().getCheckIn(), "22/03/2022");
		clearInput(pom.getSearch().getCheckOut());
		sendValues(pom.getSearch().getCheckOut(), "25/03/2022");
		dropselect(pom.getSearch().getAdult_Room(), "index", "2");
		dropselect(pom.getSearch().getChild_Room(), "value", "2");
		btnClick(pom.getSearch().getSearch_Btn());

		//---------------------------------Select-----------------------------------------------

		btnClick(pom.getSelect().getRadio_Btn());
		btnClick(pom.getSelect().getContinue_Btn());

		//---------------------------------Book Hotel-----------------------------------------------

		sendValues(pom.getBook().getF_Name(), "Magesh");
		sendValues(pom.getBook().getL_Name(), "yadav");
		sendValues(pom.getBook().getAddress(), "Ambattur");
		sendValues(pom.getBook().getCard_No(), "1234567891234567");
		dropselect(pom.getBook().getCard_Type(), "text", "VISA");
		dropselect(pom.getBook().getExp_Month(), "index", "1");
		dropselect(pom.getBook().getExp_year(), "value", "2022");
		sendValues(pom.getBook().getCvv(), "123");
		btnClick(pom.getBook().getBook_Now());


		//---------------------------------Booking Confirm-----------------------------------------------

		freeze();
		btnClick(pom.getBook_confirm().getItinerary());

		//---------------------------------snap-----------------------------------------------

		snap("Booking");

		//---------------------------------Booked Itinerary-----------------------------------------------

		btnClick(pom.getItenerary().getLogout());
		closeTab();




	}

}
