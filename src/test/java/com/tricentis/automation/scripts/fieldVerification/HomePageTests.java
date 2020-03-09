package com.tricentis.automation.scripts.fieldVerification;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tricentis.automation.driver.Driver;
import com.tricentis.automation.pages.PageHost;
import com.tricentis.automation.pages.TruckPages.Truck;
import com.tricentis.automation.pages.TruckPages.Truck_EnterVehicleData;

public class HomePageTests extends Driver{
	
	//Global variables
	PageHost pages;
	
	@Test
	public void verifyAutomationlink()
	{
		pages= new PageHost(dr);
		//Verify that we are on home page
		Assert.assertEquals(dr.getTitle(), "Tricentis Vehicle Insurance");
		
		//Click on Automobile link
		pages.homePage.clickAutomobile();
		
		//Verify that enter vehicle data page opened
		Assert.assertEquals(dr.getTitle(), "Enter Vehicle Data");
		
	}
	
	@Test
	public void verifyTrucklink()
	{
		pages = new PageHost(dr);
		
		pages.homePage.clickTruck();
		
		//Verify that enter Truck link is clicked
		//Truck tr = new Truck(dr);
/*		Truck_EnterVehicleData tev = new Truck_EnterVehicleData(dr);
		//Assert.assertEquals(, expected);
		System.out.println(tev.checkSelectedInsurance());
		Assert.assertEquals(tev.checkSelectedInsurance(), "Truck Insurance");*/
		
	}
	
	@Test
	public void verifyMotorCyclelink()
	{
		
	}
	
	@Test
	public void verifyCamperlink()
	{
		
	}

}
