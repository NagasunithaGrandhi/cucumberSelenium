package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HooksStepDefinition 
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
	@Given("^user is on Nridesicharms website$")
	public void user_is_on_Nridesicharms_website()
	{
		String PageTitle= driver.getTitle();
		  System.out.println(PageTitle); 
	}

	@Then("^user clicks on Food Link$")
	public void user_clicks_on_Food_Link()
	{
	 WebElement f= driver.findElement(By.xpath("//nav[@class='clearfix resmenuwrapper']/ul/li[4]/a/span[2]")); 
	  WebDriverWait w=new WebDriverWait(driver,80);
	  w.until(ExpectedConditions.visibilityOf(f)).click();
	  //f.submit();
	}

	@Then("^search food item$")
	public void search_food_item() 
	{
	  WebElement C=driver.findElement(By.xpath("//span[@class='dis-in' and contains(text(),'Caterers')]"));
	  WebDriverWait h=new WebDriverWait(driver,30);
	  h.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='dis-in' and contains(text(),'Caterers')]")));
	  C.click();
	}

}
