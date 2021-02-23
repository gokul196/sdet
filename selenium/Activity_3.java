package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		
		System.out.println("The Title of the page: " + driver.getTitle());
		
		WebElement firstName = driver.findElement(By.id("firstName"));		
		WebElement lastName = driver.findElement(By.id("lastName"));
		WebElement email = driver.findElement(By.cssSelector("[type=email]"));		
		WebElement contactnum = driver.findElement(By.cssSelector("[type=Tel]"));
		
		firstName.sendKeys("Gokul");
		Thread.sleep(1000);
		lastName.sendKeys("password_123");
		Thread.sleep(1000);
		email.sendKeys("gokul6mani1992@gmail.com");
		Thread.sleep(1000);
		contactnum.sendKeys("9952000399");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector(".ui.green.button[value=submit]")).submit();
		Thread.sleep(1000);

		driver.close();
		
	}

}
