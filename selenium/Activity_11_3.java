package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.Alert;

public class Activity_11_3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("The Title of the page: " + driver.getTitle());

        WebElement promptbtn = driver.findElement(By.id("prompt"));   
        promptbtn.click();
        
        Alert promptAlert = driver.switchTo().alert();        
        System.out.println("Alert text is: " + promptAlert.getText());
        promptAlert.sendKeys("I accept");
        System.out.println("Alert text after input: " + promptAlert.getText());
        promptAlert.accept();
         
		driver.close();
	}
}
