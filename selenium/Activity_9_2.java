package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity_9_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://training-support.net/selenium/selects");
		System.out.println("The Title of the page: " + driver.getTitle());

		
		WebElement multilist = driver.findElement(By.id("multi-select"));
		Select multiselect = new Select(multilist);
		if (multiselect.isMultiple())
		{
		multiselect.selectByVisibleText("Javascript");
		multiselect.selectByValue("node");
		multiselect.selectByIndex(4);
		multiselect.selectByIndex(5);
		multiselect.selectByIndex(6);
		
		multiselect.deselectByValue("node");
		multiselect.deselectByIndex(7);
        
		List<WebElement> options = multiselect.getAllSelectedOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement list = options.get(i);
			System.out.println("Drop Down Option " + (i+1) + ": " + list.getText());
		}

		}
		
		multiselect.deselectAll();

		driver.close();
	}
}
