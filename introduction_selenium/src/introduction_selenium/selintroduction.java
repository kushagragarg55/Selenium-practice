package introduction_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selintroduction {

	public static void main(String[] args) {
		//Invoking Browser
		//chromeriver.exe -> chrome browser
		System.setProperty("webdriver.chrome.driver", "/Users/gakushag/Documents/selenium/chromedriver"); //selenium mananger (beta) handles it in backend by downloading the required chrome driver
		//webdriver.chrome.driver -> values of path
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();  // close the current window
//		driver.quit(); // close all associated window
		//firefox launch
		WebDriver driverFire = new FirefoxDriver();
		
	}
}
