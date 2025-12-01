# Sistema Bancário – Prática de POO em Java

Este projeto é um **Sistema Bancário simples**, desenvolvido com o objetivo de praticar:

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Criação de classes e métodos especiais
- Relacionamento entre objetos
- Diagramas UML
- Registro de histórico de operações

O sistema permite criar contas bancárias, realizar operações básicas e registrar todas as transações em um histórico.

---

## Funcionalidades

### **BankAccount**
- Criar uma conta bancária com ID e nome completo  
- Depositar valores  
- Sacar valores  
- Transferir entre contas  
- Consultar saldo  
- Registrar todas as operações automaticamente em um histórico  

### **Transaction**
A cada operação realizada, uma transação é registrada contendo:
- Tipo da operação  
- Valor  
- Data e hora  
- Conta de origem  
- Conta de destino (quando houver)  


### **Diagrama UML**

```txt

+---------------------+
|     BankAccount     |
+---------------------+
| - idNumber: String  |
| - fullName: String  |
| - balance: double   |
| - transactions: List<Transaction> |
+---------------------+
| + deposit(amount)   |
| + withdraw(amount)  |
| + transfer(amount, dest) |
| + showBalance()     |
| + printTransactionHistory() |
| + getFullName()     |
| + getBalance()      |
+---------------------+

               1  * 
BankAccount ----------------> Transaction

+-----------------------------+
|        Transaction          |
+-----------------------------+
| - type: String              |
| - amount: double            |
| - timestamp: LocalDateTime  |
| - sourceAccount: String     |
| - destinationAccount: String|
+-----------------------------+
| + toString()                |
+-----------------------------+


```

### **Como Executar**
Baixe ou clone o repositório
Abra o projeto em sua IDE Java preferida (IntelliJ, VSCode, Eclipse etc.)
Assegure-se de estar usando Java 17+ (ou superior)
Execute a classe `Main.java`


### **Objetivo**
Projeto criado como exercício prático de POO, para consolidar conhecimentos sobre:
Classes
Métodos
Encapsulamento
Relacionamento entre objetos
Modelagem UML
Estruturas de dados simples (lista de histórico)
