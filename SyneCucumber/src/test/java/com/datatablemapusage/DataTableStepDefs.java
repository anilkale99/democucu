package com.datatablemapusage;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.PropertiesOperation;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableStepDefs {
	
	protected WebDriver driver;
	
	@Before
	public void setUp() throws InterruptedException {
		System.out.println("in setup");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anil.Kale\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("opened browser");
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
	
	@And("^he enters following data$")
	public void He_enters_user_name(DataTable table) {
		//Initialize data table 
	      List<List<String>> data = table.raw();
	      System.out.println(data.get(0).get(0)); //print the table column Name OR first element
	      //reading columns 2nd's values
	      System.out.println(data.get(1).get(1));
	      driver.findElement(By.xpath("//div/input[@placeholder='First Name']")).sendKeys(data.get(1).get(1));
	      System.out.println(data.get(2).get(1));
	      driver.findElement(By.xpath("//div/input[@placeholder='Last Name']")).sendKeys(data.get(2).get(1));
	      System.out.println(data.get(3).get(1));
	      driver.findElement(By.xpath("//input[@type='email']")).sendKeys(data.get(3).get(1));
	      //reading columns 3rd's values
	      System.out.println(data.get(1).get(2));
	      System.out.println(data.get(2).get(2));
	      System.out.println(data.get(3).get(2));
	}
	
	@When("^he enters \"([^\"]*)\" as user last name$")
	public void He_enters_user_last_name(String lastname) throws InterruptedException {
		driver.findElement(By.xpath("//div/input[@placeholder='Last Name']")).sendKeys(lastname);
		Thread.sleep(5000);
	}
	
	@Then("^check signup should$")
	public void check_signup_should() throws Throwable {
		Assert.assertTrue(true);
		driver.quit();
	}

	
	

}
