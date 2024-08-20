public class Main {
    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        lucas.setNome("lucas");


        Conta cc = new ContaCorrente(lucas);
//
//        cc.solicitarEmprestimo(150);
        Conta poupanca = new ContaPoupanca(lucas);
        poupanca.solicitarEmprestimo(30);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
