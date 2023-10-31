public class Poupanca extends Conta {
    private int idade;

    public Poupanca(String n, double s, int i){
        super(n, s);
        idade = i;
    }

    public void renderJuros(double taxa){
        saldo += (saldo*taxa);
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Idade: " + idade);
    }

}
