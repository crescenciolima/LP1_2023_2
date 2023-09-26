public class Hospedagem {
    private int codigo;
    private Data dataEntrada;
    private Data dataSaida;
    private Hospede hospede;
    private int aposento;

    public Hospedagem(int c, Data dE, Data dS, Hospede h, int apos){
        codigo = c;
        dataEntrada = dE;
        dataSaida = dS;
        hospede = h;
        aposento = apos;
    }

    public void relatorio(){
        System.out.println("Código: " + codigo);
        System.out.print("Data de entrada: ");
        System.out.println();
        dataEntrada.imprimir_data();
        System.out.print("Data de saída: ");
        System.out.println();
        dataSaida.imprimir_data();
        System.out.print("Hóspede: ");
        hospede.imprimir_Hospede();
        System.out.println();
        System.out.println("Aposento: " + aposento);
    }
}
