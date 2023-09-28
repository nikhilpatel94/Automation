package QSP;


	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class BBc {
		public static void main(String[] args) {
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.bbc.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<WebElement> Latestnews = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']/../h3"));
		for(int i=0;i<Latestnews.size();i++) {
			String text = Latestnews.get(i).getText();
			System.out.println(text);}
		driver.quit();

	}
	}


