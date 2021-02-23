package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity_10_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Actions actions = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS) ;

		driver.get("https://www.training-support.net/selenium/input-events");
		System.out.println("The Title of the page: " + driver.getTitle());

        WebElement pressedKey = driver.findElement(By.id("keyPressed"));    	
        
        actions.sendKeys("G").perform();
	
        Action act = actions.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build();
        act.perform();
	
        System.out.println("Pressed key is: " + pressedKey.getText());	
 
		driver.close();
	}
}
