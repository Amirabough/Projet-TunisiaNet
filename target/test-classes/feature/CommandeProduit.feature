#Author: Boughamoura Amira
Feature: Commander un Produit

  Scenario: verifier Commande produit
    Given user accede a la page des produit
    When user clique sur le produit "Disque Dur Team Group MS30 SSD M.2 2280 / 128 Go"
    And user clique sur le bouton AjoutPanier
    And user clique sur le bouton Commander
    And le produit est ajoute dans le panier "Disque Dur Team Group MS30 SSD M.2 2280 / 128 Go"
