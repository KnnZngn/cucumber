Feature: random
  Scenario Outline: knn a git
    Given siteye git
    And sign "butonuna" tikla
    And yeni account create et
    And email gir "<email>"
    And "<firstname>" ve "<secondname>" gir
    And bir adet "elma" iki adet "armut" uc adet "kivi" 4 adet "su" gonder
    And "<lastname>" gir
    And "<company>" gir
    And "<address>" gir
    When submit e tikla
    Then sonucu assert et
    And kenani ugurla
    Examples:
      | email | firstname | secondname | lastname | company | address |


