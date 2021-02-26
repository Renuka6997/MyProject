package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ABOUTStep {

	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIKRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("^user able to access the url of application$")
	public void user_able_to_access_the_url_of_application() throws Throwable {
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		String actual = driver.getTitle();
		String expected = "Online Shopping Site India - Shop Electronics, Mobiles, Men & Women Clothing, Shoes - www. Snapdeal.com";
		Assert.assertEquals(actual, expected);
	}

	@When("^user clicks on about us option$")
	public void user_clicks_on_about_us_option() throws Throwable {
		driver.findElement(By.xpath("//a[.='About Us']")).click();
		String a = driver.getWindowHandle();
		driver.switchTo().window(a);
	}

	@When("^user clicks on press and awards$")
	public void user_clicks_on_press_and_awards() throws Throwable {
		driver.findElement(By.xpath("//a[.='Press & Awards']")).click();
	}

	@Then("^user clicks on particular link$")
	public void user_clicks_on_particular_link() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[3]/div/div/div[2]/div[1]/div[1]/strong/a")).click();
		driver.quit();
	}
}
