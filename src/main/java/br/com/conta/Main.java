package br.com.conta;

public class Main {
    public static void main(String[] args) {
        ContaBanco cc = new ContaBanco(0,false);
        cc.abrirConta("cc");
        cc.setNumConta(123456);
        cc.setDono("Creusa");
        cc.getSaldo();
        cc.depositar(500);
        cc.getSaldo();
        cc.sacar(100);
        cc.fecharConta();
        cc.printarConta();


        ContaBanco cp = new ContaBanco(0,false);
        cp.abrirConta("cp");
        cp.setNumConta(678910);
        cp.setDono("Jubileu");
        cp.getSaldo();
        cp.depositar(300);
        cp.getSaldo();
        cp.printarConta();
    }
}