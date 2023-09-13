public class Curso {
    private int codigo;
    private String nome;

    public Curso(int codigo, String n){
        this.codigo = codigo;
        nome = n;
    }

    public void imprimir(){
        System.out.println("Codigo do curso: " + codigo);
        System.out.println("Nome do curso: " + nome);
    }

}
