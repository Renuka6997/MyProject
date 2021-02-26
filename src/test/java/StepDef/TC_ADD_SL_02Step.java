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
//import com.capgemini.pages.TC_ADD_SL_02Page;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class TC_ADD_SL_02Step extends TestBase {
//
//	WebDriver driver = new ChromeDriver();
//	TC_ADD_SL_02Page b = new TC_ADD_SL_02Page(driver);
//
//	@Given("^user able to access the url of te application$")
//	public void user_able_to_access_the_url_of_te_application() throws Throwable {
//		driver.get("https://www.snapdeal.com/");
//		driver.manage().window().maximize();
//		String actual = driver.getTitle();
//		String expected = "Online Shopping Site India - Shop Electronics, Mobiles, Men & Women Clothing, Shoes - www. Snapdeal.com";
//		Assert.assertEquals(actual, expected);
//	}
//
//	@When("^user clicks on sign in option$")
//	public void user_clicks_on_sign_in_option() throws Throwable {
//		WebElement x = b.getSignin1();
//		Actions action = new Actions(driver);
//		Thread.sleep(3000);
//		action.moveToElement(x).perform();
//		b.getLogin();
//		Thread.sleep(3000);
//		driver.switchTo().frame(0);
//	}
//
//	@Then("^user signin with valid username and password$")
//	public void user_signin_with_valid_username_and_password(DataTable credentials) throws Throwable {
//		List<List<String>> ele = credentials.raw();
//		b.getUsername();
//		b.getEmail().sendKeys(ele.get(0).get(0));
//		b.getCont();
//		Thread.sleep(3000);
//		b.getPassword();
//		b.getPass().sendKeys(ele.get(0).get(1));
//		b.getLoginbtn();
//		String d = driver.getWindowHandle();
//		driver.switchTo().window(d);
//	}
//
//	@And("^clicks on start shopping$")
//	public void clicks_on_start_shopping() throws Throwable {
//		b.getWindow(driver);
//		WebElement y = b.getUname();
//		Actions act = new Actions(driver);
//		Thread.sleep(3000);
//		act.moveToElement(y).perform();
//		b.getShortlistbtn();
//		Thread.sleep(3000);
//		b.getShopping();
//	}
//
//	@And("^user add the product to the shortlist$")
//	public void user_add_the_product_to_the_shortlist() throws Throwable {
//		b.getSelproduct();
//		Thread.sleep(3000);
//		b.getShortlistwin(driver);
//		Thread.sleep(3000);
//		b.getShortlist();
//	}
//
//	@Then("^user should be able to see the product in the wishlist$")
//	public void user_should_be_able_to_see_the_product_in_the_wishlist() throws Throwable {
//		WebElement z = b.getUname2();
//		Actions acts = new Actions(driver);
//		Thread.sleep(3000);
//		acts.moveToElement(z).perform();
//		b.getViewshortlist();
//	}
//}
