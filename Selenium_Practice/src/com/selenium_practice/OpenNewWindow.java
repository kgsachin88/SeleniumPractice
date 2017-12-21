package com.selenium_practice;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\exes\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String uri = "http://the-internet.herokuapp.com/javascript_alerts";
		driver.get(uri);

		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.open('about:blank','_blank')");
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://www.w3schools.com/sql/");
		driver.close(); // This will close the child window 
		
	}

}
