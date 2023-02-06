package introduction_selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/gakushag/Documents/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		String [] expectedProducts = {"Cucumber","Brocolli"};
		addItems(driver, expectedProducts);
		driver.findElement(By.cssSelector("img[alt='cart']")).click();
		driver.findElement(By.xpath());

	}
	
	public static void addItems(WebDriver driver, String [] expectedProducts) {
		
		List <WebElement> productName = driver.findElements(By.cssSelector("h4.product-name"));
		List<WebElement> addToCartButton = driver.findElements(By.xpath("//button[text()='ADD TO CART']")); //ADD to cart changed to added button
		for(int i=0;i<productName.size();i++) {
			String[] name =productName.get(i).getText().split("-");
			String formattedName = name[0].trim();
			//convert array into array list for easy search
			List <String> itemNeeded = Arrays.asList(expectedProducts);
			if(itemNeeded.contains(formattedName)) {
				//click on add to cart
				addToCartButton.get(i).click();
			}
		}

	}
		
	}
