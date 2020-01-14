package MavenProject_2019.MavenProject_2019;

import java.util.Hashtable;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;



public class BrowserLocation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		//	ChromeDriver driver = new ChromeDriver();
		String downloadFilepath = "D:/Downloads_Source/";
		Map<String, Object> preferences = new Hashtable<String, Object>();
		preferences.put("profile.default_content_settings.popups", 0);
		preferences.put("download.prompt_for_download", "false");
		preferences.put("download.default_directory", downloadFilepath);

		// disable flash and the PDF viewer
		preferences.put("plugins.plugins_disabled", new String[]{
		    "Adobe Flash Player", "Chrome PDF Viewer"});

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		ChromeDriver driver = new ChromeDriver(capabilities);
	}

}
