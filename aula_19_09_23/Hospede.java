public class Hospede {
    private int codigo;
    private String nome;
    private String cpf;
    private String rg;
    private String telefone;

    public Hospede(int c, String n, String cpf, String rg, String t) {
        codigo = c;
        nome = n;
        this.cpf = cpf;
        this.rg = rg;
        telefone = t;
    }

    public void imprimir_Hospede() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Telefone: " + telefone);
    }
}
