package com.achu.training.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SampleSeleniumTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\achu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
	}
	
	@Test
	public void validateGoogleId() throws Exception {
		driver.manage().window().maximize();
	    driver.get("https://www.google.com/intl/en-GB/gmail/about/");
	    driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("Pratik.modh24@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		Thread.sleep(5000);
		boolean textFound = driver.getPageSource().contains("Forgot password");
		AssertJUnit.assertTrue(textFound);

	}
}

