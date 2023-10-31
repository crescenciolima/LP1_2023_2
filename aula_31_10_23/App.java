public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta("123-4", 150.0);
        Poupanca p1 = new Poupanca("456-7", 220.0);
        ContaImposto ci1 = new ContaImposto("907-8", 510.0);

        c1.debitar(150.0);
        p1.debitar(20.0);
        p1.renderJuros(0.01);
        ci1.debitar(100.0);

        Repositorio contas = new Repositorio();
        contas.inserir(c1);
        contas.inserir(p1);
        contas.inserir(ci1);
        contas.remover(c1);

        contas.printALL();
    }
}
