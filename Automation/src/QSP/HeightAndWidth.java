package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightAndWidth {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		int f = driver.findElement(By.xpath("//input[@value='1']")).getLocation().getY();
		int m = driver.findElement(By.xpath("//input[@value='2']")).getLocation().getY();
		int o = driver.findElement(By.xpath("//input[@value='-1']")).getLocation().getY();
		
	if(f==m && f==o)
		System.out.println("Yes");
	else
		System.out.println("No");
	driver.quit();
		
	}

}

