package com.selenium_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\exes\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String uri = "http://the-internet.herokuapp.com/dropdown";
		driver.get(uri);
		
		WebElement dd = driver.findElement(By.id("dropdown"));
		
		Select oSelect = new Select(dd);
		
		List<WebElement> options = oSelect.getOptions();
		System.out.println(options.size());
		
		for (WebElement webElement : options) {
			
			System.out.println(webElement.getText());
		}
		
		boolean state = oSelect.isMultiple();
		System.out.println(state);
		oSelect.selectByIndex(2);
		
		Thread.sleep(10);
		driver.quit();

	}

}
