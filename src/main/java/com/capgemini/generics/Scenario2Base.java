package com.capgemini.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2Base {

	public static WebDriver driver;
	public static Properties prop;

	public Scenario2Base() {
		try {
			prop = new Properties();
			FileInputStream f = new FileInputStream(
					"F:\\ProjectWorkspace\\Cucumber_Project\\src\\main\\java\\com\\capgemini\\property\\Scenario2.properties");
			//getting control over file
			prop.load(f);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public static void initial() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIKRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); //opens the chrome browser
		driver.manage().window().maximize(); //maximize the window
		driver.get(prop.getProperty("url")); //opens the application window
	}
}
