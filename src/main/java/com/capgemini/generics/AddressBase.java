package com.capgemini.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddressBase {

	public static WebDriver driver;
	public static Properties prop;

	public AddressBase() {
		try {
			prop = new Properties();
			FileInputStream f = new FileInputStream(
					"F:\\ProjectWorkspace\\Cucumber_Project\\src\\main\\java\\com\\capgemini\\property\\ADDRESS.properties");
			prop.load(f);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public static void initial() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIKRAM\\Downloads\\chromedriver_win32.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}
}
