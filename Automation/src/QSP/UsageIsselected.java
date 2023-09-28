package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageIsselected {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	boolean res = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
	if(res)
		System.out.println("Web element is selected");
	else
		System.out.println("Web element is not selected");
	driver.quit();
	
}
}

