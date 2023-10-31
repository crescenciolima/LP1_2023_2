public class Repositorio {
    private Conta [] BD;
    private int indice;

    public Repositorio(){
        BD = new Conta[5];
        indice = 0;
    }

    public void inserir(Conta c){
        BD[indice] = c;
        indice++;
    }

    public void relatorio(){
        for(int i = 0; i < indice; i++){
            BD[i].imprimir();
        }
    }


}
