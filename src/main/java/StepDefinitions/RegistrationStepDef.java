/*package StepDefinitions;
import java.awt.event.ActionEvent;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class RegistrationStepDef
{
	public WebDriver driver;
	@Given("^user is already on home  page$")
	public void user_is_already_on_home_page()
	{
	System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.nridesicharms.com/search-results.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
}
@When("^Title of home Page is Nridesicharms$")
public void title_of_home_Page_is_Nridesicharms()
{
    String PageTitle= driver.getTitle();
    System.out.println(PageTitle);
    Assert.assertEquals("Nridesicharms",PageTitle );
       
}
//Registration 
@Then ("^Click on Register button$")
public void  Click_on_Register_button()
{
	driver.findElement(By.xpath("//abbr[@class='mobile-hide l-p5']")).click();
}
@And("^user enters registration details$")
public void user_enters_registration_details(DataTable registrationDetails)
	{
	
	for(Map<String,String> RegDetails:registrationDetails.asMaps(String.class,String.class))
	{
	driver.findElement(By.id("PRFirstName")).sendKeys(RegDetails.get("FirstName"));
	driver.findElement(By.id("PRLastName")).sendKeys(RegDetails.get("LastName"));
	driver.findElement(By.id("PREmail")).sendKeys(RegDetails.get("Email"));
	driver.findElement(By.id("PRPassword")).sendKeys(RegDetails.get("password"));
	driver.findElement(By.id("PRConfPassword")).sendKeys(RegDetails.get("Re-password"));
	driver.findElement(By.xpath("//span[@class='pull-left dis-b']")).submit();
	WebElement s=driver.findElement(By.xpath("//span[@class='dis-in t-m3']"));
	if(s.isDisplayed()==true)
	{
	    s.click();
		//Actions action=new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath("//a[@href='/Members/LogOff']"))).build().perform();
	    WebElement l= driver.findElement(By.xpath("//a[@href='/Members/LogOff']"));
	    WebDriverWait w= new WebDriverWait(driver, 30);
	    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/Members/LogOff']")));
	    l.click();
		 driver.findElement(By.xpath("//abbr[@class='mobile-hide l-p5']")).click();
		// driver.findElement(By.linkText("Register")).click();
	 }
	 
	}}
	
/*@Then ("^click on submit button$")
public void  click_on_submit_button()
{
	driver.findElement(By.xpath("//span[@class='pull-left dis-b']")).submit();
	
}

@Then("^close the Browser$")
public void close_the_Browser()
{
driver.close();
}
}
*/