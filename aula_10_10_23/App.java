public class App {
    public static void main(String[] args) throws Exception {
        Conta contaJoao = new Conta("123-4", 100.0);
        Conta contaPaula = new Conta("456-7", 150.0);
        Conta contaPedro = new Conta("890-1", 50.0);

        Repositorio BD = new Repositorio();
        BD.inserir(contaJoao);
        BD.inserir(contaPaula);
        BD.inserir(contaPedro);
        BD.remover(contaPaula);
        BD.relatorio();


    }
}
