package QSP;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bbbclatestnews {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bbc.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	List<WebElement> Latestnews = driver.findElements(By.xpath("//li[@class='top-list-item top-list-item__1 top-list-item--ranked top-list-item--odd']/../li"));
	for(int i=0;i<Latestnews.size();i++) {
		String text = Latestnews.get(i).getText();
		System.out.println(text);}
	driver.quit();

}
}