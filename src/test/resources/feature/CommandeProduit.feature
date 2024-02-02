#Author: Boughamoura Amira
Feature: Commander un Produit

  Scenario: verifier affichage de page produit
    Given user accede a la page des produit
    When user clique sur le produit "Disque Dur Team Group MS30 SSD M.2 2280 / 128 Go"
    Then user est redirigr vers la page de produit "Disque Dur Team Group MS30 SSD M.2 2280 / 128 Go"
    

  Scenario: verifier la commande de produit "Disque Dur Team Group MS30 SSD M.2 2280 / 128 Go"
    Given user accede ala page produit "Disque Dur Team Group MS30 SSD M.2 2280 / 128 Go"
    When user clique sur le bouton AjoutPanier
    And user clique sur le bouton Commander
    Then user rediriger vers la page contenant panier du "Disque Dur Team Group MS30 SSD M.2 2280 / 128 Go"
  
