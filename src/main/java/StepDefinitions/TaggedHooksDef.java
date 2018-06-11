package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TaggedHooksDef
{
WebDriver driver;
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.nridesicharms.com/search-results.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
	}
	@After
	public void tearDown()
	{
		driver.close();
	}
	@Before("@First")
	public void first()
	{
		System.out.println("This is first before hook");
	}
	@After("@First")
	public void afterFirst()
	{
		System.out.println("This is first after hook");
	}
	@Given("^user clicks on deals page$")
	public void user_clicks_on_deals_page() 
	{
	System.out.println("U r in deals page" );    
	}

	@Then("^search deals in it$")
	public void search_deals_in_it() 
	{
	   System.out.println("U r on search page of deal page") ;
	}
	
	@Before("@Third")
	public void third()
	{
		System.out.println("This is Third  before hook");
	}
	
		@Given("^user clicks on Desi Bazar$")
	public void user_clicks_on_Desi_Bazar()  
	{
			System.out.println("he  is in Desi Bazar page");
	}
		@After("@Third")
		public void afterThird()
		{
			System.out.println("This is Third after hook");
		}
	@Before("@Second")
	public void second()
	{
		System.out.println("This is Second hook");
	}
	@Given("^user clicks on Events Page$")
	public void user_clicks_on_Events_Page() 
     {
		 System.out.println("U r events page of deal page") ;
      }

	@After("@Second")
	public void afterSecond()
	{
		System.out.println("This is second after hook");
	}
	
}
