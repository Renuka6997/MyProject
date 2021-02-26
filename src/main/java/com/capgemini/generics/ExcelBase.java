package com.capgemini.generics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelBase {

	public static WebDriver driver;
	static String path = "F:\\ProjectWorkspace\\Cucumber_Project\\src\\main\\resources\\Data.xlsx";
	public static Workbook wb;
	
	public ExcelBase() {
		try {
			FileInputStream f = new FileInputStream(path); //getting control over file
			wb = WorkbookFactory.create(f); // creating a workbook
		} catch ( EncryptedDocumentException e)  {
			e.getMessage(); 
		} catch (InvalidFormatException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
	public static void initial() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VIKRAM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); //opens the chrome browser
		driver.manage().window().maximize(); //maximize the window
		String url = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue(); //getting control over excel sheet
		driver.get(url); //opens the application window
	}
}

