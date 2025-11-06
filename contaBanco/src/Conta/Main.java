package Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int finalizarOperacao;

        ContaBanco contaJubileu = new ContaBanco();

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao melhor banco!");
        System.out.println("Iremos dar sequencia no seu atendimento");


        contaJubileu.abrirConta("Jubileu","CP");
        contaJubileu.depositar(20);
        contaJubileu.sacar(400);

        contaJubileu.pagarMensal();

        contaJubileu.depositar(250);

        contaJubileu.fecharConta();
    }
}