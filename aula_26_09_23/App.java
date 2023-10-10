public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta("123-4", 100.0);
        Conta c2 = new Conta("456-7", 50.0);
        Conta c3 = new Conta("999-9", 20.0);

        Cliente cli1 = new Cliente("Bob", "333-3", c1);
        Cliente cli2 = new Cliente("John", "111-1", c2);
        Cliente cli3 = new Cliente("Mary", "888-8", c3);

        Conta [] BD = new Conta[3];
        BD[0] = c1;
        BD[1] = c2;
        BD[2] = c3;

        c1.creditar(10.0);
        BD[0].creditar(10.0);
        BD[1].debitar(30.0); //mesma coisa que c2.debitar(30.0);

    /*  for(int i = 0; i < BD.length; i++){
            BD[i].imprimir();
        }
        */

        cli1.imprimir();

    }
}
