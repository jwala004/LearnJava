package java8.by.locatorstrategy;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.openqa.selenium.By;

public final class LocatorFactory {

	private LocatorFactory() {

	}

	private static final Map<String, Function<String, By>> MAP = new HashMap<>();

//	private static final Function<String, By> XPATH	= (value) -> By.xpath(value);
//	private static final Function<String, By> ID	= (value) -> By.xpath(value);
//	private static final Function<String, By> NAME	= (value) -> By.xpath(value);
//	
//	static {
//		MAP.put("xpath", XPATH);
//		MAP.put("id", ID);
//		MAP.put("name",NAME);
//	}

//	or write the above code like below
	static {
		MAP.put("xpath", By::xpath);
		MAP.put("id", By::id);
		MAP.put("name", By::name);
	}

	public static By getByLocator(String locator, String value) {
		return MAP.get(locator).apply(value);
	}

}
