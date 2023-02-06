package introduction_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("");
		String password = driver.findElement(By.id("")).getText();
		boolean lowercase;
		boolean uppercase;
		for(int i=0;i<password.length();i++) {
			char c = password.charAt(i);
			if(Character.isLowerCase(c)) {
				lowercase = true;
			}
			if(Character.isUpperCase(c)) {
				uppercase = true;
			}
		}
	}

}
