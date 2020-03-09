package com.tricentis.automation.pages.AutomobilePages;

import org.openqa.selenium.WebDriver;

public class Automobile {

	
	public Automobile_EnterInsuranceData insuranceData ;
	public Automobile_EnterProductData productData ;
	public Automobile_EnterVehicleData vehicleData;
	public Automobile_SelectPriceOption selectPrice ;
	public Automobile_SendQuote sendQuote;
	
	public Automobile(WebDriver dr)
	{
		insuranceData = new Automobile_EnterInsuranceData(dr);
		productData = new Automobile_EnterProductData(dr);
		vehicleData = new Automobile_EnterVehicleData(dr);
		selectPrice = new Automobile_SelectPriceOption(dr);
		sendQuote = new Automobile_SendQuote(dr);
	}
	
	
}
