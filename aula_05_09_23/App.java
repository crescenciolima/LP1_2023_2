public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta();
        c1.creditar(100.0);

        Conta c2 = new Conta();

        c1.setNumero_conta("123-x");
        c2.setNumero_conta("555-5");

        System.out.println(c1.getNumero_conta());
        System.out.println(c2.getNumero_conta());

        c1.debitar(50.0);
        c2.debitar(1.0);

        c1.imprimir();
        c2.imprimir();
        
        Livro l1 = new Livro();
        l1.setInfo("got",2001,"Martin","Pinoquio");
        l1.imprimir();
        //noite noite rapazeada <3

    }
}
