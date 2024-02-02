package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {
	public static WebDriver driver;
	public static Actions action;
public static void ConfigChrome() {
	try {
	System.setProperty("webdriver.chrome.driver",Utiles.getPropret("TestDriverPath"));
}catch (Exception e) {

}
	driver=new  ChromeDriver();
}
public static void maximizewindow() {
	driver.manage().window().maximize();
}
public static void navigateUrl(String url) {
	driver.get(url);
}
public static void closePage() {
	driver.quit();
}
}
