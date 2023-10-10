public class Repositorio {
    private Conta [] BD;
    private int indice;
    private static final int MAX = 5;

    public Repositorio(){
        BD = new Conta[MAX];
        indice = 0;
    }

    public void inserir(Conta c){
        BD[indice] = c;
        indice++;
    }

    public void remover(Conta c){
        for(int i = 0; i < indice; i++){
            if(BD[i] == c){
                BD[i] = BD[indice-1];
                BD[indice-1] = null;
                indice--;
            } 
        }
    }

    public void relatorio(){
        for(int i = 0; i < indice; i++){
            BD[i].imprimir();
        }
    }

}
