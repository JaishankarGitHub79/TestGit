package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.ie.driver", "D://Jars//IEDriverServer.exe");
		WebDriver driver = new SafariDriver();
		driver.get("http://www.syntelinc.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
