package TesttSuite;

import org.junit.Assert;

import Helper.Config;
import Helper.Utiles;
import Page.CommandeProduitpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommandeProduitStepDef {
	@Given("user accede a la page des produit")
	public void user_accede_a_la_page_des_produit() {
		 Config.ConfigChrome();
		   Config.maximizewindow();
		   try {
		   Config.navigateUrl(Utiles.getPropret("Web_Link_Produit"));
		   }catch (Exception e) {
			
		}
	}

	@When("user clique sur le produit {string}")
	public void user_clique_sur_le_produit(String prodname) {
	    CommandeProduitpage produitpage=new CommandeProduitpage(Config.driver);
	    produitpage.clicOnproduit(prodname);
	    String actualresult= produitpage.verifProduit();
		Assert.assertEquals(prodname, actualresult);
	}


	@When("user clique sur le bouton AjoutPanier")
	public void user_clique_sur_le_bouton_ajout_panier() {
		CommandeProduitpage produitpage=new CommandeProduitpage(Config.driver);
		
		 produitpage.ajoutPanier();
	}

	@When("user clique sur le bouton Commander")
	public void user_clique_sur_le_bouton_commander() throws InterruptedException {
		CommandeProduitpage produitpage=new CommandeProduitpage(Config.driver);
		
		 produitpage.commander();
	}
	
		
	@Then("le produit est ajoute dans le panier {string}")
	public void le_produit_est_ajoute_dans_le_panier(String produitNom) {
		CommandeProduitpage produitpage=new CommandeProduitpage(Config.driver);
		String actualresult= produitpage.verifierPanier();
		Assert.assertEquals(produitNom, actualresult);
		Config.driver.quit();
	}
}



