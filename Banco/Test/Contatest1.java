package TreinandoJava.Banco.Test;

import TreinandoJava.Banco.domain.Contabancaria;

public class Contatest1 {
    public static void main(String[] args) {
        Contabancaria conta1 = new Contabancaria("40028922", "Leandro klink", 20000);
        Contabancaria conta2 = new Contabancaria("18276314", "John Wick", 5000);


        conta1.depositar(30000);
        conta1.sacar(5000);

        conta2.sacar(60000);
        conta2.depositar(5000);
        conta1.exibirDados();
        conta2.exibirDados();
    }
}
