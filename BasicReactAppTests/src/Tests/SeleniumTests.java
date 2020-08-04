package Tests;

import org.junit.Test;
import static org.junit.Assert.*;


import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SeleniumTests {

	WebDriver driver;
	String URL = "http://localhost:3000/Login";
	
	@Test
	public void DemoSiteTest_01_ReachSite() {
		System.setProperty("webdriver.gecko.driver", ".//drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(URL);
		assertEquals(driver.getCurrentUrl(), URL);
		driver.close();
	}
}
