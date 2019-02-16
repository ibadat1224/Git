package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenticationTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/ibadatabdilazhankyzy/Documents/selenium dependencies/driver/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://testing-ground.scraping.pro/login");
		Thread.sleep(2000);
		driver.findElement(By.name("usr")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("12345");
		driver.findElement(By.name("login")).click();

		driver.findElement(By.cssSelector("input[type='submit']")).click();

		String actual = driver.getTitle();
		String expected = "welcome";

		if (actual.contains(expected)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
			System.out.println("Expected:\t" + expected);
			System.out.println("Actual:\t" + actual);

		}

	}

}
