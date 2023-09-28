package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HeightWidthUnPwd {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int height = driver.findElement(By.xpath("(//td[@valign='middle'])[1]")).getSize().height;
		System.out.println("UN H "+height);
		int width = driver.findElement(By.xpath("(//td[@valign='middle'])[1]")).getSize().width;
		System.out.println("UN W "+width);
		int height1 = driver.findElement(By.xpath("(//td[@valign='middle'])[2]")).getSize().height;
		System.out.println(height1);
		int width1 = driver.findElement(By.xpath("(//td[@valign='middle'])[2]")).getSize().width;
		System.out.println(width1);
		
		if (height==height1 && width==width1)
		{System.out.println("pass");
	}
		else 
		{System.out.println("fail");
		}
		driver.quit();
		}
}
		
		
	

