package com.capgemini.pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scenario2Page {

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
	
	@FindBy(xpath="//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]")
	private WebElement user1;
	
	@FindBy(xpath="//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[1]/div/ul/li[1]/a")
	private WebElement orders;
	
	@FindBy(xpath="//*[@id=\"dotAccountSavedAddressesLi\"]")
	private WebElement savedadd;
	
	@FindBy(xpath="//*[@id=\"dotAccountSavedAddresses\"]/div[4]/div[2]/div/a")
	private WebElement newadd;
	
	@FindBy(id="zip")
	private WebElement zip;
	
	@FindBy(id="fullName")
	private WebElement name;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(name="mobile")
	private WebElement mobile;
	
	@FindBy(xpath="/html/body/div[2]/div[5]/div[2]/div[3]/div/div/form/div/div[9]/div/div[1]")
	private WebElement home;
	
	@FindBy(xpath="//*[@id=\"dotaccount-saveAddress-continue\"]")
	private WebElement save;

	@FindBy(xpath = "//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]")
	private WebElement user2;

	@FindBy(xpath = "//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[1]/div/ul/li[5]/a")
	private WebElement logout;
	
	@FindBy(xpath="//*[@id=\"ajaxWidget-products_c_widget_cxe-0\"]/div[6]/a/div[2]/img")
	private WebElement product;
	
	@FindBy(xpath="//*[@id=\"buy-button-id\"]/span")
	private WebElement buynow;
	
	@FindBy(xpath="//*[@id=\"make-payment\"]")
	private WebElement proceed;
	
	@FindBy(xpath="//*[@id=\"creditcard-payment-form\"]/div/div[1]/div[2]/input")
	private WebElement card;
	
	@FindBy(xpath="//*[@id=\"creditcard-continue\"]")
	private WebElement pay;
	
	public Scenario2Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public WebElement getSignin() {
		return signin;
	}
	
	public void getLogin() {
		login.click();
	}
	
	public void getUsername() {
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
		String u = driver.getWindowHandle();
		driver.switchTo().window(u);
	}
	
	public WebElement getUser1() {
		return user1;
	}
	
	public void getOrders() {
		orders.click();
	}
	
	public void getSavedadd() {
		savedadd.click();
	}
	
	public void getNewadd() {
		newadd.click();
	}
	
	public void getZip() {
		zip.clear();
		zip.click();
	}
	
	public WebElement getPin() {
		return zip;
	}
	
	public void getName() {
		name.clear();
		name.click();
	}
	
	public WebElement getFullname() {
		return name;
	}
	
	public void getAdd() {
		address.click();
	}
	
	public WebElement getAddress() {
		return address;
	}
	
	public void getMobile() {
		mobile.clear();
		mobile.click();
	}
	
	public WebElement getPhone() {
		return mobile;
	}
	
	public void getHome() {
		home.click();
	}
	
	public void getSave() {
		save.click();
	}
	
	public WebElement getUser2() {
		return user2;
	}
	
	public void getLogout() {
		logout.click();
	}
	
	public void getProduct() {
		product.click();
	}
	
	public void getWindows(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Set<String> pro = driver.getWindowHandles();
		int count = 0;
		for (String st : pro) {
			count++;
			if (count == 2) {
				driver.switchTo().window(st);
			}
		}
	}
	
	public void getBuy() {
		buynow.click();
	}
	
	public void getProceed() {
		proceed.click();
	}
	
	public void getCard1() {
		card.click();
	}
	
	public WebElement getCard2() {
		return card;
	}
	
	public void getPay() {
		pay.click();
	}
	
	public void getWait() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
