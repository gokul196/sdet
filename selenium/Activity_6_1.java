package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_6_1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,20);

		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("The Title of the page: " + driver.getTitle());
		
		WebElement checkbox = driver.findElement(By.cssSelector(".willDisappear[type=checkbox]"));
		WebElement enablebtn = driver.findElement(By.id("toggleCheckbox"));


		enablebtn.click();
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		System.out.println("Is the checkbox displayed: " + checkbox.isDisplayed());
		
		enablebtn.click();
		wait.until(ExpectedConditions.visibilityOf(checkbox));
		System.out.println("Is the checkbox displyed after Addbox click: " + checkbox.isDisplayed());
		
		driver.close();
	}
}
