package com.selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.se
		
		System.setProperty("webdriver.chrome.driver", ".\\exes\\chromedriver.exe");
		//System.setProperty();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String uri = "http://the-internet.herokuapp.com/checkboxes";
		driver.get(uri);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		WebElement element = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		
		//boolean r = element.isEnabled();
		
		 if(element.isSelected()){
			 System.out.println("Element is already selected");
		 }else {
			
			element.click();
			 System.out.println("Element is clicked");
		}
	
		driver.close();
		driver.quit();
		
	}

}
