# Verificador de Palíndromos

Este projeto é um programa em Java que solicita ao usuário uma palavra ou frase e verifica se ela é um palíndromo. O programa repetirá as solicitações de entrada até que o usuário insira uma palavra ou frase que seja um palíndromo, exibindo uma mensagem correspondente ao resultado da verificação.

## Tecnologias

Linguagem: Java
- **IDE recomendada**: NetBeans (mas pode ser usado em qualquer IDE que suporte Java)
- **Funcionalidades**: Verificação de palíndromos em palavras e frases. Ignorando caracteres especiais, espaços e diferenciação entre maiúsculas e minúsculas para realizar a verificação. Mantém o programa em um laço até que um palíndromo seja digitado.


## Exemplo de Palíndromo
Palavra: "arara"
Frase: "A base do teto desaba"

## Estrutura do Código

- **main**: método principal que inicializa o programa e contém o laço do-while para verificar repetidamente até que um palíndromo seja inserido.
- **Palindromo(String palavra)**: método estático que recebe a entrada do usuário, remove caracteres especiais e espaços, transforma a palavra para minúsculas e verifica se a palavra invertida é igual à original.
