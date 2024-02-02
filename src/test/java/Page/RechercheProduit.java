package Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RechercheProduit {
	@FindBy(id="search_query_top")
	WebElement recherche;
	@FindBy(xpath="/html/body/main/section/div/div/div[2]/section/h1")
	WebElement pageFilmProtect;
	/*@FindBy(tagName="h1")
	WebElement pageFilmProtect;*/
	
	
	public RechercheProduit(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void recherche(String prod) {
		recherche.sendKeys(prod+Keys.ENTER);
		
	}
	public String verifpage() {
		String actualresult=pageFilmProtect.getText();
		return(actualresult);
	}

}
