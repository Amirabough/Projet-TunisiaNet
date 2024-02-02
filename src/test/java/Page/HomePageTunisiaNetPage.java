package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePageTunisiaNetPage {

	@FindBy(xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li/div[1]/span")
	List<WebElement> menus;
	@FindBy(xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li[2]/div[2]/div/div/ul/li/a")
	List<WebElement> submenus;
	@FindBy(xpath="/html/body/main/section/div/div/nav/ol/li[3]/a/span")
	WebElement PageMenu;
	public HomePageTunisiaNetPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void HoverOnMenu(String menuTitle) {
		
	 Config.action= new Actions(Config.driver);
	 try {
		for(WebElement menu:menus) {
			if(menu.getText().contains(menuTitle)) {
			Config.action.moveToElement(menu).perform();
			}
		}
	 }catch (Exception e) {
		
	}
		
	}
	 
	public void clickOnsubmenu(String submenuTitle) {
		try {
		for(WebElement submenu:submenus) {
			Thread.sleep(3000);
			if(submenu.getText().contains(submenuTitle)){
				
				submenu.click();
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	public String verifmenu() {
		String ActualResult=PageMenu.getText();
		return(ActualResult);
		
	}
	
	
	
	
	
	
	
}
