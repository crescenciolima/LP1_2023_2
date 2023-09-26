public class App {
    public static void main(String[] args) throws Exception {
        Data d1 = new Data(10, "Janeiro", 2024);
        Data d2 = new Data(20, "Janeiro", 2024);

        Hospede h1 = new Hospede(123, "Júlia", "12345678995", "4568592", "77966332211");

        Hospedagem H = new Hospedagem(8585, d1, d2, h1, 89);
        H.relatorio();
        
        
    }
}
