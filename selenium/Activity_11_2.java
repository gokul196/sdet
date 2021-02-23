package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.Alert;

public class Activity_11_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("The Title of the page: " + driver.getTitle());

        WebElement confirmbtn = driver.findElement(By.id("confirm"));   
        confirmbtn.click();
        
        Alert confirmAlert = driver.switchTo().alert();        
        System.out.println("Alert text is: " + confirmAlert.getText());
        confirmAlert.accept();
        
        confirmbtn.click();
        confirmAlert.dismiss();
 
		driver.close();
	}
}
