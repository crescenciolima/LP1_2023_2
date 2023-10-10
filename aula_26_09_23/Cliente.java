public class Cliente {
    private String nome;
    private String cpf;
    private Conta c;

    public Cliente(String n, String cpf, Conta c){
        nome = n;
        this.cpf = cpf;
        this.c = c;
    }

    public void imprimir(){
        System.out.println("Nome do cliente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Numero da conta: " + c.getNumero());
    }
}
