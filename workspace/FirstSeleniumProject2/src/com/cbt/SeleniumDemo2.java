package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"/Users/ibadatabdilazhankyzy/Documents/selenium dependencies/driver/geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://google.com");

		String expected = "Google";
		String actual = driver.getTitle();
		System.out.println(actual);

		if (expected.equals(actual)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
			System.out.println("Expected:\t" + expected);
			System.out.println("Actual:\t" + actual);
		}

	}

}