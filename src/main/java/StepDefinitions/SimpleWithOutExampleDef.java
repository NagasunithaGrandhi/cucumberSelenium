/*package StepDefinitions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SimpleWithOutExampleDef 
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
}*/
