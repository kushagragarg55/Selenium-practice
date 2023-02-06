package introduction_selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownList {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mettl.com/en/");
		driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-button css-1ii3jfb']")).click();
//		WebElement parent = driver.findElement(By.className("MuiList-root MuiList-padding MuiMenu-list css-r8u8y9"));
		List <WebElement> ls  = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-1h36gmz']"));
		for(WebElement ui : ls) {
			if(userInput.equals(ui.getText())){
				ui.click();
			}
		}
	}

}
