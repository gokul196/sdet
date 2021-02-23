package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_6_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,20);

		driver.get("https://training-support.net/selenium/ajax");
		WebElement changebtn = driver.findElement(By.cssSelector(".ui.violet.button"));
    	changebtn.click();
    	
    	WebElement ajaxelement = driver.findElement(By.xpath("//div[@id='ajax-content']"));
        wait.until(ExpectedConditions.textToBePresentInElement(ajaxelement, "HELLO!"));    	
        System.out.println(ajaxelement.getText());
        
        wait.until(ExpectedConditions.textToBePresentInElement(ajaxelement, "I'm late!"));
        System.out.println(ajaxelement.getText());

		driver.close();
	}
}
