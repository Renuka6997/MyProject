package com.capgemini.pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

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
	
	@FindBy(xpath="//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[1]/div/ul/li[2]/a")
	private WebElement shortlist;
	
	@FindBy(xpath="//*[@id=\"products-main4\"]/div[2]/div/a")
	private WebElement startshop;
	
	@FindBy(xpath="/html/body/div[10]/section/div[4]/section/div[2]/div[1]/div/div[6]/a/div[2]/img")
	private WebElement selproduct;
	
	@FindBy(xpath="/html/body/div[11]/section/div[1]/div[2]/div/div[1]/div[4]/div[3]/div/div[2]/div[1]/div/div[2]/span")
	private WebElement buynow;
	
	@FindBy(name="zip")
	private WebElement zip;
	
	@FindBy(name="fullName")
	private WebElement name;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(xpath="//*[@id=\"mobile\"]")
	private WebElement mobile;
	
	@FindBy(xpath="//*[@id=\"shipping-address-form\"]/div/div[10]/div/div[1]/label/span[1]")
	private WebElement home;
	
	@FindBy(xpath="/html/body/div[3]/div[3]/div[1]/div[4]/div[2]/div/form/div/div[12]/button/span")
	private WebElement save;
	
	@FindBy(xpath="//*[@id=\"make-payment\"]")
	private WebElement proceed;
	
	@FindBy(xpath="//*[@id=\"creditcard-payment-form\"]/div/div[1]/div[2]/input")
	private WebElement card;
	
	@FindBy(xpath="//*[@id=\"creditcard-continue\"]")
	private WebElement pay;
	
	public PaymentPage(WebDriver driver) {
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
	
	public void getPasword() {
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
		String s = driver.getWindowHandle();
		driver.switchTo().window(s);
	}
	
	public WebElement getUser1() {
		return user1;
	}
	
	public void getShortlist() {
		shortlist.click();
	}
	
	public void getStartshop() {
		startshop.click();
	}
	
	public void getSelproduct() {
		selproduct.click();
	}
	
	public void getWindows(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Set<String> c = driver.getWindowHandles();
		int count = 0;
		for(String ac : c) {
			count++;
			if(count==2) {
				driver.switchTo().window(ac);
			}
		}
	}
	
	public void getBuynow() {
		buynow.click();
	}
	
	public void getZip() {
		zip.clear();
		zip.click();
		zip.sendKeys("530017");
	}
	
	public void getName() {
		name.clear();
		name.click();
	}
	
	public WebElement getFullname() {
		return name;
	}
	
	public WebElement getAddress() {
		return address;
	}
	
	public void getMobile() {
		mobile.clear();
		mobile.click();
		mobile.sendKeys("8542398756");
	}
	
	public void getHome() {
		home.click();
	}
	
	public void getSave() {
		save.click();
	}
	
	public void getProceed() {
		proceed.click();
	}
	
	public void getCard() {
		card.clear();
		card.click();
		card.sendKeys("331122559966");
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

