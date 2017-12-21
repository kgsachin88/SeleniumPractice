package com.selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\exes\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String uri = "http://the-internet.herokuapp.com/jqueryui/menu#";
		driver.get(uri);
		
		WebElement target1 = driver.findElement(By.linkText("Enabled"));
		WebElement target2 = driver.findElement(By.xpath("//a[text()='Back to JQuery UI']"));
		
		Actions action = new Actions(driver);	
		action.moveToElement(target1).click(target2).perform();
		
	}

}
