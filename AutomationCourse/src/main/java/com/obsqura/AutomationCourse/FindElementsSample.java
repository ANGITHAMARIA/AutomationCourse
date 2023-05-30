package com.obsqura.AutomationCourse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FindElementsSample extends Base {

	public static void main(String[] args) {
		
		FindElementsSample findelementsample=new FindElementsSample();
		findelementsample.initializeBrowser();
		findelementsample.findElements();
		findelementsample.driverQuit();
	}
		
		public void findElements()
		{
		
			List <WebElement> menuoptions=driver.findElements(By.xpath("//li[@class='list-group-item']"));
			for(WebElement options:menuoptions)
			{
				System.out.println(options);
			}
			System.out.println(menuoptions.size());
			menuoptions.get(3).click();
			System.out.println(driver.getCurrentUrl());
		}
		


	}

