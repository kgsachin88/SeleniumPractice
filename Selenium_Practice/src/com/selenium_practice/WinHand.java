package com.selenium_practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHand {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\exes\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String uri = "http://the-internet.herokuapp.com/windows";
		driver.get(uri);
		
		driver.findElement(By.linkText("Click Here")).click();
		String win1 = driver.getWindowHandle();
		System.out.println(win1);
		Set<String> win = driver.getWindowHandles();
		int num = win.size();
		
		for (String string : win) {
			System.out.println(string);
			driver.switchTo().window(string);
		}
		
		System.out.println(num);
		driver.quit();
	}

}
