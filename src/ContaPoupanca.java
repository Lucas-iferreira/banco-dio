import Exceptions.EmprestimoException;

public class ContaPoupanca extends  Conta{


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        importarInfosComuns();
    }

    @Override
    public void solicitarEmprestimo(double valorSolicitado) {
        throw new EmprestimoException("Conta Poupança não pode utilizar o serviço de emprestimo! Somente a Conta corrente");
    }
}
