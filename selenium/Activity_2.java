package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_2 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		
		System.out.println("The Title of the page: " + driver.getTitle());
		
		WebElement aboutusid = driver.findElement(By.id("about-link"));
		System.out.println("The Text found through id search: " + aboutusid.getText());
		
		WebElement aboutusclass = driver.findElement(By.className("inverted"));
		System.out.println("The Text found through classname search: " + aboutusclass.getText());
		
		WebElement aboutuscss = driver.findElement(By.cssSelector("[href=about]"));
		System.out.println("The Text found through cssselector search: " + aboutuscss.getText());
		
		WebElement aboutuslinktext = driver.findElement(By.linkText("About Us"));
		System.out.println("The Text found through linkText search: " + aboutuslinktext.getText());
		
		driver.close();
		
	}

}
