package com.paynet.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataUtils {

	@DataProvider
	public String[][] invalidCredentialData() throws IOException
	{
		String[][] main= ExcelUtils.getSheetIntoTwoDimArray("testdata/testdata.xlsx","invalidCredentialTest");
		
		return main;
	}
	
	
	@DataProvider
	public String[][] validCredentialData() throws IOException
	{
		String[][] main= ExcelUtils.getSheetIntoTwoDimArray("testdata/testdata.xlsx","validCredentialTest");
		
		return main;
	}
	
}
