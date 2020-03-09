package com.tricentis.automation.configuration;

public class Config {

	//Environment/Global variables
	public final static String url="http://sampleapp.tricentis.com/101/";
	public final static String browserPath=System.getProperty("user.dir")+"\\src\\main\\resources\\BrowserDrivers\\";
	public final static String testDataPath=System.getProperty("user.dir")+"\\src\\main\\java\\com\\tricentis\\automation\\testData\\TestData.xlsx";
    public final static long implicitWait=5000;
}
