package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity_9_1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://training-support.net/selenium/selects");
		System.out.println("The Title of the page: " + driver.getTitle());

		
		WebElement dropdown = driver.findElement(By.id("single-select"));
		Select selectdr = new Select(dropdown);
		
		selectdr.selectByVisibleText("Option 2");
		selectdr.selectByIndex(3);
		selectdr.selectByValue("4");
		
		List<WebElement> options = selectdr.getOptions();
		for (int i = 1; i < options.size(); i++) {
			WebElement list = options.get(i);
			System.out.println("Drop Down Option " + i + ": " + list.getText());
		}

		driver.close();
	}
}
