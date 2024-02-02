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
	}

	@Then("user est redirigr vers la page de produit {string}")
	public void user_est_redirigr_vers_la_page_de_produit(String nameprod) {
		 CommandeProduitpage produitpage=new CommandeProduitpage(Config.driver);
		String actualresult= produitpage.verifProduit();
		Assert.assertEquals(nameprod, actualresult);
	}

	@Given("user accede ala page produit {string}")
	public void user_accede_ala_page_produit(String string) {
		 Config.ConfigChrome();
		   Config.maximizewindow();
		   try {
		   Config.navigateUrl(Utiles.getPropret("Web_LinK_produit_Commande"));
		   }catch (Exception e) {
			
		}
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

	
	
	@Then("user rediriger vers la page contenant panier du {string}")
	public void user_rediriger_vers_la_page_contenant_panier_du(String produitNom) {
		 CommandeProduitpage produitpage=new CommandeProduitpage(Config.driver);
			String actualresult= produitpage.verifierPanier();
			Assert.assertEquals(produitNom, actualresult);
	}
	
}



