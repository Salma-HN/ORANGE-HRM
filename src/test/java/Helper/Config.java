package Helper;



import org.openqa.selenium.remote.RemoteWebDriver;

public class Config {

	public static RemoteWebDriver driver;
	public static void confChrome() {
		
		System.setProperty("Webriver.chrome.driver", "c:/chromedriver.exe");
		
	}
	
	public static void maximaseWindow() {
		driver.manage().window().maximize();
	}
	

}
