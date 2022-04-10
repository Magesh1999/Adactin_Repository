package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.AdactinBaseClass;
import com.cucumbertestrunner.TestRunner;
import com.pageobjectmanager.PageObjectManager;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends AdactinBaseClass{

	public static WebDriver driver = TestRunner.driver;

	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^User Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
		UrlLaunch("http://adactinhotelapp.com/");
	}

	@When("^User Enters The Username In The InputBox$")
	public void user_Enters_The_Username_In_The_InputBox() throws Throwable {
		sendValues(pom.getLogin().getUsername(), "Mageshyadav1999");
	}

	@When("^User Enters The Password In The InputBox$")
	public void user_Enters_The_Password_In_The_InputBox() throws Throwable {
		sendValues(pom.getLogin().getPassword(), "I19K0F");
	}

	@When("^User Clicks The Login Button And It Navigates To The SearchHotel Page$")
	public void user_Clicks_The_Login_Button_And_It_Navigates_To_The_SearchHotel_Page() throws Throwable {
		btnClick(pom.getLogin().getLogin_Btn());
	}

	@When("^User Selects The Location From The Dropdown$")
	public void user_Selects_The_Location_From_The_Dropdown() throws Throwable {
		dropselect(pom.getSearch().getLocation(), "index", "1");
	}

	@When("^User Selects The Hotels From The Dropdown$")
	public void user_Selects_The_Hotels_From_The_Dropdown() throws Throwable {
		dropselect(pom.getSearch().getHotels(), "text", "Hotel Creek");
	}

	@When("^User Selects The Roomtype From The Dropdown$")
	public void user_Selects_The_Roomtype_From_The_Dropdown() throws Throwable {
		dropselect(pom.getSearch().getRoom(), "text", "Double");
	}

	@When("^User Selects The Number Of Rooms From The Dropdown$")
	public void user_Selects_The_Number_Of_Rooms_From_The_Dropdown() throws Throwable {
		dropselect(pom.getSearch().getNo_of_rooms(), "index", "5");	    

	}

	@When("^User Clear And Enters Checkin Date In The InputBox$")
	public void user_Clear_And_Enters_Checkin_Date_In_The_InputBox() throws Throwable {
		clearInput(pom.getSearch().getCheckIn());
		sendValues(pom.getSearch().getCheckIn(), "25/05/2022");
	}

	@When("^User Clear And Enters Checkout Date In The InputBox$")
	public void user_Clear_And_Enters_Checkout_Date_In_The_InputBox() throws Throwable {
		clearInput(pom.getSearch().getCheckOut());
		sendValues(pom.getSearch().getCheckOut(), "30/05/2022");
	}

	@When("^User Selects The Adultsperroom From The Dropdown$")
	public void user_Selects_The_Adultsperroom_From_The_Dropdown() throws Throwable {
		dropselect(pom.getSearch().getAdult_Room(), "index", "3");
	}

	@When("^User Selects The Childrenperroom From The Dropdown$")
	public void user_Selects_The_Childrenperroom_From_The_Dropdown() throws Throwable {
		dropselect(pom.getSearch().getChild_Room(), "value", "2");
	}

	@Then("^User Clicks The Search Button And It Navigates To The SearchHotel Page$")
	public void user_Clicks_The_Search_Button_And_It_Navigates_To_The_SearchHotel_Page() throws Throwable {
		btnClick(pom.getSearch().getSearch_Btn());
	}

	@When("^User Verifies The Details and Selects The RadioButton$")
	public void user_Verifies_The_Details_and_Selects_The_RadioButton() throws Throwable {
		btnClick(pom.getSelect().getRadio_Btn());
	}

	@Then("^User Click The ContinueButton And It Navigates To Book A Hotel Page$")
	public void user_Click_The_ContinueButton_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
		btnClick(pom.getSelect().getContinue_Btn());
	}

	@When("^User Enters The FirstName In The InputBox$")
	public void user_Enters_The_FirstName_In_The_InputBox() throws Throwable {
		sendValues(pom.getBook().getF_Name(), "Magesh");
	}

	@When("^User Enters The Lastname In The InputBox$")
	public void user_Enters_The_Lastname_In_The_InputBox() throws Throwable {
		sendValues(pom.getBook().getL_Name(), "Kannappan");
	}

	@When("^User Enters The Billing Address In The InputBox$")
	public void user_Enters_The_Billing_Address_In_The_InputBox() throws Throwable {
		sendValues(pom.getBook().getAddress(), "Ambattur");
	}

	@When("^User Enters The Credit Card No In The InputBox$")
	public void user_Enters_The_Credit_Card_No_In_The_InputBox() throws Throwable {
		sendValues(pom.getBook().getCard_No(), "5260425022001234");
	}

	@When("^User Selects The Credit Card Type From The Dropdown$")
	public void user_Selects_The_Credit_Card_Type_From_The_Dropdown() throws Throwable {
		dropselect(pom.getBook().getCard_Type(), "text", "American Express");
	}

	@When("^User Selects The Expiry Date And Year From The Dropdowns$")
	public void user_Selects_The_Expiry_Date_And_Year_From_The_Dropdowns() throws Throwable {
		dropselect(pom.getBook().getExp_Month(), "text", "January");
		dropselect(pom.getBook().getExp_year(), "text", "2022");
	}

	@When("^User Enters The CVV Number In The InputBox$")
	public void user_Enters_The_CVV_Number_In_The_InputBox() throws Throwable {
		sendValues(pom.getBook().getCvv(), "126");
	}

	@Then("^User Clicks The BookNow Button And It Navigates To Booking Confirmation$")
	public void user_Clicks_The_BookNow_Button_And_It_Navigates_To_Booking_Confirmation() throws Throwable {
		btnClick(pom.getBook().getBook_Now());
	}

	@When("^User Selects The MyItinerary Button And It Navigates To Booked Itenarary Page$")
	public void user_Selects_The_MyItinerary_Button_And_It_Navigates_To_Booked_Itenarary_Page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		btnClick(pom.getBook_confirm().getItinerary());
	}
	
	@When("^User Clicks The Logoout Button$")
	public void user_Clicks_The_Logoout_Button() throws Throwable {
		snap("Adactin_Snap_01");
		btnClick(pom.getBook_confirm().getLogout_Btn());
	}

	@When("^User Verifies the Details And Checks The CheckBox$")
	public void user_Verifies_the_Details_And_Checks_The_CheckBox() throws Throwable {
		//Do Nothing
	}

	@When("^User Clicks The SearchHotel Button$")
	public void user_Clicks_The_SearchHotel_Button() throws Throwable {
		//Do Nothing
	}


}
