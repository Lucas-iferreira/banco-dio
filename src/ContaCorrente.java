public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.importarInfosComuns();
    }


    @Override
    public void solicitarEmprestimo(double valorSolicitado) {
        double juros = 0.2;
        double valorOferecidoEmprestimo = 200 ;
        if(valorSolicitado <= valorOferecidoEmprestimo && valorSolicitado != 0){
            double  valorParaEmprestimo = valorOferecidoEmprestimo - valorSolicitado;
            depositar(valorSolicitado + saldo);
            emprestimo = valorSolicitado * juros + valorSolicitado;
            System.out.println("Empréstimo realizado com sucesso!");
            System.out.println("Você tem de emprestimo disponivel: " + valorParaEmprestimo);
        } else{
            System.out.println("O saldo solicitado é maior que o saldo oferecido! " );
        }



    }
}
