package TesttSuite;

import org.junit.Assert;

import Helper.Config;
import Helper.Utiles;
import Page.RechercheProduit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RechercheOProduitStepDef {

	@Given("user accede a la page home")
	public void user_accede_a_la_page_home() {
		 Config.ConfigChrome();
		   Config.maximizewindow();
		   try {
		   Config.navigateUrl(Utiles.getPropret("Web_Portal_Link"));
		   }catch (Exception e) {
			
		}
	}

	@When("user saisi un produit {string} dans la zone de recherche")
	public void user_saisi_un_produit_dans_la_zone_de_recherche(String prodname) {
	   RechercheProduit search=new RechercheProduit(Config.driver);
	   search.recherche(prodname);
	}

	@Then("la page des produits {string} est afficher")
	public void la_page_des_produits_est_afficher(String prodReche) {
		RechercheProduit search=new RechercheProduit(Config.driver);
		String actualresult=search.verifpage();
	Assert.assertEquals(actualresult,prodReche);
	}
}
