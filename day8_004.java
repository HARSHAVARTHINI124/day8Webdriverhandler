package com.example.bike;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class day8_004 {
	public static void main( String[] args ) throws InterruptedException{
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.abhibus.com/bus-ticket-booking");
	driver.manage().window().maximize();
	WebElement from=driver.findElement(By.name("source"));
	from.sendKeys("coimbatore");
	WebElement to=driver.findElement(By.name("destination"));
	to.sendKeys("cuddalore");
	Thread.sleep(5000);
	WebElement d=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
	d.click();
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('value','11/06/2023')",d);
	}
}
