//package StepDef;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
//
//import com.capgemini.generics.TestBase;
//import com.capgemini.pages.TC_ADD_TO_CART_04Page;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class TC_ADD_TO_CART_04Step extends TestBase {
//
//	WebDriver driver = new ChromeDriver();
//	TC_ADD_TO_CART_04Page c = new TC_ADD_TO_CART_04Page(driver);
//
//	@Given("^User is able to access the url of the application$")
//	public void user_is_able_to_access_the_url_of_the_application() throws Throwable {
//		driver.get("https://www.snapdeal.com/");
//		driver.manage().window().maximize();
//		String actual = driver.getTitle();
//		String expected = "Online Shopping Site India - Shop Electronics, Mobiles, Men & Women Clothing, Shoes - www. Snapdeal.com";
//		Assert.assertEquals(actual, expected);
//	}
//
//	@When("^user clicks on signin option$")
//	public void user_clicks_on_signin_option() throws Throwable {
//		WebElement x = c.getSignin();
//		Actions action = new Actions(driver);
//		Thread.sleep(3000);
//		action.moveToElement(x).perform();
//		c.getLogin1();
//		Thread.sleep(3000);
//		driver.switchTo().frame(0);
//	}
//	
//	@Then("^user is able to enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_is_able_to_enter_valid_and(String un, String pwd) throws Throwable {
//		c.getUsername1();
//		c.getEmail().sendKeys(un);
//		c.getCont1();
//		Thread.sleep(3000);
//		c.getPassword();
//		c.getPass().sendKeys(pwd);
//		c.getCont2();
//	}
//
//	@Then("^user selects a product$")
//	public void user_selects_a_product() throws Throwable {
//		c.getWindow(driver);
//		Thread.sleep(3000);
//		c.getProduct();
//	}
//
//	@Then("^user adds the product to the cart$")
//	public void user_adds_the_product_to_the_cart() throws Throwable {
//		c.getCart(driver);
//	}
//
//	@And("^user checks for the added product in the cart option$")
//	public void user_checks_for_the_added_product_in_the_cart_option() throws Throwable {
//		WebElement y = c.getViewcart();
//		Actions v = new Actions(driver);
//		Thread.sleep(3000);
//		v.moveToElement(y).click();
//	}
//}
