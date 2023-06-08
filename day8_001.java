package com.example.bike;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class day8_001 {
	public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
    	WebDriver driver=new EdgeDriver();
    	driver.get("https://demoqa.com/droppable/");
    	driver.manage().window().maximize();
    	WebElement src=driver.findElement(By.id("draggable"));
    	WebElement src2=driver.findElement(By.id("droppable"));
    	Actions ac=new Actions(driver);
    	ac.clickAndHold(src).release(src2).build().perform();
    	Thread.sleep(5000);
    	
    	}
}
