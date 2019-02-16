package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours {
	
	public static void main(String[] args) throws InterruptedException {
		
		String url="http://newtours.demoaut.com/";
		String userName="tutorial";
		String password="tutorial";
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/ibadatabdilazhankyzy/Documents/Libraries/drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("userName")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		//Check title
		if(driver.getTitle().equals("Find a Flight: Mercury Tours:") ){
			System.out.println("Title check passed");
		}else{
			System.out.println("Title check failed");
		}
		//Check Flight finder image
		boolean imageDisplayed=driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed();
		if(imageDisplayed){
			System.out.println("Flight finder image check passed");
		}else{
			System.out.println("Flight finder image check failed");
		}
		//Check Preferences label
		boolean preferencesDisplayed=driver.findElement(By.xpath("//font[.='Preferences']")).isDisplayed();
		if(preferencesDisplayed){
			System.out.println("Preferences label check passed");
		}else{
			System.out.println("Preferences label check failed");			
		}
		
		driver.quit();
	
		
	}

}

