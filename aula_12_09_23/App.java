public class App {
    public static void main(String[] args) throws Exception {
        
        Conta c1 = new Conta("123-4", 100.0);
        c1.imprimir();

        Conta c2 = new Conta("456-7");
        c2.creditar(100);
        c2.debitar(200);
        c2.imprimir();
        
        Curso BSI = new Curso(123, "Sistemas de Informação");
        BSI.imprimir();

        Aluno a1 = new Aluno("Joana", 21, "123-4", BSI);
        a1.imprimir();

    }
}