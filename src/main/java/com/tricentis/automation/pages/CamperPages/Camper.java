package com.tricentis.automation.pages.CamperPages;

import org.openqa.selenium.WebDriver;

public class Camper {
	
	public Camper_EnterVehicleData camperEnterVehicleData;
	public Camper_SendQuote camperSendQuote;
	
	public Camper(WebDriver dr) {
		camperEnterVehicleData = new Camper_EnterVehicleData(dr);
		camperSendQuote = new Camper_SendQuote(dr);
	}

}
