package java8.by.locatorstrategy;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorStrategy {

	private By hamburgermenu = By.id("nav-hamburger-menu");
	private String menuitem = "//div[text()='%s']/parent::a";

	@Test
	public void locatorStrategyTest() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		click(driver, hamburgermenu);
		click(driver, "xpath", String.format(menuitem, "Mobiles, Computers"));
	}

	public void click(ChromeDriver driver, By by) {
		driver.findElement(by).click();
	}
	
	public void clickUsingJava8(ChromeDriver driver, String locator, String value) {
		By by = LocatorFactory.getByLocator(locator, value);
		click(driver,by);
	}

	public void click(ChromeDriver driver, String locator, String value) {
		if (locator.equalsIgnoreCase("id")) {
			driver.findElement(By.id(value)).click();
		} else if (locator.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(value)).click();
		} else if (locator.equalsIgnoreCase("name")) {
			driver.findElement(By.name(value)).click();
		} else {
			throw new RuntimeException("Locator strategy not found");
		}

	}

}
