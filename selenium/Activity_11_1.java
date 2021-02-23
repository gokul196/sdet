package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.Alert;

public class Activity_11_1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("The Title of the page: " + driver.getTitle());

        driver.findElement(By.id("simple")).click();   
        
        Alert simpleAlert = driver.switchTo().alert();        
        System.out.println("Alert text is: " + simpleAlert.getText());
        simpleAlert.accept();
 
		driver.close();
	}
}
