/*package StepDefinitions;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableDef {
	public WebDriver driver;
	@Given("^user is already on home  page$")
	public void user_is_already_on_home_page()
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.nridesicharms.com/search-results.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
	}
	@When("^Title of home  Page is Nridesicharms$")
	public void title_of_home_Page_is_Nridesicharms() 
	{
	  String PageTitle= driver.getTitle();
	  System.out.println(PageTitle);
	}
	@Then ("^Click on Register button$")
	public void  Click_on_Register_button()
	{
    driver.findElement(By.xpath("//abbr[contains(text(),'Register')]")).click();
	}
	@And  ("^user enters registration details$")
	public void user_enters_registration_details(DataTable registrationDetails)
		{
		List<List<String>> RegDetails=registrationDetails.raw();
		driver.findElement(By.id("PRFirstName")).sendKeys(RegDetails.get(0).get(0));
		driver.findElement(By.id("PRLastName")).sendKeys(RegDetails.get(0).get(1));
		driver.findElement(By.id("PREmail")).sendKeys(RegDetails.get(0).get(2));
		driver.findElement(By.id("PRPassword")).sendKeys(RegDetails.get(0).get(3));
		driver.findElement(By.id("PRConfPassword")).sendKeys(RegDetails.get(0).get(4));
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}
	@Then ("^click on submit button$")
	public void  click_on_submit_button()
	{
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}
}
*/