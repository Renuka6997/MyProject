package com.capgemini.pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_ADD_TO_CART_04Page {

	@FindBy(xpath = "//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]")
	private WebElement signin;

	@FindBy(xpath = "/html/body/div[2]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]/a")
	private WebElement login;

	@FindBy(xpath = "//*[@id=\"userName\"]")
	private WebElement username;

	@FindBy(xpath = "//*[@id=\"checkUser\"]")
	private WebElement cont1;

	@FindBy(xpath = "//*[@id=\"j_password_login_uc\"]")
	private WebElement password;

	@FindBy(xpath = "//*[@id=\"submitLoginUC\"]")
	private WebElement cont2;

	@FindBy(xpath = "/html/body/div[10]/section/div[4]/section/div[2]/div[1]/div/div[6]/a/div[2]/img")
	private WebElement product;

	@FindBy(xpath = "//*[@id=\"add-cart-button-id\"]")
	private WebElement cart;
	
//	@FindBy(xpath="/html/body/div[4]/div[2]/div/section/div/div[1]/span/i")
//	private WebElement close;

	@FindBy(xpath = "//*[@id=\"cartProductContainer\"]/div/div[2]/div[2]/div/div[2]/div")
	private WebElement viewcart;

	public TC_ADD_TO_CART_04Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public WebElement getSignin() {
		return signin;
	}

	public void getLogin1() {
		login.click();
	}

	public void getUsername1() {
		username.click();
	}

	public WebElement getEmail() {
		return username;
	}

	public void getCont1() {
		cont1.click();
	}

	public void getPassword() {
		password.click();
	}

	public WebElement getPass() {
		return password;
	}

	public void getCont2() {
		cont2.click();
	}

	public void getWindow(WebDriver driver) {
		PageFactory.initElements(driver, this);
		String s1 = driver.getWindowHandle();
		driver.switchTo().window(s1);
	}

	public void getProduct() {
		product.click();
	}

	public void getCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Set<String> s = driver.getWindowHandles();
		int count = 0;
		for (String st : s) {
			count++;
			if (count == 2) {
				driver.switchTo().window(st);
			}
		}
		cart.click();
	}

	public WebElement getViewcart() {
		return viewcart;
	}
}

