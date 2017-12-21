package com.selenium_practice;

import java.util.concurrent.TimeUnit;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts_practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\exes\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String uri = "http://the-internet.herokuapp.com/javascript_alerts";
		driver.get(uri);
		
		WebElement jsAlert = driver.findElement(By.xpath("//*[@onclick='jsAlert()']"));
		jsAlert.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		resul(driver);

		
		WebElement jsConfirm = driver.findElement(By.xpath("//*[@onclick='jsConfirm()']"));
		jsConfirm.click();
		alert.accept();
		resul(driver);
		jsConfirm.click();
		alert.dismiss();
		resul(driver);
		
		WebElement jsPrompt = driver.findElement(By.xpath("//*[@onclick='jsPrompt()']"));
		jsPrompt.click();
		alert.sendKeys("Hi");
		alert.accept();
		resul(driver);
		jsPrompt.click();
		alert.dismiss();
		resul(driver);
		
		driver.close();
		driver.quit();
		}
	
	
	
	
		public static void resul(WebDriver driver){
		
		WebElement Result = driver.findElement(By.id("result"));
		System.out.println(Result.getText());
		
	}
		


}
