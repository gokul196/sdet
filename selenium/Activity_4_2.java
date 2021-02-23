package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		
		System.out.println("The Title of the page: " + driver.getTitle());
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id=\"firstName\"]"));		
		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		WebElement email = driver.findElement(By.xpath("//input[@type=\"email\"]"));		
		WebElement contactnum = driver.findElement(By.xpath("//input[@pattern=\"[0-9]{10}\"][@id=\"number\"]"));
		
		firstName.sendKeys("Gokul");
		Thread.sleep(1000);
		lastName.sendKeys("password_123");
		Thread.sleep(1000);
		email.sendKeys("gokul6mani1992@gmail.com");
		Thread.sleep(1000);
		contactnum.sendKeys("9952000399");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class=\"ui green button\"]")).submit();
		Thread.sleep(1000);

		driver.close();
	}
}
