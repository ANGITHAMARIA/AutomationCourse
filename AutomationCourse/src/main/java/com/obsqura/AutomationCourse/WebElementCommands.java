package com.obsqura.AutomationCourse;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;



public class WebElementCommands extends Base {

	public void webElementCommandsSample()
	{
		
		WebElement singleinputtextfield=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleinputtextfield.sendKeys("Hello");
		WebElement showmessagebtn=driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessagebtn.click();
		singleinputtextfield.clear();
		boolean singleinputtextfieldisdisplayed= singleinputtextfield.isDisplayed();
		boolean showmessagebtnisenabled=showmessagebtn.isEnabled();
		String showmessagebtntxt= showmessagebtn.getText();
		System.out.println(showmessagebtntxt);
		Dimension showmessagebtnsize = showmessagebtn.getSize();
		int showmessagebtnheight = showmessagebtnsize.getHeight();
		int showmessagebtnwidth = showmessagebtnsize.getWidth();
		int singleInputFieldX=singleinputtextfield.getLocation().getX();
		int singleInputFieldY=singleinputtextfield.getLocation().getY();
		int showMessageBtnX=showmessagebtn.getLocation().getX();
		int showMessageBtnY=showmessagebtn.getLocation().getY();
		String showMessageBtnClassName=showmessagebtn.getAttribute("class");
		String showmessagebtnBorderRadius=showmessagebtn.getCssValue("border-radius");
		String showmessagebtnBackgroundColor=showmessagebtn.getCssValue("background-color"); 
	}
	
	public void verifySingleInputFieldValue()
	{
		String input="Hello";
		WebElement singleinputtextfield=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleinputtextfield.sendKeys(input);
		WebElement showmessagebtn=driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessagebtn.click();
		WebElement yourmessagetxt=driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourMessageTxtValue= yourmessagetxt.getText();
		if(yourMessageTxtValue.equals("Your Message : "+input))
		{
			System.out.println("Expected message is displayed");
		}
		else
		{
			System.out.println("Expected message not displayed");
		}
	}
	
	public void verifyTwoInputFieldsValue()
	{
		String twoInputFieldAValue="1005";
		String twoInputFieldBValue="2100";
		WebElement twoInputFieldA=driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement twoInputFieldB=driver.findElement(By.xpath("//input[@id='value-b']"));
		twoInputFieldA.sendKeys(twoInputFieldAValue);
		twoInputFieldB.sendKeys(twoInputFieldBValue);
		int sum=Integer.parseInt(twoInputFieldAValue)+Integer.parseInt(twoInputFieldBValue);
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotalButton.click();
		WebElement totalFieldTxt=driver.findElement(By.xpath("//div[@id='message-two']"));
		String totalFieldTxtValue=totalFieldTxt.getText();
		int displayedSum=Integer.parseInt((totalFieldTxtValue).substring(14,totalFieldTxtValue.length()));		
		if(displayedSum==sum)
		{
			System.out.println("Expected sum is displayed");
		}
		else
		{
			System.out.println("Expected sum not displayed");
		}
		
	}
	
	public void verifyTheHeightAndWidthOfGetTotalButton()
	{
		int actualGetTotalButtonHeight=38;
		int actualGetTotalButtonWidth=93;
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		Dimension getTotalButtonSize = getTotalButton.getSize();
		int getTotalButtonHeight = getTotalButtonSize.getHeight();
		int getTotalButtonWidth = getTotalButtonSize.getWidth();
		if(getTotalButtonHeight==actualGetTotalButtonHeight)
		{
			System.out.println("Get total button height matches with expected height");	
		}
		else
		{
			System.out.println("Get total button height not matches with expected height");
		}
		if (getTotalButtonWidth==actualGetTotalButtonWidth)
		{
			System.out.println("Get total button width matches with expected height");
		}
		else
		{
			System.out.println("Get total button width not matches with expected height");
		}
			
	}
	
	public void verifyWhetherTheTextFieldADisplayedAboveTextFieldB()
	{
		WebElement twoInputFieldA=driver.findElement(By.xpath("//input[@id='value-a']"));
		int twoInputFieldAX=twoInputFieldA.getLocation().getX();
		int twoInputFieldAY=twoInputFieldA.getLocation().getY();
		WebElement twoInputFieldB=driver.findElement(By.xpath("//input[@id='value-b']"));
		int twoInputFieldBX=twoInputFieldB.getLocation().getX();
		int twoInputFieldBY=twoInputFieldB.getLocation().getY();
		if((twoInputFieldAX==twoInputFieldBX) && (twoInputFieldAY<twoInputFieldBY))
		{
			System.out.println("Text Field A is displayed above Text Field B");
		}
		else
		{
			System.out.println("Text Field A is displayed below Text Field B");
		}		
	}
	
	public void verifyTheBackGroundColorOfGetTotalButton()
	{
		String actualGetTotalButtonBackgroundColorHexValue="#007bff";
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		String getTotalButtonBackgroundColor=getTotalButton.getCssValue("background-color");
		System.out.print(getTotalButtonBackgroundColor);
		String getTotalButtonBackgroundColorHexValue=Color.fromString(getTotalButtonBackgroundColor).asHex();
		if(actualGetTotalButtonBackgroundColorHexValue.equals(getTotalButtonBackgroundColorHexValue))
		{
			System.out.println("Background color is matching with the design");
		}
		else
		{
			System.out.println("Background color not matching with the design");
		}
	}
	public static void main(String[] args) {
		
		WebElementCommands webelementcommands=new WebElementCommands();
		webelementcommands.initializeBrowser();
		//webelementcommands.webElementCommandsSample();
		webelementcommands.verifySingleInputFieldValue();
		//webelementcommands.verifyTwoInputFieldsValue();
		//webelementcommands.verifyTheHeightAndWidthOfGetTotalButton();
		//webelementcommands.verifyWhetherTheTextFieldADisplayedAboveTextFieldB();
		//webelementcommands.verifyTheBackGroundColorOfGetTotalButton();
		webelementcommands.driverQuit();
	}

}