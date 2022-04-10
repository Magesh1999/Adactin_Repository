package com.testng;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.AdactinBaseClass;
import com.pageobjectmanager.PageObjectManager;

//Annotations

//	1.Timeout *
//	2.Invocation Count *
//	3.Priority *
//	4.Depends on *
//	5.Expected Exception *
// 
//	6.Cross browser test
//	7.Grouping*
//	8.Ignore*
//	9.Parallel*
// 10.Parameterized*
// 11.Data Provider
//	
//	
//	Simple Annotations
//	XML Edits
//	STCM and MCTS
//	Test Reports View
//	Whole Exception VS Single Exception

public class Test_Ng extends AdactinBaseClass {

	WebDriver driver;
	PageObjectManager pom = new PageObjectManager(driver);

	@BeforeSuite
	public void setprop() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Magesh\\eclipse-workspace\\Adactin_Project\\Drivers\\chromedriver_99.0.4844.51.exe");
	}

	@BeforeTest
	public void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@BeforeClass
	public void urlLaunch() {
		driver.get("http://adactinhotelapp.com/");
	}

	@BeforeMethod
	public void login() {
		driver.findElement(By.id("username")).sendKeys("Mageshyadav1999");
		driver.findElement(By.id("password")).sendKeys("I19K0F");
		driver.findElement(By.id("login")).click();
	}
	
	@Test
	public void search() {
		
		WebElement location_Drop = driver.findElement(By.xpath("//select[1]"));
		Select s1 = new Select(location_Drop);
		if (s1.isMultiple()) {
			// Do nothing
		} else {
			s1.selectByIndex(5);
		}

		WebElement hotel_Drop = driver
				.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[3]/td[2]/select"));
		Select s2 = new Select(hotel_Drop);
		s2.selectByVisibleText("Hotel Sunshine");
	// Changing the Hotel
		s2.selectByValue("Hotel Creek");

		WebElement room_Type = driver.findElement(By.xpath("//select[@id='room_type']"));
		room_Type.sendKeys("Super Deluxe");

		WebElement no_Of_Rooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s3 = new Select(no_Of_Rooms);
		s3.selectByVisibleText("3 - Three");

		WebElement check_In = driver.findElement(By.name("datepick_in"));
		check_In.clear();
		check_In.sendKeys("15/03/2022");

		WebElement check_Out = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		check_Out.clear();
		check_Out.sendKeys("31/03/2022");

		WebElement adult_Room = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adult_Room);
		java.util.List<WebElement> options = s4.getOptions();
		System.out.println("\n");
		for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);
			if (text.contentEquals("2 - Two")) {
				adult_Room.sendKeys("2 - Two");
			}
		}

		WebElement child_Room = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select s5 = new Select(child_Room);
		s5.selectByValue("1");

		WebElement search_Btn = driver.findElement(By.xpath("//input[@type='submit']"));
		search_Btn.click();
	}

	@AfterMethod
	public void logout() {
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterClass
	public void tabclose() {
		driver.close();
	}
	
	@AfterTest
	public void quit() {
		driver.quit();
	}
	
	@AfterSuite
	public void cookie() {
		System.out.println("cookie");
	}
}

