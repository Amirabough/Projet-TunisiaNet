package TesttSuite;

import org.junit.Assert;

import Helper.Config;
import Helper.Utiles;
import Page.HomePageTunisiaNetPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageTunisiaStepDef {

@Given("user accede a la page acceuil")
public void user_accede_a_la_page_acceuil() {
   Config.ConfigChrome();
   Config.maximizewindow();
   try {
   Config.navigateUrl(Utiles.getPropret("Web_Portal_Link"));
   }catch (Exception e) {
	
}
}

@When("user survole la souris sur le menu {string} de la page acceuil")
public void user_survole_la_souris_sur_le_menu_de_la_page_acceuil(String menuname) {
   HomePageTunisiaNetPage home=new HomePageTunisiaNetPage(Config.driver);
   home.HoverOnMenu(menuname);
}

@When("user clique sur le submenu {string}")
public void user_clique_sur_le_submenu(String namesubmenu) {
	HomePageTunisiaNetPage home=new HomePageTunisiaNetPage(Config.driver);
	   home.clickOnsubmenu(namesubmenu);
}

@Then("user est dirigé vers la page de submenu {string}")
public void user_est_dirigé_vers_la_page_de_submenu(String submenuN) {
	HomePageTunisiaNetPage home=new HomePageTunisiaNetPage(Config.driver);
    String actualResult=home.verifmenu();
    Assert.assertEquals(submenuN, actualResult);
    Config.driver.quit();
}
}
