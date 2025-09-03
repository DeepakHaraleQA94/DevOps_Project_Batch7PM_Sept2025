package AutomationWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ValidateloginPage {
	@Test
	public void LoginPage() {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yessinfotech.com/");
		driver.close();
	}
}
