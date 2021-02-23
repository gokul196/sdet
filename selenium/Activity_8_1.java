package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_8_1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://training-support.net/selenium/tables");
		System.out.println("The Title of the page: " + driver.getTitle());

		
		List<WebElement> column = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[1]/td"));
		System.out.println("No of Columns in the static table: " + column.size());
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr"));
		System.out.println("No of Rows in the static table: " + row.size());

		List<WebElement> thirdrow = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[3]/td"));
       	System.out.println("Values from third row: ");
       	int i=1;
       	for (WebElement values : thirdrow)
       	{	
       	System.out.println("Value of Clomun " + i + " : " +values.getText());
       	i++;
       	}
       	
       	WebElement secrowcol = driver.findElement(By.xpath("//table[@class='ui celled striped table']/tbody/tr[2]/td[2]"));
       	System.out.println("Value from second row second column: " + secrowcol.getText());

		driver.close();
	}
}
