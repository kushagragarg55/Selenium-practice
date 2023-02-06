package Edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElement {
	public static void main(String args[]) throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver","/Users/gakushag/Documents/selenium/chromedriver"); //doubt what is this??
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in/");
		Thread.sleep(4000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("POCO F1");
		Thread.sleep(4000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.navigate().to("https://edureka.co/blog");
		Thread.sleep(4000);
		driver.navigate().back();
		driver.quit();
	}

}
