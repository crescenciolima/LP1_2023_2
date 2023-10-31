public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta("123-4", 100.0);
        Conta c2 = new Conta("888-8", 50.0);
        Poupanca p1 = new Poupanca("456-7", 150.0, 25);
        Poupanca p2 = new Poupanca("333-3", 25.0, 30);

        c1.creditar(10.0);
        p1.creditar(10.0);

        c1.debitar(20.0);
        p1.debitar(20.0);

        p1.renderJuros(0.01);

        //c1.imprimir();
        //p1.imprimir();

        Repositorio BD = new Repositorio();
        BD.inserir(c1);
        BD.inserir(c2);
        BD.inserir(p1);
        BD.inserir(p2);

        BD.relatorio();


    }
}
