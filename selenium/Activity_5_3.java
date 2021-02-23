package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		System.out.println("The Title of the page: " + driver.getTitle());
		
		WebElement textbox = driver.findElement(By.cssSelector("[type=\"text\"]"));
		System.out.println("Is the testbox enabled: " + textbox.isEnabled());
		
		WebElement enablebtn = driver.findElement(By.cssSelector("[onclick=\"toggleInput()\"]"));

		
		enablebtn.click();		
		System.out.println("Is the testbox enabled after enable button click: " + textbox.isEnabled());
		
		driver.close();
	}
}
