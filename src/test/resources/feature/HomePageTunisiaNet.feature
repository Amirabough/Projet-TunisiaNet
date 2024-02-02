#Author: Boughamoura Amira
Feature: Verification des menus de la page acceuil

  Scenario: Verifier les menus de la page acceuil
    Given user accede a la page acceuil
    When user survole la souris sur le menu "Téléphonie & Tablette" de la page acceuil
    And user clique sur le submenu "Tablette tactile"
    Then user est dirigé vers la page de submenu "Tablette tactile"
