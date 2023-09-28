package QSP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrl {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.facebook.com/"))
			System.out.println("PASS");
		else
			System.out.println("fail");
		driver.quit();
		}
	}


