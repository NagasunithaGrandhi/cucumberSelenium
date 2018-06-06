/**Package StepDefinitions;
//import static org.testng.Assert.assertTrue;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import junit.framework.Assert;
public class LoginFeatureDefinition
{
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
@When("^Title of home Page is Nridesicharms$")
public void title_of_home_Page_is_Nridesicharms()
{
   // String PageTitle= driver.getTitle();
   // System.out.println(PageTitle);
}
@Then("^Click on Login Button$")
public void click_on_Login_Button() {
  driver.findElement(By.cssSelector("abbr.mobile-hide")).click();
   }
@Then("^Enter Username and Password$")
public void enter_Username_and_Password() 
{
    driver.findElement(By.cssSelector("input#PLEmail")).sendKeys("sunithagrandhi15@gmail.com");
    driver.findElement(By.cssSelector("input#PLPassword")).sendKeys("Runitha@1");
    }

@Then("Enters the info \"([^\"]*)\" and \"([^\"]*)\"$")
public void Enters_the_info(String username, String password) 
{
	driver.findElement(By.cssSelector("input#PLEmail")).sendKeys(username);
    driver.findElement(By.cssSelector("input#PLPassword")).sendKeys(password);
}

@And("^Clicks on Login Button$")
public void clicks_on_Login_Button() 
{
   driver.findElement(By.xpath("//input[@value='Login']")).click();
}

@SuppressWarnings("deprecation")
@And("^User is logged in using his Account\\.$")
public void user_is_logged_in_using_his_Account()  
{
	String g=driver.getTitle();
 //   Assert.assertEquals("Nridesicharms",g);
	Assert.assertEquals("Nridesicharms",g);
}
//Auto care
@And("^Validate the Auto care Link$")
public void Validate_the_Auto_care_Link()
{
	Assert.assertTrue(driver.findElement(By.xpath("//a[@href='#accordion-2']")).isDisplayed());
}
//Bussiness
@And("^Validate the Bussiness Link$")
public void validate_the_Bussiness_Link() 
{
	Assert.assertTrue(driver.findElement(By.xpath("//a[@href='#accordion-3']")).isDisplayed());
}   
@Then("^close the Browser$")
public void close_the_Browser()
{
driver.close();
}
//search keyword
@Then("^enter \"(.*)\" in Keyword text box$")
public void enter_values_in_Keyword_text_box(String values) 
{
    driver.findElement(By.xpath("//input[@name='Search']")).sendKeys(values);
    }
//Registration 
@Then ("^Click on Register button$")
public void  Click_on_Register_button()
{
driver.findElement(By.linkText("Register")).click();
}
@And("^user enters registration details$")
public void user_enters_registration_details(DataTable registrationDetails)
	{
	List<List<String>> RegDetails=registrationDetails.raw();
	driver.findElement(By.id("PRFirstName")).sendKeys(RegDetails.get(0).get(0));
	driver.findElement(By.id("PRLastName")).sendKeys(RegDetails.get(0).get(1));
	driver.findElement(By.id("PREmail")).sendKeys(RegDetails.get(0).get(2));
	driver.findElement(By.id("PRPassword")).sendKeys(RegDetails.get(0).get(3));
	driver.findElement(By.id("PRConfPassword")).sendKeys(RegDetails.get(0).get(4));
	}
@Then ("^click on submit button$")
public void  click_on_submit_button()
{
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
}
}
**/
