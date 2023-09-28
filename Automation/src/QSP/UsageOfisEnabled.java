package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfisEnabled {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.name("login"));
		boolean res = ele.isEnabled();
		if(res)
			System.out.println("web element is enabled");
		else
			System.out.println("web element is not enabled");
		driver.quit();
	}

}
