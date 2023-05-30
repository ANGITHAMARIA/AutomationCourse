package com.obsqura.AutomationCourse;

import org.openqa.selenium.By;

public class Locators extends Base
{
    public void locatingByID()
    {
    	driver.findElement(By.id("twotabsearchtextboxabc")); // locating by id
    }
    public void locatingByClassname()
    {
    	driver.findElement(By.className("nav-logo-locale")); // locating by classname
    }
    public void locatingByName()
    {
    	driver.findElement(By.name("glow-validation-token")); 
    }
	public void locateByCSSSelector()
	{
		//driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		//driver.findElement(By.cssSelector("a.nav-imageHref"));
		driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']"));
		
	}
	public void locateByLinkText()
	{
		driver.findElement(By.linkText("Amazon miniTV"));
		driver.findElement(By.partialLinkText("Today's"));
		
	}
	public static void main(String[] args) 
	
	{
		Locators locators= new Locators();
		locators.initializeBrowser();
		//locators.locatingByID();
		//locators.locatingByClassname();
		//locators.locatingByName();
		//locators.locateByCSSSelector();
		locators.locateByLinkText();
		locators.driverQuit();
	}

}