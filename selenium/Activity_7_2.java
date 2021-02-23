package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_7_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,20);

		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println("The Title of the page: " + driver.getTitle());
		String user_name = "Gokulakrishnan";
		String pass_word = "password@123";
		String email_address = "gokul6mani1992@gmail.com";
		
		WebElement username = driver.findElement(By.cssSelector("[class$='-username']"));
    	WebElement password = driver.findElement(By.cssSelector("[class$='-password']"));
    	WebElement conpassword = driver.findElement(By.xpath("//div[@class='ui form segment']/div[3]/input"));
    	WebElement email = driver.findElement(By.cssSelector("[type=\"email\"]"));

    	WebElement logonbtn = driver.findElement(By.cssSelector("[onclick='signUp()']"));
       	
       	username.sendKeys(user_name);
       	password.sendKeys(pass_word);
       	conpassword.sendKeys(pass_word);
       	email.sendKeys(email_address);

       	logonbtn.click();

       	WebElement logonmessage = driver.findElement(By.id("action-confirmation"));

        wait.until(ExpectedConditions.textToBePresentInElement(logonmessage, "Thank you for registering, "+user_name));    	
        System.out.println(logonmessage.getText());

		driver.close();
	}
}
