package com.BaseClass;
import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.Select;

public class AdactinBaseClass {

	//	Base Class Methods :
	//		-------------------------------------
	//
	//			1.	Browser launch() ***
	//			2.	Close() ***
	//			3.	Quit() ***
	//			4.	Navigate to() ****
	//			5.	Navigate back() *** 
	//			6.	Navigate forward () ***
	//			7.	Navigate refresh() ***
	//			8.	Get() ***
	//			9.	Alert() ***
	//			10.	Action(All methods from action class)
	//			11.	Frames()
	//			12.	Robot()
	//			13.	Window handles()
	//			14.	Drop down ()
	//			15.	Check box()
	//			16.	Is enable()
	//			17.	Is displayed()
	//			18.	Is selected()
	//			19.	Get options()
	//			20.	Get title()
	//			21.	Get current url()
	//			22.	Get text()
	//			23.	Get attribute()
	//			24.	Wait()
	//			25.	Take screenshot()
	//			26.	Scroll up and down()
	//			27.	Sendkeys()
	//			28.	Get first selected options()
	//			29.	Get all selected options()
	//			30.	Is multiple()
	//			31.	Click()
	//			32.RadioButton()

	public static WebDriver driver;

	//---------------------------------Browser Launch-----------------------------------------------

	public static WebDriver browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Magesh\\eclipse-workspace\\Adactin_Project\\Drivers\\chromedriver_100.exe");
			driver =  new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if 
		(browser.equalsIgnoreCase("gecko")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Magesh\\eclipse-workspace\\Adactin_Project\\Drivers\\chromedriver_New.exe");
			driver =  new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else {
			System.err.println("Invalid Browser");
		}
		return driver;
	}

	//------------------------------------------Close current Tab--------------------------------------------

	public static void closeTab() {
		driver.close();
	}

	//------------------------------------------Close all browser Tab----------------------------------------

	public static void quitBrowser() {
		driver.quit();
	}

	//------------------------------------------Navigate to-------------------------------------------------

	public static void navigateurl(String url) {
		driver.navigate().to(url);
	}

	//------------------------------------------Navigations-------------------------------------------------

	public static void navigate(String methods) {

		if (methods.equalsIgnoreCase("back")) {
			driver.navigate().back();
		}if (methods.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		} if (methods.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		} else{
			//System.err.println("Wrong Method");
		}
	}

	//------------------------------------------URL Launch with wait----------------------------------------

	public static void UrlLaunch(String url) {
		driver.get(url);
	}	

	//------------------------------------------Current URL and page Info------------------------------------

	public static void UrlpageInfo() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Url of the current page - "+ currentUrl);
		String title = driver.getTitle();
		System.out.println("Title of the current page - " + title);
	}

	//------------------------------------------Alert Box----------------------------------------------------------

	public static void switchAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	//------------------------------------------Confirm Box----------------------------------------------------------

	public static void switchConfirm(String acceptordismiss) {
		Alert confirm = driver.switchTo().alert();

		if (acceptordismiss.equalsIgnoreCase("accept")) {
			confirm.accept();
		}
		if (acceptordismiss.equalsIgnoreCase("dismiss")) {
			confirm.dismiss();
		} else 
		{
			//Do Nothing
		}
	}
	//------------------------------------------Prompt Box-------------------------------------------------------

	public static void switchPrompt(String prompttext) {
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys(prompttext);
		prompt.accept();
	}


	//------------------------------------------Mouse-------------------------------------------------------

	public static void mouse(WebElement element) {

		Actions action = new Actions(driver);
		action.click(element);
	}





	//------------------------------------------Full Screen----------------------------------------------

	public static void fullScreen() {
		driver.manage().window().fullscreen();
	}

	//------------------------------------------Maximize Screen----------------------------------------------

	public static void maximizeScreen() {
		driver.manage().window().maximize();
	}
	//------------------------------------------Minimize Screen----------------------------------------------

	public static void minimizeScreen() {
		//driver.manage().window().maximize();
	}

	//------------------------------------------Screenshot--------------------------------------------------
	public static void snap(String fileName) throws IOException {
		//	TakesScreenshot driver = null;
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Magesh\\eclipse-workspace\\Adactin_Project\\Screenshot\\"+fileName+".png");
		FileUtils.copyFile(Src, des);
	}

	//------------------------------------------Thread Sleep--------------------------------------------------

	public static void freeze() throws InterruptedException {
		Thread.sleep(5000);
	}

	//------------------------------------------Send Values---------------------------------------------------

	public static void sendValues(WebElement element,  String values) {
		element.sendKeys(values);
	}

	//------------------------------------------Button Click---------------------------------------------------

	public static void btnClick(WebElement element) {
		element.click();
	}

	//------------------------------------------URL navigate---------------------------------------------------

	public static void urlNavigate(String URL) {
		driver.navigate().to(URL);
	}




	//------------------------------------------Virtual Key-----------------------------------------------------

	public static void virtualkey(String Key ) throws AWTException {

		if (Key.equalsIgnoreCase("vk_enter")) 
		{
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		}

		if (Key.equalsIgnoreCase("vk_esc")) 
		{
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_ESCAPE);
			rb.keyRelease(KeyEvent.VK_ESCAPE);
		}
	}

	//------------------------------------------Send Values for input ----------------------------------------

	public static void  checkenabled(WebElement element, String values) {
		if (element.isEnabled()) {
			element.sendKeys(values);
		}
		else {
			System.err.println("Input box is Disabled");
		}
	}

	//------------------------------------------Attribute --------------------------------------------------

	public static void charFind(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}

	//------------------------------------------Count Tag Name-----------------------------------------------

	public static void tagCount(String tagName) {

		java.util.List<WebElement> tagCount = driver.findElements(By.tagName("input"));
		int size = tagCount.size();
		System.out.println("No of "+tagName+" count - "+size);
	}

	//------------------------------------------Clear Input---------------------------------------------------

	public static void clearInput(WebElement element) {
		element.clear();
	}

	//------------------------------------------Dropdown Select---------------------------------------------------

	public static void dropselect(WebElement element, String type, String value) {

		Select select = new Select(element);
		if (type.equalsIgnoreCase("index")) {
			select.selectByIndex(Integer.parseInt(value));
		}
		if (type.equalsIgnoreCase("value")) {
			select.selectByValue(value);
		}
		if (type.equalsIgnoreCase("text")) {
			select.selectByVisibleText(value);
		}
		else {
			//System.err.println("You entered wrong value");
		} 
	} 

	//------------------------------------------Dropdown Select---------------------------------------------------

	@SuppressWarnings("unused")
	private void dropdeselect(WebElement element, String type, String value) {

		Select deselect = new Select(element);
		if (type.equalsIgnoreCase("index")) {
			deselect.deselectByIndex(Integer.parseInt(value));
		}if (type.equalsIgnoreCase("value")) {
			deselect.deselectByValue(value);
			if (type.equalsIgnoreCase("text")) {
				deselect.deselectByVisibleText(value);
			}if (type.equalsIgnoreCase("all")) {
				deselect.deselectAll();
			}
		}
	}
	//------------------------------------------Radio Button---------------------------------------------------
	
	

}

