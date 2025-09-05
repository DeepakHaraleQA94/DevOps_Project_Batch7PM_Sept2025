package AutomationWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ValidateHomePage {
	@Test
	public void HomePage() {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println();
		driver.get("https://www.yessinfotech.com/");
		System.out.println("HIii");
		driver.close();
	}
}
