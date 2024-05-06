Feature: Búsqueda en Google
  Scenario: Realizar una búsqueda
    Given que estoy en la página de inicio de Google
    When ingreso "Cucumber" en el campo de búsqueda
    And presiono Enter
    Then veo resultados relacionados con "Cucumber"