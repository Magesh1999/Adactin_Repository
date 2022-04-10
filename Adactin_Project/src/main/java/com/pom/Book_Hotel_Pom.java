package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel_Pom {
	
	public WebDriver driver;

	@FindBy(id = "first_name")
	private WebElement f_Name;

	@FindBy(id = "last_name")
	private WebElement l_Name;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement card_No;

	@FindBy(id ="cc_type")
	private WebElement card_Type;

	@FindBy(id = "cc_exp_month" )
	private WebElement exp_Month;

	@FindBy(id = "cc_exp_year")
	private WebElement exp_year;

	@FindBy(id = "cc_cvv")
	private WebElement cvv;

	@FindBy(id ="book_now")
	private WebElement book_Now;

	@FindBy(id = "cancel")
	private WebElement cancel;

	public WebElement getF_Name() {
		return f_Name;
	}

	public WebElement getL_Name() {
		return l_Name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCard_No() {
		return card_No;
	}

	public WebElement getCard_Type() {
		return card_Type;
	}

	public WebElement getExp_Month() {
		return exp_Month;
	}

	public WebElement getExp_year() {
		return exp_year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook_Now() {
		return book_Now;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public Book_Hotel_Pom(WebDriver runner_driver) {
		this.driver = runner_driver;
		PageFactory.initElements(driver, this);

	}
}
