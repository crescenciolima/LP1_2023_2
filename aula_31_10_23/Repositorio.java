public class Repositorio {
    private ContaAbstrata [] BD;
    private int indice;

    public Repositorio(){
        BD = new ContaAbstrata[5];
        indice = 0;
    }

    public void inserir(ContaAbstrata ca){
        BD[indice] = ca;
        indice++;
    }

    public void remover(ContaAbstrata ca){
        for(int i = 0; i < indice; i++){
            if(BD[i] == ca){
                BD[i] = BD[indice-1];
                BD[indice-1] = null;
                indice--;
            }
        }
    }

    public void printALL(){
        for(int i = 0; i < indice; i++){
            BD[i].imprimir();
        }
    }

}
