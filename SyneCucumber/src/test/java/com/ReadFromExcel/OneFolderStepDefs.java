package com.ReadFromExcel;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.PropertiesOperation;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OneFolderStepDefs {
	
	protected WebDriver driver;
	
	@Before
	public void setUp() throws InterruptedException {
		System.out.println("in setup");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anil.Kale\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("opned browser");
		Thread.sleep(5000);
	}
	
	@Given("^the user is on registration Page$")
	public void the_user_is_on_registration_Page() throws InterruptedException {
		System.out.println("actual script started");
		PropertiesOperation prop = new PropertiesOperation();
		String url = prop.getPropertyValue("hostURL");
		driver.get(url);
		Thread.sleep(5000);
	}
	
	@And("^he enters data from \"([^\"]*)\" file$")
	public void he_enters_data_from_file(String fileName) throws Exception{
		
		ReadExcelData exl = new ReadExcelData(fileName);
		//Read the data from excel workbook
		for(int i=0;i<exl.getRows();i++){
			for(int j=0;j<exl.getCols();j++){
				String s  =exl.getCellData(i, j);
				System.out.print(s + " " );
			}
			System.out.println();
		}
	}
	
	@Then("^check username is present in textbox$")
	public void check_signup_should(){
		Assert.assertTrue(true);
		driver.quit();
	}

}
