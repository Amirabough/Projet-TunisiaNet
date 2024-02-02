package Page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommandeProduitpage {

	@FindBy(xpath="/html/body/main/section/div/div/div[2]/section/section/div[3]/div/div/div/div/article/div/div[2]/h2/a")
	List<WebElement> ProduitSSD;
	@FindBy(xpath="/html/body/main/section/div/div/nav/ol/li[5]/a/span")
	WebElement pageproduit;
	@FindBy(xpath="/html/body/main/section/div/div/div/section/div[1]/div[3]/div[4]/form/div[2]/div/div[2]/button")
    WebElement ajoutpanier;	
	@FindBy(linkText="Commander")
	WebElement commander;
	@FindBy(xpath="/html/body/main/section/div/div/div/section/div/div/div[1]/div[2]/ul/li[2]/div/div[2]/div[1]/a")
	WebElement contenantPanier;
	
	public CommandeProduitpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	public void clicOnproduit(String productName) {
		try {
		for(WebElement produit:ProduitSSD) {
			if(produit.getText().contains(productName)) {
				produit.click();
			}
		}
		}catch (Exception e) {
			
		}
	}
	public String verifProduit() {
		String Actualresult=pageproduit.getText();
		return(Actualresult);
	}
	public void ajoutPanier() {
		ajoutpanier.click();
		
		
	}
	public void commander() throws InterruptedException {
		Thread.sleep(3000);
		commander.click();
	}
	public String verifierPanier() {
		String Actualmessage=contenantPanier.getText();
		return(Actualmessage);
	}
}
