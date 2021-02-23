package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class Activity_11_4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        
		driver.get("https://www.training-support.net/selenium/tab-opener");
		System.out.println("The Title of the page: " + driver.getTitle());

        WebElement launcher = driver.findElement(By.id("launcher"));   
        launcher.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    	
        Set<String> allWindowHandles = driver.getWindowHandles();
	
        System.out.println("All window handles: " + allWindowHandles);
	
	
        for (String handle : driver.getWindowHandles()) {
	
            driver.switchTo().window(handle);
	
        }
	
        System.out.println("Current window handle: " + driver.getWindowHandle());
	
        wait.until(ExpectedConditions.titleIs("Newtab"));
        System.out.println("New Tab Title is: " + driver.getTitle());

        String newTabText = driver.findElement(By.xpath("//div[@class='content']")).getText();
        System.out.println("New tab heading is: " + newTabText);
	
        driver.findElement(By.linkText("Open Another One!")).click();
	
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
	
        allWindowHandles = driver.getWindowHandles();
	
        System.out.println("All window handles: " + allWindowHandles);
	
        for (String handle : driver.getWindowHandles()) {
	
            driver.switchTo().window(handle);
	
        }

	
        System.out.println("New tab handle: " + driver.getWindowHandle());
	
        wait.until(ExpectedConditions.titleIs("Newtab2"));
	
        System.out.println("New Tab Title is: " + driver.getTitle());
	
        newTabText = driver.findElement(By.xpath("//div[@class='content']")).getText();
	
        System.out.println("New tab heading is: " + newTabText);

	
        driver.quit();
	
    }
	
}