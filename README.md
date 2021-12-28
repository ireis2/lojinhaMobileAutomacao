## Lojinha Mobile Automação

Este é um repositório que contém a automação de alguns testes de Mobile - Android de um software denominado lojinha. Os subtópicos abaixo descrevem algumas decisões tomadas na estruturação do projeto.

## Tecnologias Utilizadas

- Java
  (https://www.oracle.com/java/technologies/java-se-development-kit11-downloads.html)

- JUnit
  (https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.8.0-M1)

- Appium
  (https://mvnrepository.com/artifact/io.appium/java-client/7.5.1)

- Maven

(https://maven.apache.org/)

## Testes Automatizados

Testes para validar as partições de equivalência relacionadas ao valor do produto na lojinha, que estão vinculados diretamente a regra de negócio.

## Notas Gerais

- Sempre utilizamos a anotação Before Each para capturar o token que será utilizado posteriormente no métodos de testes.
-
- Nesse projeto fazemos uso do JUnit 5, o que nos dá a possibilidade de usar a anotação DisplayName para dar descrições em português para nossos testes.
