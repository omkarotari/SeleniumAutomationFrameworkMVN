package com.tricentis.automation.pages.TruckPages;

import org.openqa.selenium.WebDriver;

public class Truck {

	public Truck_SendQuote sendQuote;
	public Truck_EnterVehicleData truckVehicleData;
	
	public Truck(WebDriver dr) {
		sendQuote = new Truck_SendQuote(dr);
		truckVehicleData = new Truck_EnterVehicleData(dr);
	}
	
	
}
