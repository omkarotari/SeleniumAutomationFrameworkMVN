package com.tricentis.automation.pages.AutomobilePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Automobile_SendQuote{
	public Automobile_SendQuote(WebDriver dr)
	{
		PageFactory.initElements(dr, this);
	}
	
}
