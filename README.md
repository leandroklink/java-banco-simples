# Sistema Bancário Simples em Java

Este é o meu primeiro projeto em Java com Programação Orientada a Objetos (POO).  
Ele sistema simula contas bancárias, permitindo depósitos, saques e exibição de dados da conta, suas funcionalidades são:

- Criação de contas bancárias com número, titular e saldo inicial.
- Realizar depósitos (com validação para não aceitar valores inválidos).
- Realizar saques (com validação de saldo e valor positivo).
- Exibir dados da conta formatados no console.
  
---

## Tecnologias Utilizadas
- **Java** (versão 17 ou superior)
- IDE utilizada: IntelliJ IDEA (pode rodar em qualquer IDE ou via terminal)

---

## Estrutura do Projeto

Banco/
├── domain/
│ └── Contabancaria.java # Classe principal da conta
├── test/
│ └── Contatest1.java # Classe com o método main para testar

## Como Executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/java-banco-simples.git
Compile os arquivos:
- javac TreinandoJava/Banco/domain/Contabancaria.java TreinandoJava/Banco/test/Contatest1.java

Execute a classe de teste:
- java TreinandoJava.Banco.Test.Contatest1
