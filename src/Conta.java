import lombok.Data;

import java.util.concurrent.ThreadLocalRandom;

@Data
public abstract class Conta implements IConta{
    private static  int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO= 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected double emprestimo;



    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }

    protected void importarInfosComuns(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()).toUpperCase());
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println(String.format("%s está devendo para o Banco: %.2f", this.cliente.getNome().toUpperCase(), this.emprestimo));
    }

    @Override
    public void sacar(double valor) {
        saldo-=valor;
    }

    @Override
    public void depositar(double valor) {
        saldo+=valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


}
