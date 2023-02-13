package br.com.conta;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(double saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(String tipo) {
        this.tipo = tipo;
        this.status = true;
        if (tipo == "cc") {
            this.saldo = 50;
        } else if (tipo == "cp") {
            this.saldo = 150;
        }
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("Conta com Dinheiro");
        } else if (this.saldo < 0) {
            System.out.println("Conta em Débito");
        } else {
            setStatus(false);
        }
    }

    public void depositar(double valor) {
        if (this.status = true) {
            this.saldo = this.saldo + valor;
        } else {
            System.out.println("Impossível Depositar");
        }
    }

    public void sacar(double valor) {
        if (this.status = true) {
            if (this.saldo > valor) {
                this.saldo = this.saldo - valor;
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Impossível Sacar");
        }
    }

    public void pagarMensal() {
        double valor = 0;
        if (this.tipo == "cc") {
            valor = 12;
        } else if (this.tipo == "cp") {
            valor = 20;
        }
        if (this.status == true) {
            if (this.saldo > valor) {
                this.saldo = this.saldo - valor;
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Impossível Pagar");
        }
    }

    public void printarConta(){
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Numero da conta: " + this.numConta);
        System.out.println("--------------------");
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}


