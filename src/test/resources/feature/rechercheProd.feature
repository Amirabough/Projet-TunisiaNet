#Author: Boughamoura Amira
Feature: verification de la recherche

  Scenario: verifier la recherche produit
    Given user accede a la page home
    When user saisi un produit "film de protection nano glass 9h pour samsung a12" dans la zone de recherche
    Then la page des produits "Film De Protection Nano Glass 9h Pour Samsung A12 Au Meilleur Prix Tunisie" est afficher
