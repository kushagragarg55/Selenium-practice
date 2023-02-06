package introduction_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "/Users/gakushag/Documents/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[@class='form-group']/input[@name='name']")).sendKeys("Kushagra Garg");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kushagra.garg55@gmail.com");
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("1234kushagra");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Select genderDropDown = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		genderDropDown.selectByVisibleText("Male");
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("14/09/1998");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	}

}
