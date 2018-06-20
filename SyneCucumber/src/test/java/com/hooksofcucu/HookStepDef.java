package com.hooksofcucu;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.PropertiesOperation;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HookStepDef {
	
	protected WebDriver driver;
	
	@Before(order=1)
	public void setup() throws InterruptedException {
		System.out.println("in before hook");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anil.Kale\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("opned browser");
		Thread.sleep(5000);
	}
	
	@Before(order=0)
	public void setup0() throws InterruptedException {
		System.out.println("in setup 0");
	}
	
	
	
	@Given("^the user is on registration Page$")
	public void the_user_is_on_registration_Page() throws InterruptedException {
		System.out.println("actual script started");
		PropertiesOperation prop = new PropertiesOperation();
		String url = prop.getPropertyValue("hostURL");
		driver.get(url);
		Thread.sleep(5000);
	}
	
	@And("^he enters \"([^\"]*)\" as user name$")
	public void He_enters_user_name(String userName) {
		driver.findElement(By.xpath("//div/input[@placeholder='First Name']")).sendKeys(userName);
	}
	
	@When("^he enters \"([^\"]*)\" as user last name$")
	public void He_enters_user_last_name(String lastname) throws InterruptedException {
		driver.findElement(By.xpath("//div/input[@placeholder='Last Name']")).sendKeys(lastname);
		Thread.sleep(5000);
	}
	
//	@Then("^check username is present in textbox$")
//	public void check_signup_should(){
//		Assert.assertTrue(true);
//		driver.quit();
//	}
	
	@After(order=0)
	public void teardown(){
		System.out.println("in after hook 0");
		Assert.assertTrue(true);
		driver.quit();
	}
	
	@After(order=1)
	public void teardown0(){
		System.out.println("in after hook 1 ");
		
	}

}
