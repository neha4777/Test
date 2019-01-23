package com.parametrization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utility.Xls_Reader;

public class parameterization {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Xls_Reader reader = new Xls_Reader("E:\\workbench\\Selenium\\NehaDataDrivenFramework\\src\\com\\excel\\Fb.xlsx");
		int rowsize=reader.getRowCount("TestData");
		
		for(int rows=2; rows<=rowsize; rows++){
			String firstname =reader.getCellData("Testdata", "Firstname", rows);
			System.out.println(firstname);
			
			String surname =reader.getCellData("Testdata", "Surname", rows);
			System.out.println(surname);
			
			String emailaddress =reader.getCellData("Testdata", "Emailaddress", rows);
			System.out.println(emailaddress);
			
			String newpassword =reader.getCellData("Testdata", "Newpassword", rows);
			System.out.println(newpassword);
			
			
			
			System.out.println("neha deshmukh");
			
			driver.findElement(By.xpath(".//input[@id='u_0_j']")).clear();
			driver.findElement(By.xpath(".//input[@id='u_0_j']")).sendKeys(firstname);
			
			driver.findElement(By.xpath(".//input[@id='u_0_l']")).clear();
			driver.findElement(By.xpath(".//input[@id='u_0_l']")).sendKeys(surname);
			
			driver.findElement(By.xpath(".//input[@id='u_0_o']")).clear();
			driver.findElement(By.xpath(".//input[@id='u_0_o']")).sendKeys(emailaddress);
			
			driver.findElement(By.xpath(".//input[@id='u_0_v']")).clear();
			driver.findElement(By.xpath(".//input[@id='u_0_v']")).sendKeys(newpassword);
		}//for loop
		
	}//main

}
