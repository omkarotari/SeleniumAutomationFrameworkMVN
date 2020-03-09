package com.tricentis.automation.pages.TruckPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Truck_SendQuote {

	public Truck_SendQuote(WebDriver dr) {
		PageFactory.initElements(dr, this);
	}
}
