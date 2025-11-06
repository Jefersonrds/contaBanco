# 💰 ContaBanco - Projeto de Estudos em POO

## 📚 Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de praticar e consolidar os conhecimentos em **Programação Orientada a Objetos (POO)** utilizando a linguagem **Java**.  
O sistema simula um ambiente bancário básico, permitindo a criação de **contas correntes** e **contas poupança**, com operações como **depósito, saque, pagamento de mensalidade e fechamento de conta**.

Além disso, este projeto marca a migração do ambiente de desenvolvimento do **VS Code** para o **IntelliJ IDEA**, uma IDE amplamente utilizada no mercado profissional para projetos Java.

---

## 🎯 Objetivos

- Praticar os principais pilares da POO: **encapsulamento**, **construtores**, **métodos** e **regras de negócio**.  
- Simular operações bancárias com validações reais de estado.  
- Aprender a estruturar um projeto Java completo no **IntelliJ IDEA**.

---

## 🧩 Funcionalidades

- Abrir conta corrente ou poupança.  
- Depositar e sacar valores com validação de saldo e status.  
- Cobrar mensalidade conforme o tipo de conta.  
- Fechar conta apenas quando o saldo for igual a zero.  
- Exibir mensagens informativas sobre cada operação.

---

## ⚙️ Regras do Sistema

- Ao **abrir conta**:
  - Conta Corrente (`CC`) ganha **+50 dinheiros** de bônus inicial.
  - Conta Poupança (`CP`) ganha **+150 dinheiros** de bônus inicial.
- Para **fechar conta**, o saldo deve estar **zerado** (sem valores positivos ou negativos).
- Só é possível **depositar** e **sacar** se a conta estiver **aberta**.
- A cada chamada do método `pagarMensal()`:
  - Conta Corrente (`CC`) paga **12 dinheiros**.
  - Conta Poupança (`CP`) paga **20 dinheiros**.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java  
- **Paradigma:** Programação Orientada a Objetos (POO)  
- **IDE:** IntelliJ IDEA  
- **Versão Java:** 17

---

## 🚀 Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/Jefersonrds/ContaBanco.git
2. **Navegue até o diretório do projeto:**
  ```bash
  cd ContaBanco
```
3. **Compile o projeto:**
```bash
  javac Main.java
```
4. **Execute o projeto:**
```bash
  java Main
```

---

## 🧠 Exemplo de Uso
```bash
ContaBanco contaJubileu = new ContaBanco();
jub.setDono("Jubileu");
jub.abrirConta("CP");
jub.depositar(300);
jub.sacar(150);
jub.pagarMensal();

ContaBanco contaCreusa = new ContaBanco();
creusa.setDono("Creusa");
creusa.abrirConta("CC");
creusa.depositar(500);
creusa.sacar(100);
creusa.pagarMensal();
```
### Resultado esperado:
Jubileu: 150 dinheiros \
Creusa: 400 dinheiros
