package com.paynet.basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class LunchBrowserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TA-Windows-VM\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://google.com/");
		
		String title=driver.getTitle();
		
		String url=driver.getCurrentUrl();
		
		String pageSource=driver.getPageSource();
		
		driver.quit();
	}

}
