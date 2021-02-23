package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_8_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://training-support.net/selenium/tables");
		System.out.println("The Title of the page: " + driver.getTitle());

		
		List<WebElement> column = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[1]/td"));
		System.out.println("No of Columns in the sortable table: " + column.size());
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr"));
		System.out.println("No of Rows in the sortable table: " + row.size());

       	
       	WebElement secrowcol = driver.findElement(By.xpath("//table[@class='ui sortable celled table']/tbody/tr[2]/td[2]"));
       	System.out.println("Value from second row second column: " + secrowcol.getText());
       	
       	WebElement firstheader = driver.findElement(By.xpath("//table[@class='ui sortable celled table']/thead/tr/th[1]"));
       	firstheader.click();
       	
       	WebElement secrowcolsort = driver.findElement(By.xpath("//table[@class='ui sortable celled table']/tbody/tr[2]/td[2]"));
       	System.out.println("Value from second row second column after asc sort: " + secrowcolsort.getText());

		driver.close();
	}
}
