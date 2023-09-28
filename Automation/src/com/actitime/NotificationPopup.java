package com.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.yatra.com/?utm_source=adwords&utm_medium=performance_max&utm_campaign=brand&utm_source=google&utm_medium=cpc&utm_campaign=&gclid=Cj0KCQjwl8anBhCFARIsAKbbpyT-UIFay_Ti1-tdE7X8J6wzk6QWSW-fQf6ecvWTpiLo4DtYIliYmc8aAnNFEALw_wcB");
	}

}
