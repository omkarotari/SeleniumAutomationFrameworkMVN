package com.tricentis.automation.pages.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tricentis.automation.pages.AutomobilePages.Automobile_EnterVehicleData;
import com.tricentis.automation.pages.CamperPages.Camper_EnterVehicleData;
import com.tricentis.automation.pages.MotorCyclePages.MotorCycle_EnterVehicleData;
import com.tricentis.automation.pages.TruckPages.Truck_EnterVehicleData;

public class HomePage {

	WebDriver dr;
	@FindBy(linkText="Automobile")
	WebElement automobile;
	
	@FindBy(linkText="Truck")
	WebElement truck;
	
	@FindBy(linkText="Motorcycle")
	WebElement motorcycle;
	
	@FindBy(linkText="Camper")
	WebElement Camper;
	
	
	public HomePage(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);		
	}
	
	public Automobile_EnterVehicleData clickAutomobile()
	{
		automobile.click();
		
		return new Automobile_EnterVehicleData(dr);
	}
	
	public Truck_EnterVehicleData clickTruck()
	{
		truck.click();
		
		return new Truck_EnterVehicleData(dr);
	}
	
	public MotorCycle_EnterVehicleData clickMotorCycle()
	{
		motorcycle.click();
		
		return new MotorCycle_EnterVehicleData();
	}
	
	public Camper_EnterVehicleData clickCamper()
	{
		Camper.click();		
		return new Camper_EnterVehicleData(dr);
	}
}
