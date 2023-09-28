package QSP;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage {
	public static void main(String[] args) throws InterruptedException { 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		
		driver.quit();
		
		
	}

}
