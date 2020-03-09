package com.tricentis.automation.pages;

import org.openqa.selenium.WebDriver;

import com.tricentis.automation.pages.AutomobilePages.Automobile;
import com.tricentis.automation.pages.CamperPages.Camper;
import com.tricentis.automation.pages.HomePage.HomePage;
import com.tricentis.automation.pages.TruckPages.Truck;

public class PageHost{

	
	public Automobile automobile;
	public HomePage homePage;
	public Truck truck;
	public Camper camper;
	
	public PageHost(WebDriver dr)
	{
		automobile= new Automobile(dr);
		homePage= new HomePage(dr);
		truck = new Truck(dr);	
		camper = new Camper(dr); 
	}
}
