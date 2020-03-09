package com.tricentis.automation.pages.TruckPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Truck_EnterInsuranceData {

	WebDriver dr;
	public Truck_EnterInsuranceData(WebDriver dr) {
		this.dr=dr;
	}
	
	@FindBy(id="firstname")
	WebElement firstName;
	
	@FindBy(id="lastname")
	WebElement lastName;
	
	@FindBy(id="birthdate")
	WebElement birthDate;
	
	
	
	public WebElement checkTabValue() {
		return dr.findElement(By.xpath("//li[@class='idealsteps-step-active']//child::a[text()='Enter Insurant Data']//span[text()='7']"));
	}
}
