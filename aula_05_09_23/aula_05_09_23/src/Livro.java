public class Livro {
    private String Titulo;
    private int Ano;
    private String Autor;
    private String Editora;

    public void setInfo(String T, int a, String A, String E){
        Titulo = T;
        Ano = a;
        Autor = A;
        Editora = E;
    }

    public void imprimir(){
        System.out.println(Titulo);
        System.out.println(Ano);
        System.out.println(Autor);
        System.out.println(Editora);
    }
}
