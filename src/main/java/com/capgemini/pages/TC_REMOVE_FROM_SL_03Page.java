package com.capgemini.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_REMOVE_FROM_SL_03Page {

	@FindBy(xpath="//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]")
	private WebElement signin1;
	
	@FindBy(xpath="//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]")
	private WebElement login;
	
	@FindBy(xpath="//*[@id=\"userName\"]")
	private WebElement username;
	
	@FindBy(xpath="//*[@id=\"checkUser\"]")
	private WebElement cont;
	
	@FindBy(xpath="//*[@id=\"j_password_login_uc\"]")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"submitLoginUC\"]")
	private WebElement loginbtn;
	
	@FindBy(xpath="//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]")
	private WebElement uname;
	
	@FindBy(xpath="/html/body/div[2]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[1]/div/ul/li[2]/a")
	private WebElement shortlistbtn;
	
	@FindBy(xpath="//a[.='Remove from Shortlist']")
	private WebElement remove;
	
	public TC_REMOVE_FROM_SL_03Page(WebDriver driver) {
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
	
	public WebElement getUname() {
		return uname;
	}
	
	public void getShortlistbtn() {
		shortlistbtn.click();
	}
	
	public void getRemoval() {
		remove.click();
	}
}
