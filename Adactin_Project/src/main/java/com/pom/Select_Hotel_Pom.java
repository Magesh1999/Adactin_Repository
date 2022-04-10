package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel_Pom {

	public WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement radio_Btn;

	@FindBy(id = "continue")
	private WebElement continue_Btn;

	@FindBy(id = "cancel")
	private WebElement cancel_Btn;

	public WebElement getRadio_Btn() {
		return radio_Btn;
	}

	public WebElement getContinue_Btn() {
		return continue_Btn;
	}

	public WebElement getCancel_Btn() {
		return cancel_Btn;
	}

	public Select_Hotel_Pom(WebDriver runner_driver) {

		this.driver = runner_driver;
		PageFactory.initElements(driver, this);
	}

}
