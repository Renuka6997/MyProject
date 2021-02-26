//package StepDef;
//
//import java.util.List;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//
//import com.capgemini.generics.AddressBase;
//import com.capgemini.pages.ADDRESSPage;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class ADDRESSStep extends AddressBase {
//	
//	ADDRESSPage ap;
//
//	@Given("^user is able to access the url$")
//	public void user_is_able_to_access_the_url() throws Throwable {
//	    AddressBase.initial();
//	}
//
//	@When("^user select sign in and clicks on the login button$")
//	public void user_select_sign_in_and_clicks_on_the_login_button() throws Throwable {
//		ap = new ADDRESSPage(driver);
//	    WebElement x = ap.getSignin();
//	    Actions action = new Actions(driver);
//	    Thread.sleep(3000);
//	    action.moveToElement(x).perform();
//	    ap.getLogin();
//	    driver.switchTo().frame(0);
//	}
//
//	@Then("^user enters valid credentials$")
//	public void user_enters_valid_credentials() throws Throwable {
//	  ap.getUsername();
//	  Thread.sleep(3000);
//	  WebElement un = ap.getEmail();
//	  un.sendKeys(prop.getProperty("username"));
//	  Thread.sleep(3000);
//	  ap.getCont1();
//	  Thread.sleep(3000);
//	  ap.getPassword();
//	  WebElement pw = ap.getPass();
//	  pw.sendKeys(prop.getProperty("password"));
//	  Thread.sleep(3000);
//	  ap.getCont2();
//	}
//
//	@Then("^user selects an option from profile$")
//	public void user_selects_an_option_from_profile() throws Throwable {
//		ap.getWindow(driver);
//		WebElement y = ap.getUname();
//		Actions user = new Actions(driver);
//		Thread.sleep(3000);
//		user.moveToElement(y).perform();
//		ap.getOrders();
//	}
//
//	@Then("^user clicks on saved addresses$")
//	public void user_clicks_on_saved_addresses() throws Throwable {
//	    ap.getSavedadd();
//	}
//
//	@Then("^user clicks on add address$")
//	public void user_clicks_on_add_address() throws Throwable {
//	    ap.getNewadd();
//	}
//
//	@Then("^user fills the details$")
//	public void user_fills_the_details(DataTable details) throws Throwable {
//		List<List<String>> ele = details.raw();
//		ap.getZip();
//		ap.getPin().sendKeys(ele.get(0).get(0));
//		ap.getName();
//		ap.getFullname().sendKeys(ele.get(0).get(1));
//		ap.getAdd1();
//		ap.getAddress().sendKeys(ele.get(1).get(0));
//		ap.getMobile();
//		ap.getNumber().sendKeys(ele.get(1).get(1));
//		ap.getHome();
//	}
//
//	@Then("^user clicks on save button and able to see the saved address$")
//	public void user_clicks_on_save_button_and_able_to_see_the_saved_address() throws Throwable {
//	    ap.getSave();
//	}
//}
