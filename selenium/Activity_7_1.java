package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_7_1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,20);

		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println("The Title of the page: " + driver.getTitle());

		
		WebElement username = driver.findElement(By.cssSelector("[class^='username-']"));
    	WebElement password = driver.findElement(By.xpath("//input[starts-with(@class,'password-')]"));
       	WebElement loginbtn = driver.findElement(By.cssSelector("[onclick=\"signIn()\"]"));
       	
       	username.sendKeys("admin");
       	password.sendKeys("password");
       	loginbtn.click();

       	WebElement loginmessage = driver.findElement(By.id("action-confirmation"));

        wait.until(ExpectedConditions.textToBePresentInElement(loginmessage, "Welcome Back, admin"));    	
        System.out.println(loginmessage.getText());

		driver.close();
	}
}
