package Edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;

public class bucket {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","/Users/gakushag/Documents/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("");
		String textBeforeClick = driver.findElement(By.id("statusElementId")).getText();
		Assert.assertEquals(,textBeforeClick);
		driver.findElement(By.id("ButtonId")).click();
		
		
		driver.quit();
	}
}
