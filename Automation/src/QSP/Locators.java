package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
        driver.findElement(By.cssSelector("button[id='user_login_btn']")).submit();
        Thread.sleep(2000);
        driver.quit();
        
        
	}

}
