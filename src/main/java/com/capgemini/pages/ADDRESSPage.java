package com.capgemini.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ADDRESSPage {

	@FindBy(xpath="//span[.='Sign In']")
	private WebElement signin;
	
	@FindBy(xpath="//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]/a")
	private WebElement login;
	
	@FindBy(id="userName")
	private WebElement username;
	
	@FindBy(id="userName")
	private WebElement email;
	
	@FindBy(xpath="//*[@id=\"checkUser\"]")
	private WebElement cont1;
	
	@FindBy(id="j_password_login_uc")
	private WebElement password;
	
	@FindBy(xpath="/html/body/div/div/div/div[8]/div[1]/form/input[1]")
	private WebElement pass;
	
	@FindBy(id="submitLoginUC")
	private WebElement cont2;
	
	@FindBy(xpath="//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]")
	private WebElement uname;
	
	@FindBy(xpath="//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[1]/div/ul/li[1]/a")
	private WebElement orders;
	
	@FindBy(xpath="//*[@id=\"dotAccountSavedAddressesLi\"]")
	private WebElement savedadd;
	
	@FindBy(xpath="//*[@id=\"dotAccountSavedAddresses\"]/div[4]/div[2]/div/a")
	private WebElement newadd;
	
	@FindBy(id="zip")
	private WebElement zip;
	
	@FindBy(name="postalCode")
	private WebElement pin;
	
	@FindBy(id="fullName")
	private WebElement name;
	
	@FindBy(name="name")
	private WebElement fullname;
	
	@FindBy(name="address1")
	private WebElement add1;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(name="mobile")
	private WebElement mobile;
	
	@FindBy(id="mobile")
	private WebElement number;
	
	@FindBy(xpath="/html/body/div[2]/div[5]/div[2]/div[3]/div/div/form/div/div[9]/div/div[1]")
	private WebElement home;
	
	@FindBy(xpath="//*[@id=\"dotaccount-saveAddress-continue\"]")
	private WebElement save;
	
	public ADDRESSPage(WebDriver driver) {
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
		return email;
	}
	
	public void getCont1() {
		cont1.click();
	}
	
	public void getPassword() {
		password.click();
	}
	
	public WebElement getPass() {
		return pass;
	}
	
	public void getCont2() {
		cont2.click();
	}
	
	public void getWindow(WebDriver driver) {
		PageFactory.initElements(driver, this);
		String a = driver.getWindowHandle();
		driver.switchTo().window(a);
	}
	
	public WebElement getUname() {
		return uname;
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
		return pin;
	}
	
	public void getName() {
		name.clear();
		name.click();
	}
	
	public WebElement getFullname() {
		return fullname;
	}
	
	public void getAdd1() {
		add1.clear();
		add1.click();
	}
	
	public WebElement getAddress() {
		return address;
	}
	
	public void getMobile() {
		mobile.clear();
		mobile.click();
	}
	
	public  WebElement getNumber() {
		return number;
	}
	
	public void getHome() {
		home.click();
	}
	
	public void getSave() {
		save.click();
	}
}
