package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ListOfElements {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/ibadatabdilazhankyzy/Documents/Libraries/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void findAllLinks() {
		driver.get("http://www.google.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		// prints the first link in the list
		System.out.println(links.get(10).getText());

	}
}
