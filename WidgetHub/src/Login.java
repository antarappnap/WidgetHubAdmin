import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		 
		 
	    // Start chrome browser
	 
	    System.setProperty("webdriver.chrome.driver", "/Users/appnapws20/Downloads/Automation/chromedriver");
			WebDriver driver = new ChromeDriver();
	 
	    // start the application
			driver.get("https://dev.wejet.app/APN040/Admin/Login");
	}
}
