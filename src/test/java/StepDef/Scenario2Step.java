package StepDef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.capgemini.generics.Scenario2Base;
import com.capgemini.pages.Scenario2Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Scenario2Step extends Scenario2Base {

	Scenario2Page sp;

	@Given("^User should be able to access the url of the application$")
	public void user_should_be_able_to_access_the_url_of_the_application() {
		Scenario2Base.initial();
		String actual = driver.getTitle();
		String expected = "Online Shopping Site India - Shop Electronics, Mobiles, Men & Women Clothing, Shoes - www. Snapdeal.com";
		Assert.assertEquals(actual, expected);
	}

	@When("^user moves to the signin button$")
	public void user_moves_to_the_signin_button() {
		sp = new Scenario2Page(driver);
		WebElement a = sp.getSignin();
		Actions sign = new Actions(driver);
		sp.getWait();
		sign.moveToElement(a).perform();
		sp.getLogin();
		driver.switchTo().frame(0);
	}

	@Then("^user is able to login with valid credentials$")
	public void user_is_able_to_login_with_valid_credentials() {
		sp.getUsername();
		sp.getEmail().sendKeys(prop.getProperty("username"));
		sp.getCont1();
		sp.getWait();
		sp.getPassword();
		sp.getPass().sendKeys(prop.getProperty("password"));
		sp.getCont2();
		sp.getWindow(driver);
	}

	@When("^user clicks on orders option and click on saved addresses$")
	public void user_clicks_on_orders_option_and_click_on_saved_addresses() {
		WebElement b = sp.getUser1();
		Actions us = new Actions(driver);
		sp.getWait();
		us.moveToElement(b).perform();
		sp.getOrders();
		sp.getWait();
		sp.getSavedadd();
	}

	@Then("^user clicks on add address$")
	public void user_clicks_on_add_address() {
		sp.getWindow(driver);
		sp.getNewadd();
	}

	@Then("^user fill the details and check for address on current page$")
	public void user_fill_the_details_and_check_for_address_on_current_page() {
		sp.getZip();
		sp.getPin().sendKeys(prop.getProperty("pin"));
		sp.getName();
		sp.getFullname().sendKeys(prop.getProperty("name"));
		sp.getAdd();
		sp.getAddress().sendKeys(prop.getProperty("address"));
		sp.getMobile();
		sp.getPhone().sendKeys(prop.getProperty("number"));
		sp.getHome();
		sp.getSave();
	}

	@Then("^user signs out from the application$")
	public void user_signs_out_from_the_application() {
		WebElement c = sp.getUser2();
		Actions us1 = new Actions(driver);
		sp.getWait();
		us1.moveToElement(c).perform();
		sp.getLogout();
		driver.close();
	}

	@When("^user selects a product from home page$")
	public void user_selects_a_product_from_home_page() {
		sp.getProduct();
	}

	@Then("^user clicks on buy now option$")
	public void user_clicks_on_buy_now_option() {
		sp.getWindows(driver);
		sp.getBuy();
	}

	@Then("^user clicks on proceed to pay button$")
	public void user_clicks_on_proceed_to_pay_button() {
		sp.getProceed();
	}

	@Then("^user fills card details and clicks on pay option$")
	public void user_fills_card_details_and_clicks_on_pay_option() {
		sp.getCard1();
		sp.getCard2().sendKeys(prop.getProperty("card"));
		sp.getPay();
	}
}
