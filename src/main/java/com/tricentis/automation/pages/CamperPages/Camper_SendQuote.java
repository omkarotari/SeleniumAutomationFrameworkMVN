package com.tricentis.automation.pages.CamperPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Camper_SendQuote {

	WebDriver dr;
	public Camper_SendQuote(WebDriver dr) {
		PageFactory.initElements(dr, this);
	}
	
	
}
