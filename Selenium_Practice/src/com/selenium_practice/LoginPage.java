package com.selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\exes\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String uri = "http://the-internet.herokuapp.com/login";
		driver.get(uri);
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		WebElement username = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.id("password"));
				
		username.clear();
		username.sendKeys("tomsmith");
				
		pwd.clear();
		pwd.sendKeys("SuperSecretPassword!");
		
		driver.findElement(By.xpath("//*[text()=' Login']")).click();
		
		wait.until(ExpectedConditions.titleContains(driver.getTitle()));
		
		driver.close();
	}

}
