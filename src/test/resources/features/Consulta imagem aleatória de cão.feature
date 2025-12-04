Feature: Consultar imagens de cães
  Scenario: Consultar imagem aleatória de cão
    Given que realize requisição GET para o endpoint de imagem aleatória
    Then retorna status code 200 com imagem aleatória de cão