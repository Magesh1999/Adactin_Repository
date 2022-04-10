package com.testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.security.Password;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.beust.jcommander.Parameter;

//XML
// Parameter XML - Down the Suite <parameter>
// Parallel XML - <Test>
//	Ignore
// Grouping Down the test <group> & <run> & <incluide or Exclude>


public class Facebook_Login {

	WebDriver driver;

	@Test(timeOut = 5000)
	public void launch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Magesh\\eclipse-workspace\\Adactin_Project\\Drivers\\chromedriver_99.0.4844.51.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@Test(groups = "facebook", priority = 0, dataProvider = "data") @Parameters({"username"})
	
	public void username(String user) throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys(user);
		Thread.sleep(1000);
	}

	@Test (dependsOnMethods = "username", groups = "facebook", priority = 1, dataProvider = "data2")@Parameters("pass")
	public void password(String pass) throws InterruptedException {
		driver.findElement(By.id("pass")).sendKeys(pass);
		Thread.sleep(1000);
	}

	@Test(priority = 2)
	public void login() {
		driver.findElement(By.name("login")).click();
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void arith() {
		int c = 5/0;
		System.out.println(c);
	}

	@DataProvider(name = "data")
	public Object[][] dataprovider() {
		
		return new Object[][] {
			{"Magesh"}
		};
	}
	
	@DataProvider(name = "data2")
	public Object[][] dataprovider2() {
		
		return new Object[][] {
			{"#@CHkj"}
		};
	}
	



}
