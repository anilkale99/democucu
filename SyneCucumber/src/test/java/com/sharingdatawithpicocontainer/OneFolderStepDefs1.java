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

public class OneFolderStepDefs1 {
	
	
	WebDriver driver;
	
	public OneFolderStepDefs1(SharedClass sharedObj) throws InterruptedException{
		driver = sharedObj.launchBrowser();
	}
	
	@Given("^the user is on registration Page$")
	public void the_user_is_on_registration_Page() throws InterruptedException {
		System.out.println("actual script started");
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(5000);
	}
	
	@And("^he enters \"([^\"]*)\" as user name$")
	public void He_enters_user_name(String userName) {
		driver.findElement(By.xpath("//div/input[@placeholder='First Name']")).sendKeys(userName);
	}
	

}
