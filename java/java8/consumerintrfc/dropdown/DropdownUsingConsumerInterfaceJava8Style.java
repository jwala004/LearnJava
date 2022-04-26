package java8.consumerintrfc.dropdown;

import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.util.concurrent.Uninterruptibles;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownUsingConsumerInterfaceJava8Style {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");

		WebElement element = driver.findElement(By.id("oldSelectMenu"));
		
		selectValueFromDropDown(e -> e.selectByVisibleText("Magenta"), element);

		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		selectValueFromDropDown(e -> e.selectByValue("3"), element);

		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		selectValueFromDropDown(e -> e.selectByIndex(6), element);

	}

	private static void selectValueFromDropDown(Consumer<Select> consumer, WebElement element) {
		consumer.accept(new Select(element));
		
	}

}
