package Admin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Add {


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
			
			List<WebElement> list = driver.findElements(By.xpath("//ul/li[@class='nav-item has-treeview ']"));

		    for (WebElement ele : list)
		 
		    {
			     //System.out.println("Values " + ele.getAttribute("innerHTML"));
			
			     if (ele.getAttribute("innerHTML").contains("Admins")) {
		
				       ele.click();
			
				       break;
			 
			     }
			     else {
			    	 System.out.println("No Elements Found");
			     }
		 
		    }  
		    driver.findElement(By.xpath("//li[2]/ul/li[1]/a")).click();
		    driver.findElement(By.id("name")).sendKeys("Alam");
		    driver.findElement(By.id("email")).sendKeys("alam@appnap.io");
		    driver.findElement(By.id("exampleInputPassword1")).sendKeys("KabirWeJet21#");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    
	}
}

