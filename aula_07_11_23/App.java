public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta("123-4", 10.0);
        try{
            c1.debitar(20.0);
        } catch(SIException erro){
            System.out.println("Erro encontrado: " + erro);
        }


    }

}
