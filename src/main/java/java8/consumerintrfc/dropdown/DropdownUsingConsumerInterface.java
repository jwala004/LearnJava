package java8.consumerintrfc.dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.util.concurrent.Uninterruptibles;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownUsingConsumerInterface {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");

		WebElement element = driver.findElement(By.id("oldSelectMenu"));
		selectValueFromDropDown(element, "Magenta", "text");

		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		selectValueFromDropDown(element, "3", "index");

		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		selectValueFromDropDown(element, "6", "index");

	}

	private static void selectValueFromDropDown(WebElement element, String textorvalueorindex, String strategy) {

		Select select = new Select(element);
		if (strategy.equalsIgnoreCase("text")) {
			select.selectByVisibleText(textorvalueorindex);
		} else if (strategy.equalsIgnoreCase("value")) {
			select.selectByValue(textorvalueorindex);
		} else if (strategy.equalsIgnoreCase("index")) {
			select.selectByIndex(Integer.parseInt(textorvalueorindex));
		} else {
			System.out.println("Invalid strategy");
		}

	}

}
