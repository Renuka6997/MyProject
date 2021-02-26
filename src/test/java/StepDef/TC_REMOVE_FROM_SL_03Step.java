//package StepDef;
//
//import java.util.List;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
//
//import com.capgemini.generics.TestBase;
//import com.capgemini.pages.TC_REMOVE_FROM_SL_03Page;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class TC_REMOVE_FROM_SL_03Step extends TestBase{
//
//	WebDriver driver = new ChromeDriver();
//	TC_REMOVE_FROM_SL_03Page c = new TC_REMOVE_FROM_SL_03Page(driver);
//	
//	@Given("^user enters the url of application$")
//	public void user_enters_the_url_of_application() throws Throwable {  
//		driver.get("https://www.snapdeal.com/");
//		driver.manage().window().maximize();
//		String actual = driver.getTitle();
//		String expected = "Online Shopping Site India - Shop Electronics, Mobiles, Men & Women Clothing, Shoes - www. Snapdeal.com";
//		Assert.assertEquals(actual, expected);
//	}
//	
//	@When("^user clicks on sign in button$")
//	public void user_clicks_on_sign_in_button() throws Throwable {
//		WebElement x = c.getSignin1();
//		Actions action = new Actions(driver);
//		Thread.sleep(3000);
//		action.moveToElement(x).perform();
//		c.getLogin();
//		Thread.sleep(3000);
//		driver.switchTo().frame(0);
//	}
//	
//	@Then("^user signin with valid credentials$")
//	public void user_signin_with_valid_credentials(DataTable credentials) throws Throwable {
//		List<List<String>> ele = credentials.raw();
//		c.getUsername();
//		c.getEmail().sendKeys(ele.get(0).get(0));
//		c.getCont();
//		Thread.sleep(3000);
//		c.getPassword();
//		c.getPass().sendKeys(ele.get(0).get(1));
//		c.getLoginbtn();
//		String d = driver.getWindowHandle();
//		driver.switchTo().window(d);
//	}
//
//	@Then("^user selects shortlist under user profile$")
//	public void user_selects_shortlist_under_user_profile() throws Throwable {
//		WebElement y = c.getUname();
//		   Actions act = new Actions(driver);
//		   Thread.sleep(3000);
//		   act.moveToElement(y).perform();
//		   c.getShortlistbtn();
//	}
//
//	@Then("^user removes the product$")
//	public void user_removes_the_product() throws Throwable {
//	   c.getRemoval();
//	}
//
//}
