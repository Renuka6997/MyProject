package com.capgemini.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
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

	@FindBy(xpath = "/html/body/div[2]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]")
	private WebElement uname;

	@FindBy(xpath = "//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[1]/div/ul/li[5]/a")
	private WebElement logout;

	public LoginPage(WebDriver driver) {
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

	public WebElement getUname() {
		return uname;
	}

	public void getWindow(WebDriver driver) {
		PageFactory.initElements(driver, this);
		String s = driver.getWindowHandle();
		driver.switchTo().window(s);
	}

	public void getLogout() {
		logout.click();
	}
	
	public void getWait() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
//	public void getWait() throws InterruptedException { (here the exception should be handled)
//		Thread.sleep(3000);
//	}
}
