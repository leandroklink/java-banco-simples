package TreinandoJava.Banco.domain;

public class Contabancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public Contabancaria(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valorDeposito){
        if (valorDeposito <= 0){
            System.out.println("Valor de deposito invalido");
        }else {
            this.saldo += valorDeposito;
        }
    }
    public void sacar(double valorSacar){
        if (valorSacar <= 0){
            System.out.println("Valor de sacar invalido");
        }else{
            if (valorSacar > this.saldo){
                System.out.println("Saldo insuficiente para sacar R$"+ valorSacar+ " na conta " + this.numeroConta);
            }else{
                this.saldo -= valorSacar;
            }
        }
    }

    public void exibirDados(){
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Titular: " + this.titular);
        System.out.printf("Saldo: RS %.2f%n",this.saldo);
        System.out.println();
    }
}
