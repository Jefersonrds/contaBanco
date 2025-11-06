package Conta;

public class contaBanco {

    //--------- Atributos
    private int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //---------- Getters, Setters e Construtors
    public int getNumConta(){
        return numConta;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getDono(){
        return dono;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public contaBanco(){
        this.saldo = 0;
        this.status = false;

    }

    //---------- Metodos
    public void abrirConta(String dono, String tipo){

        if (tipo.equals("CC")) {

            System.out.println("Conta corrente aberta! Voce acaba de ganhar 50 dinheiros");
            setTipo("CC");
            setSaldo(50);
            System.out.println("Seu saldo e de: "+getSaldo());

        }else if(tipo.equals("CP")) {

            System.out.println("Conta poupanca aberta! Voce acaba de ganhar 150 dinheiros");
            setTipo("CP");
            setSaldo(150);
            System.out.println("Seu saldo e de: "+getSaldo());
        }
        status = true;
    }
    public void fecharConta(){

        if (getStatus()==false) {

            System.out.println("Operacao invalida! Sua conta ja esta fechada!");

        } else if (saldo>0 ) {
            System.out.println("Voce nao pode fechar sua conta pois o seu saldo e maior que zero! Favor sacar todo o seu saldo!");
            System.out.println("Saldo restante: "+getSaldo());
        } else if (saldo<0) {
            System.out.println("Voce nao pode fechar sua conta pois o seu saldo e menor que zero! depositar " + getSaldo()*-1 + " para que o seu saldo seja zerado e assim fechar a conta");
            System.out.println("Saldo restante: " + getSaldo());
        }else {
            setStatus(false);
            System.out.println("Conta fechada! Muito obrigado!");
        }
    }


    public void depositar(double valorDeposito){

        if(getStatus()==false){

            System.out.println("Voce nao pode depositar, sua conta nao esta aberta");

        }else {
            System.out.println("Voce depositou: " + valorDeposito + " dinheiros");
            setSaldo(this.saldo + valorDeposito);
            System.out.println("Seu saldo atual e de: "+getSaldo());
        }

    }
    public void sacar(double valorSaque){
        
        if (status && this.saldo>0) {
            System.out.println("Voce sacou: "+valorSaque);
            setSaldo(this.saldo-valorSaque);
            System.out.println("Seu saldo atual e: " + getSaldo());
        }else{
            System.out.println("Voce nao pode sacar, pois sua conta esta com saldo abaixo de zero ou fechada!");
            System.out.println("Seu saldo: "+getSaldo());
            System.out.println("Status da conta: " + getStatus());
        }
    }
    public void pagarMensal(){


        if(getTipo() == "CC"){

            System.out.println("Foi descontado 12 dinheiros da sua conta corrente!");
            setSaldo(this.saldo-12);
        }else{
            System.out.println("Foi descontado 20 dinheiros da sua conta poupanca!");
            setSaldo(this.saldo-20);
        }
        System.out.println("O seu saldo atual e de: "+getSaldo());

    }



}
