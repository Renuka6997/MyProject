package com.capgemini.pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_ADD_SL_02Page {

	@FindBy(xpath = "//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]")
	private WebElement signin1;

	@FindBy(xpath = "//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]")
	private WebElement login;

	@FindBy(xpath = "//*[@id=\"userName\"]")
	private WebElement username;

	@FindBy(xpath = "//*[@id=\"checkUser\"]")
	private WebElement cont;

	@FindBy(xpath = "//*[@id=\"j_password_login_uc\"]")
	private WebElement password;

	@FindBy(xpath = "//*[@id=\"submitLoginUC\"]")
	private WebElement loginbtn;

	@FindBy(xpath = "//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]")
	private WebElement uname;

	@FindBy(xpath = "/html/body/div[2]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[1]/div/ul/li[2]/a")
	private WebElement shortlistbtn;

	@FindBy(xpath = "//*[@id=\"products-main4\"]/div[2]/div")
	private WebElement shopping;

	@FindBy(xpath = "/html/body/div[10]/section/div[4]/section/div[2]/div[1]/div/div[6]/a/div[2]/img")
	private WebElement selproduct;

	@FindBy(xpath = "/html/body/div[11]/section/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/span/i")
	private WebElement shortlist;

	@FindBy(xpath = "/html/body/div[2]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]")
	private WebElement uname2;

	@FindBy(xpath = "/html/body/div[2]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[1]/div/ul/li[2]/a")
	private WebElement viewshortlist;

	public TC_ADD_SL_02Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public WebElement getSignin1() {
		return signin1;
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

	public void getCont() {
		cont.click();
	}

	public void getPassword() {
		password.click();
	}

	public WebElement getPass() {
		return password;
	}

	public void getLoginbtn() {
		loginbtn.click();
	}

	public void getWindow(WebDriver driver) {
		PageFactory.initElements(driver, this);
		String sl = driver.getWindowHandle();
		driver.switchTo().window(sl);
	}

	public WebElement getUname() {
		return uname;
	}

	public void getShortlistbtn() {
		shortlistbtn.click();
	}

	public void getShopping() {
		shopping.click();
	}

	public void getSelproduct() {
		selproduct.click();
	}

	public void getShortlistwin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Set<String> s = driver.getWindowHandles();
		int count = 0;
		for (String st : s) {
			count++;
			if (count == 2) {
				driver.switchTo().window(st);
			}
		}	
	}
	
	public void getShortlist() {
		shortlist.click();
	}

	public WebElement getUname2() {
		return uname2;
	}

	public void getViewshortlist() {
		viewshortlist.click();
	}
}
