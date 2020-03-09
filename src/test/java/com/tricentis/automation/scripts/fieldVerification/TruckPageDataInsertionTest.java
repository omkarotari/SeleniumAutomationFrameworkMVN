package com.tricentis.automation.scripts.fieldVerification;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.tricentis.automation.driver.Driver;
import com.tricentis.automation.pages.PageHost;
import com.tricentis.automation.pages.TruckPages.Truck;
import com.tricentis.automation.pages.TruckPages.Truck_EnterInsuranceData;
import com.tricentis.automation.pages.TruckPages.Truck_EnterVehicleData;

public class TruckPageDataInsertionTest extends Driver{
	//Truck_EnterVehicleData ter;
	PageHost pages;
	Truck tr;
	
/*	@BeforeClass
	public void pageInitiation(){
		pages = new PageHost(dr);
		pages.homePage.clickTruck();		
	}*/
	/*@Test(priority=0)
	public void verifyTruckPage() {
		pages = new PageHost(dr);
		pages.homePage.clickTruck();
		ter = new Truck_EnterVehicleData(dr);
		try {
			Assert.assertEquals(ter.checkSelectedInsurance(), "Truck Insurance");
			System.out.println("On Truck page");
		}
		catch(AssertionError aer) {
			System.out.println(aer);
		}
		
	}*/
	@Test
	public void enterTruckVehicleData() throws InterruptedException {
		pages = new PageHost(dr);
		pages.homePage.clickTruck();
		Thread.sleep(5000);
		tr = new Truck(dr);
		//ter = new Truck_EnterVehicleData(dr);
		tr.truckVehicleData.selectMake("Audi");
		//System.out.println(ter.checkSelectedInsurance());
		tr.truckVehicleData.selectMake("Audi");
		tr.truckVehicleData.enterEnginePerformance("150");
		tr.truckVehicleData.enterDateOfManufacture("03/01/2020");
		tr.truckVehicleData.selectNoOfSeats("3");
		tr.truckVehicleData.selectFuelType("Petrol");
		tr.truckVehicleData.enterPayLoad("1000");
		tr.truckVehicleData.enterTotalWeight("1200");
		tr.truckVehicleData.enterListPrice("5000");
		tr.truckVehicleData.enterLicensePlateNumber("89abc");
		tr.truckVehicleData.enterAnnualMileage("120");
		Truck_EnterInsuranceData tei;
		tei = tr.truckVehicleData.clickNextButton();
		System.out.println( tei.checkTabValue());
	}
	

}
