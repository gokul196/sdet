package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_1 {
    WebDriver driver;
  
	@BeforeMethod
	public void browser() {
	    driver = new FirefoxDriver();
	    driver.get("https://www.training-support.net");
	}
	
	@Test
	public void perform() {
        String title = driver.getTitle();
	
        System.out.println("Page title is: " + title);

        Assert.assertEquals("Training Support", title);
	
        driver.findElement(By.id("about-link")).click();
	
        System.out.println("New page title is: " + driver.getTitle());
	
        Assert.assertEquals(driver.getTitle(), "About Training Support");
	}
   
	@AfterMethod	
    public void closing() {
		
        driver.quit();
	
    }
}
