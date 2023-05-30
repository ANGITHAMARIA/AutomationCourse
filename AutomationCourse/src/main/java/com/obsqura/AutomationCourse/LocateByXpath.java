package com.obsqura.AutomationCourse;

import org.openqa.selenium.By;

public class LocateByXpath extends Base {

	

		public  void locateByXPath()
		{
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			driver.findElement(By.xpath("//a[@href='/ref=nav_logo']"));
		}
		public void dynamicXPath()
		{
			//driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtext')]"));
			//driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearch')]"));
			//driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
			//WebElement searchbar=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @placeholder='Search Amazon.in']"));
			//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @placeholder='Search Amazon.in']"));
			//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']//parent::div[@class='nav-search-field ']"));
			driver.findElement(By.xpath("//div[@id='glow-ingress-block']//child::span[@id='glow-ingress-line1']"));
			//input[@id='twotabsearchtextbox']//following::div[@id='nav-iss-attach']
			//input[@id='twotabsearchtextbox']//preceding::div[@id='nav-search-dropdown-card']
			//input[@id='twotabsearchtextbox']//ancestor::div[@id='nav-search']
			
			//label[@for="twotabsearchtextbox"]//following-sibling::input[@id="twotabsearchtextbox"]
		}
		
		
		public static void main(String[] args)
		{
			LocateByXpath locators=new LocateByXpath();
			locators.initializeBrowser();
			//locators.locateByXPath();
		    locators.dynamicXPath();
			locators.driverQuit();
			
		}

	}
