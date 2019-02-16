package webtesters;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class EtsyFunctionalTests {
	WebDriver driver;

	@BeforeTest
	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver", "/Users/cybertek/Documents/Libraries/drivers/chromedriver");
		driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://etsy.com");

	}

	@AfterTest
	public void shutDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

	@Test(priority = 0)
	public void testErrorMessage() throws InterruptedException {
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("first-name")).sendKeys("John");
		driver.findElement(By.id("last-name")).sendKeys("Smith");
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("password-repeat")).sendKeys("password");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("thisismyusername");
		driver.findElement(By.id("register_button")).click();
		assertTrue(driver.findElement(By.id("email-error")).isDisplayed());

	}

	@Test(priority = 1)
	public void testUselessBox() {
		WebElement inputBox = driver.findElement(By.id("search-query"));
		String hint = inputBox.getAttribute("placeholder");
		System.out.println(hint);
		assertEquals(hint, "Search for items or shops");
		inputBox.sendKeys("useless box");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("(//div[@title='Most Useless Machine Black USELESS BOX'])[2]")).click();
		driver.findElement(By.className("btn-transaction")).click();
		assertTrue(driver.findElement(By.cssSelector("input[value='paypal']")).isSelected());

	}

	@Test(priority = 2)
	public void testCharger() {
		WebElement numberOfItems = driver.findElement(By.cssSelector("a[title='Cart'] span[class*='count']"));
		// a[@title='Cart']//span[contains(@class,'count')]
		assertEquals(numberOfItems.getText(), "");

		WebElement inputBox = driver.findElement(By.id("search-query"));
		inputBox.sendKeys("charger");
		driver.findElement(By.tagName("button")).click();
		WebElement anyPrice = driver.findElement(By.cssSelector("input[value='_']"));
		WebElement under25 = driver.findElement(By.cssSelector("input[value='_25']"));
		assertTrue(anyPrice.isSelected());
		assertFalse(under25.isSelected());
	}
}
