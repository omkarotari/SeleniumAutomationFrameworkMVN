package com.tricentis.automation.pages.TruckPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Truck_EnterVehicleData {
	WebDriver dr;
	public Truck_EnterVehicleData(WebDriver dr) {
		PageFactory.initElements(dr, this);
		//this.dr=dr;
	}
	@FindBy(xpath="//span[@id='selectedinsurance']")
	WebElement selectedInsurance;
	
	@FindBy(id="make")
	Select make ;
	
	@FindBy(xpath="//input[@id='engineperformance']")
	WebElement makeInput;
	
	@FindBy(xpath="//input[@id='dateofmanufacture']")
	WebElement dateOfManufacture;
	
	@FindBy(xpath="//input[@id='numberofseats']")
	Select numberOfSeats;
	
	@FindBy(xpath="//input[@id='fuel']")
	Select fuelType;
	
	@FindBy(xpath="//input[@id='payload']")
	WebElement payLoad;
	
	@FindBy(xpath="//input[@id='totalweight']")
	WebElement totalWeight;
	
	@FindBy(xpath="//input[@id='listprice']")
	WebElement listPrice;
	
	@FindBy(xpath="//input[@id='licenseplatenumber']")
	WebElement licensePlateNumber;
	
	
	@FindBy(xpath="//input[@id='annualmileage']")
	WebElement annualMileage;
	
	@FindBy(xpath="//input[@id='nextenterinsurantdata']")
	WebElement nextEnterInsurantData;
	
	public String checkSelectedInsurance() {
		return selectedInsurance.getText();
	}
	
	public void selectMake(String optionMake) {
		fuelType.selectByValue(optionMake);
	}
	
	public void enterEnginePerformance(String engPerformance) {
		makeInput.sendKeys(engPerformance);
	}
	
	public void enterDateOfManufacture(String date) {
		dateOfManufacture.sendKeys(date);
	}
	
	public void selectNoOfSeats(String noOfSeats) {
		numberOfSeats.selectByValue(noOfSeats);
	}
	
	public void selectFuelType(String fuelTypeOption) {
		fuelType.selectByValue(fuelTypeOption);
	}
	
	public void enterPayLoad(String payLoadVaule) {
		payLoad.sendKeys(payLoadVaule);
	}
	
	public void enterTotalWeight(String totalWeightValue) {
		totalWeight.sendKeys(totalWeightValue);
	}

	public void enterListPrice(String listPriceValue) {
		listPrice.sendKeys(listPriceValue);
	}
	
	public void enterLicensePlateNumber(String licensePlateNumberValue) {
		licensePlateNumber.sendKeys(licensePlateNumberValue);
	}
	
	public void enterAnnualMileage(String annualMileageValue) {
		annualMileage.sendKeys(annualMileageValue);
	}
	
	public Truck_EnterInsuranceData clickNextButton() {
		nextEnterInsurantData.click();
		return new Truck_EnterInsuranceData(dr);
	}
	
}
