package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		
		System.out.println("The Title of the page: " + driver.getTitle());
		
		driver.findElement(By.xpath("//a[@id=\"about-link\"]")).click();
		
		System.out.println("The Title of the next page: " + driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
