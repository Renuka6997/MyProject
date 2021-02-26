package StepDef;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.capgemini.generics.ExcelBase;
import com.capgemini.pages.CartPage;
import com.capgemini.pages.LoginPage;
import com.capgemini.pages.PaymentPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Scenario1Step extends ExcelBase {

	LoginPage lp;

	// Signing in with mobile number and email id using scenario outline
	@Given("^user is able to access the url of the application$")
	public void user_is_able_to_access_the_url_of_the_application() {
		ExcelBase.initial();
		String actual = driver.getTitle();
		String expected = "Online Shopping Site India - Shop Electronics, Mobiles, Men & Women Clothing, Shoes - www. Snapdeal.com";
		Assert.assertEquals(actual, expected);
	}

	@When("^user clicks on signin option$")
	public void user_clicks_on_signin_option() {
		lp = new LoginPage(driver);
		WebElement x = lp.getSignin();
		Actions action = new Actions(driver);
		lp.getWait();
		action.moveToElement(x).perform(); // moves to the sign in element
		lp.getLogin1();
		lp.getWait();
		driver.switchTo().frame(0); // in order to get access on the frame
	}

	@Then("^user login with valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_with_valid_and(String un, String pw) {
		lp.getUsername1();
		lp.getEmail().sendKeys(un); // user name is sent from feature file
		lp.getWait();
		lp.getCont1();
		lp.getWait();
		lp.getPassword();
		lp.getPass().sendKeys(pw); // password is sent from feature file
	}

	@Then("^user enters to the home page of the application$")
	public void user_enters_to_the_home_page_of_the_application() {
		lp.getCont2();
		String actualtitle = driver.getTitle();
		String expectedtitle = "Online Shopping Site India - Shop Electronics, Mobiles, Men & Women Clothing, Shoes - www. Snapdeal.com";
		Assert.assertEquals(actualtitle, expectedtitle);
	}

	@Then("^user log out from the application$")
	public void user_log_out_from_the_application() {
		lp.getWindow(driver);
		lp.getWait();
		WebElement y = lp.getUname();
		Actions un = new Actions(driver);
		lp.getWait();
		un.moveToElement(y).perform();
		lp.getLogout();
		driver.quit();
	}

	// Adding product to the cart from the Short List
	
	CartPage cp;
	
	@Given("^user access the url$")
	public void user_access_the_url() {
		ExcelBase.initial();
		String actual = driver.getTitle();
		String expected = "Online Shopping Site India - Shop Electronics, Mobiles, Men & Women Clothing, Shoes - www. Snapdeal.com";
		Assert.assertEquals(actual, expected);
	}

	@When("^user clicks on signin button$")
	public void user_clocks_on_signin_button() {
		cp = new CartPage(driver);
		WebElement k = cp.getSignin();
		Actions act = new Actions(driver);
		cp.getWait();
		act.moveToElement(k).perform();
		cp.getLogin();
		driver.switchTo().frame(0);
	}

	@Then("^user login with valid username and password$")
	public void user_login_with_valid_username_and_password(DataTable details) {
		List<List<String>> ele = details.raw(); // raw method is used to access the data from the data table in feature
												// file
		cp.getUsername();
		cp.getEmail().sendKeys(ele.get(0).get(0)); // user name is sent from feature file using data table
		cp.getCont1();
		cp.getWait();
		cp.getPasword();
		cp.getPass().sendKeys(ele.get(0).get(1)); // password is sent from feature file using data table
		cp.getCont2();
		cp.getWindow(driver); // to shift the control on current window
	}

	@Then("^user clicks on shortlist from profile$")
	public void user_clicks_on_shortlist_from_profile() {
		WebElement l = cp.getUser1();
		Actions sl = new Actions(driver); // moves to the user web element
		cp.getWait();
		sl.moveToElement(l).perform();
		cp.getShortlist();
	}

	@Then("^user clicks on start shopping and selects a product$")
	public void user_clicks_on_start_shopping_and_selects_a_product() {
		cp.getStartshop();
		cp.getWait();
		cp.getSelproduct();
	}

	@Then("^user clicks on add to cart and check for the product$")
	public void user_clicks_on_add_to_cart_and_check_for_the_product() {
		cp.getWindows(driver);
		cp.getWait();
		cp.getAddcart();
	}

	@Then("^user logs out from application$")
	public void user_logs_out_from_application() {
		WebElement m = cp.getUser2();
		Actions action = new Actions(driver);
		cp.getWait();
		action.moveToElement(m).perform();
		cp.getLogout();
		driver.quit();
	}

	// Purchasing Product from Short List
	
	PaymentPage pp;
	
	@Given("^user enters with the url$")
	public void user_enters_with_the_url() {
		ExcelBase.initial();
		String actual = driver.getTitle();
		String expected = "Online Shopping Site India - Shop Electronics, Mobiles, Men & Women Clothing, Shoes - www. Snapdeal.com";
		Assert.assertEquals(actual, expected);
	}

	@When("^user clicks on signin$")
	public void user_clicks_on_signin() {
		pp = new PaymentPage(driver);
		WebElement u = pp.getSignin();
		Actions act = new Actions(driver);
		pp.getWait();
		act.moveToElement(u).perform();
		pp.getLogin();
		driver.switchTo().frame(0);
	}

	@When("^user login with valid credentials$")
	public void user_login_with_valid_credentials() {
		pp.getUsername();
		pp.getEmail().sendKeys(wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue());// user name is accessed
		pp.getWait();                                                                         // from excel sheet
		pp.getCont1();
		pp.getWait();
		pp.getPasword();
		pp.getPass().sendKeys(wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue());// password is accessed
		pp.getWait();                                                                      // from excel sheet
		pp.getCont2();
		pp.getWindow(driver);
	}

	@When("^user clicks on shortlist$")
	public void user_clicks_on_shortlist() {
		WebElement v = pp.getUser1();
		Actions sl = new Actions(driver);
		pp.getWait();
		sl.moveToElement(v).perform();
		pp.getShortlist();
	}

	@When("^user clicks on start and select a product$")
	public void user_clicks_on_start_and_select_a_product() {
		pp.getStartshop();
		pp.getWait();
		pp.getSelproduct();
	}

	@When("^user clicks on buy now$")
	public void user_clicks_on_buy_now() {
		pp.getWindows(driver);
		pp.getWait();
		pp.getBuynow();
	}

	@When("^user fill the details and save$") // here the details are accessed from excel sheet
	public void user_fill_the_details_and_save() {
		pp.getZip();
		pp.getName();
		pp.getFullname().sendKeys(wb.getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue());
		pp.getAddress().sendKeys(wb.getSheet("Sheet1").getRow(5).getCell(1).getStringCellValue());
		pp.getMobile();
		pp.getHome();
		pp.getSave();
	}

	@When("^user clicks on proceed to pay$")
	public void user_clicks_on_proceed_to_pay() {
		pp.getProceed();
		pp.getWait();
		pp.getCard();
		pp.getPay();
	}
}
