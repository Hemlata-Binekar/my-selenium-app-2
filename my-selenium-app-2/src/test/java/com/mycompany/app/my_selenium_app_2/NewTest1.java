package com.mycompany.app.my_selenium_app_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest1 {
	public WebDriver driver;
  @Test
  public void launchBrowser() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium_April_2022\\Binary\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.naukri.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }
  @Test
  public void loginnaukri()
  {
	  //For open login detail
	  WebElement logBtn = driver.findElement(By.xpath("//div[text()='Login']"));
	  logBtn.click();
	  
	  //Login Credential
	  WebElement username = driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
	  WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
	  WebElement LoginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
	  username.sendKeys("hbinekar45@gmail.com");
	  password.sendKeys("1234566");
	  LoginBtn.click();
	  
	  
  }
}
