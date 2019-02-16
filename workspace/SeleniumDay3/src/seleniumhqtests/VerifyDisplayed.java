package seleniumhqtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyDisplayed {

	public static void main(String[] args) {
		
//		Goto new tours home page and 
//		verify that the following elements are displayed
//		1) Sign on, Register, Support , contact links
		String url="http://newtours.demoaut.com/";
		String userName="tutorial";
		String password="tutorial";
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/ibadatabdilazhankyzy/Documents/Libraries/drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		boolean signOn=driver.findElement(By.linkText("SIGN-ON")).isDisplayed();
		boolean register=driver.findElement(By.linkText("REGISTER")).isDisplayed();
		boolean support=driver.findElement(By.xpath("//a[.='SUPPORT']")).isDisplayed();
		boolean contact=driver.findElement(By.xpath("//a[.='CONTACT']")).isDisplayed();
		
		if(signOn && register && support && contact){
			System.out.println("All of expected Tab links are displayed");
		}else{
			System.out.println("NOT All of expected Tab links are displayed");
		}
		//Click on COntact then verify BackToHome is displayed.
		driver.findElement(By.xpath("//a[.='CONTACT']")).click();
		boolean backToHome=driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']")).isDisplayed();
		if(backToHome){
			System.out.println("BackToHome check passed");
		}else{
			System.out.println("BackToHome check failed");		
		}
		
		driver.quit();
		
	}

}




