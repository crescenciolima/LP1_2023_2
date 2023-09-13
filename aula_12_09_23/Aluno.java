public class Aluno {
    private String nome;
    private int idade;
    private String cpf;
    private Curso cursoAluno;

    public Aluno(String n, int i, String c, Curso ca){
        nome = n;
        idade = i;
        cpf = c;
        cursoAluno = ca;
    }

    public void imprimir(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        cursoAluno.imprimir();
    }
}





