package com.obsqura.AutomationCourse;

public class NavigationCommands extends Base
{

	public void navigationCommands()
	{
		driver.navigate().to("https://www.flipkart.com/"); // navigate from one site to another site
		driver.navigate().back(); // back to the previous site
		driver.navigate().forward(); // forward to a site
		driver.navigate().refresh(); // to refresh the site
		
	}
	
	public static void main(String[] args) 
	{
		NavigationCommands navigation = new NavigationCommands();
		navigation.initializeBrowser();
		navigation.navigationCommands();
		navigation.driverQuit();

	}

}
