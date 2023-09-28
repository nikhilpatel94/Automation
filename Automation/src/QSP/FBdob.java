package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBdob {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select s= new Select(day);
		s.selectByIndex(16);
		WebElement month = driver.findElement(By.id("month"));
		Select s1= new Select(month);
		s1.selectByValue("11");
		WebElement year = driver.findElement(By.id("year"));
		Select s2= new Select(year);
		s2.selectByVisibleText("1999");
		driver.quit();
		
	}

}
