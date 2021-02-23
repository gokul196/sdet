package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity_4_3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		
		System.out.println("The Title of the page: " + driver.getTitle());
		
		WebElement thirdheader = driver.findElement(By.xpath("//h3[@id=\"third-header\"]"));
		System.out.println("The third header text: " + thirdheader.getText());
		
		WebElement fifthheader = driver.findElement(By.xpath("//h5[@class=\"ui green header\"]"));
		System.out.println("Color of the fifth header: " + Color.fromString(fifthheader.getCssValue("color")).asHex());
		
		WebElement violetbtn = driver.findElement(By.xpath("//button[@class=\"ui violet button\"]"));	
		System.out.println("Class values of voilet button: " + violetbtn.getAttribute("class"));
		
		WebElement greybtn = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
		System.out.println("The grey button text: " + greybtn.getText());


		driver.close();
	}
}
