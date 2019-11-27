package MavenProject_2019.MavenProject_2019;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class CaptureScreenShort {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\dineshchrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// Code to capture the screenshot
		Shutterbug.shootPage(driver).withName("sowmiya").save("D:\\CaptureScreenshot");
		
		//FileUtils.copyFile(scrFile, new File("D:\\CaptureScreenshot\\google.jpg"));

	}

}
