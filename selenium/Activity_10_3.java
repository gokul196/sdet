package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_10_3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);

		driver.get("https://training-support.net/selenium/drag-drop");
		System.out.println("The Title of the page: " + driver.getTitle());

        WebElement ball = driver.findElement(By.id("draggable"));    	
        WebElement dropzone1 = driver.findElement(By.id("droppable"));    	
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));    	

        
        actions.clickAndHold(ball).moveToElement(dropzone1).release().build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dropzone1, "background-color"));
        System.out.println("Ball dropped to Dropzone1");	

        actions.clickAndHold(ball).moveToElement(dropzone2).release().build().perform();
        System.out.println("Ball dropped to Dropzone2 too");	
 
		driver.close();
	}
}
