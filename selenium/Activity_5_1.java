package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		System.out.println("The Title of the page: " + driver.getTitle());
		
		WebElement checkbox = driver.findElement(By.cssSelector(".willDisappear[type=checkbox]"));
		
		System.out.println("Is the checkbox displayed: " + checkbox.isDisplayed());
		
		checkbox.click();
		Thread.sleep(2000);
		System.out.println("Is the checkbox selected: " + checkbox.isSelected());
		
		WebElement removebox = driver.findElement(By.cssSelector("#toggleCheckbox"));
		removebox.click();
		Thread.sleep(2000);
		System.out.println("Is the checkbox displyed after removebox: " + checkbox.isDisplayed());
		
		driver.close();
	}
}
