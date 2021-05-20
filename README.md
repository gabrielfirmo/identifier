Este projeto tem o objetivo de auxiliar no estudo de testes funcionais utilizando a ferramenta JUnit. Para isso foi utilizado o programa *Identifier* como base.

### Recursos utilizados
- Java 11
- JUnit 5
- IntelliJ IDEA



### Especificação para o programa "*Identifier*"


##### Nome
*Identifier* - Determina se é válido ou não.

##### Uso
```java
IdentifierMainTest <string>
```
##### Descrição
O programa Identifier determina se um identificador é válido ou não. Um identificador válido deve começar com uma letra e conter apenas letras ou dígitos. Além disso, deve ter no mínimo um caractere e no máximo seis caracteres de comprimento.

##### Exemplos
Verificando um Identificador válido (respeita as restrições impostas na descrição):
```java
IdentifierMainTest "string"  
```
Output:
```java
Valido  
```

Verificando um Identificador inválido (extrapola o número máximo de caracteres aceitos):
```java
IdentifierMainTest "stringmuitogrand"  
```
Output:
```java
Invalido  
```