package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.capgemini.generics.TestBase;
import com.capgemini.pages.TC_SIGNIN_01Page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_SIGNIN_01Step extends TestBase {

	WebDriver driver = new ChromeDriver();
	TC_SIGNIN_01Page a = new TC_SIGNIN_01Page(driver);

	@Test
	@Given("^user able to access the url of the application$")
	public void user_able_to_access_the_url_of_the_application() throws Throwable {
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		String actual = driver.getTitle();
		String expected = "Online Shopping Site India - Shop Electronics, Mobiles, Men & Women Clothing, Shoes - www. Snapdeal.com";
		Assert.assertEquals(actual, expected);
	}

	@Test
	@When("^user clicks on the signin option$")
	public void user_clicks_on_the_signin_option() throws Throwable {
		WebElement x = a.getSignin();
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(x).perform();
		a.getLogin1();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
	}

	@Test
	@Then("^user enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_valid_and(String un, String pw) throws Throwable {
		a.getUsername1();
		a.getEmail().sendKeys(un);
		a.getCont1();
		Thread.sleep(3000);
		a.getPassword();
		a.getPass().sendKeys(pw);
	}

	@Test
	@Then("^user login to the application$")
	public void user_login_to_the_application() throws Throwable {
		a.getCont2();
	}

	@Test
	@And("^user logout from the application$")
	public void user_logout_from_the_application() throws Throwable {
		a.getWindow(driver);
		Thread.sleep(3000);
		WebElement y = a.getUname();
		Actions un = new Actions(driver);
		Thread.sleep(3000);
		un.moveToElement(y).perform();
		a.getLogout();
		driver.close();
	}
}
