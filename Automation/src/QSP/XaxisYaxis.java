package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XaxisYaxis {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	int X = driver.findElement(By.name("login")).getLocation().getX();
	int Y = driver.findElement(By.name("login")).getLocation().getY();
	System.out.println(X);
	System.out.println(Y);
	driver.quit();
	
}
}
