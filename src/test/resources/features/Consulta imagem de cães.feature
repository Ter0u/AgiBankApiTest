Feature: Consultar imagens de cães
  Scenario: Consultar lista de imagens de cães
    Given que realize requisição GET para o endpoint de imagens de cães
    Then retorna status code 200 com uma lista de imagem dos cães