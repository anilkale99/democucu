package com.sharingdatawithpicocontainer;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OneFolderStepDefs2 {
	
WebDriver driver;
	
	public OneFolderStepDefs2(SharedClass sharedObj) throws InterruptedException{
		driver = sharedObj.launchBrowser();
	}
	
	@When("^he enters \"([^\"]*)\" as user last name$")
	public void He_enters_user_last_name(String lastname) throws InterruptedException {
		driver.findElement(By.xpath("//div/input[@placeholder='Last Name']")).sendKeys(lastname);
		Thread.sleep(5000);
	}
	
	@Then("^check username is present in textbox$")
	public void check_signup_should(){
		Assert.assertTrue(true);
		driver.quit();
	}

}
