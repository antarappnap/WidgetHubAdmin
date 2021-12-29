package Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminList {


	public static void main(String[] args) throws InterruptedException {
		 
		 
	    // Start chrome browser
	 
	    System.setProperty("webdriver.chrome.driver", "/Users/appnapws20/Downloads/Automation/chromedriver");
			WebDriver driver = new ChromeDriver();
	 
	    // start the application
			driver.get("https://dev.wejet.app/APN040/Admin/Login");
			driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("kabir@appnap.io");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("KabirWeJet21#");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
