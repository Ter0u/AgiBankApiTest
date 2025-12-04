Feature: Consultar raças de cães
  Scenario: Consultar todas as raças
    Given que realize requisição GET buscando a lista de todos cães
    Then retorna status code 200 com a lista completa dos cães