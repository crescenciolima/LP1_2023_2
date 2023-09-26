public class Data {
    private int dia;
    private String mes;
    private int ano;

    public Data(int dia, String mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void imprimir_data(){
        System.out.println("Dia: " + dia);
        System.out.println("Mes: " + mes);
        System.out.println("Ano: " + ano);
        System.out.println("------");
    }
    
}
