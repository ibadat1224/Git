package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AnotherTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"/Users/ibadatabdilazhankyzy/Documents/selenium dependencies/driver/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("http://www.cybertekschool.com");

		String expected = "cybertekschool";
		String actual = ("http://www.cybertekschool.com");

		if (actual.contains(expected)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
			System.out.println("Expected:\t" + expected);
			System.out.println("Actual:\t" + actual);

		}
		driver.navigate().to("http://www.google.com");
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

		driver.navigate().forward();
		Thread.sleep(1000);
	}

}
