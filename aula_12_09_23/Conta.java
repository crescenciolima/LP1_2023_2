public class Conta {
    private String numeroConta;
    private double saldo;

    public Conta(String nc, double s){
        numeroConta = nc;
        saldo = s;
    }

    public Conta(String nc){
        numeroConta = nc;
        saldo = 0.0;
    }

    public void creditar(double valor){
        saldo += valor;
    }

    public void debitar(double valor){
        if(saldo >= valor){
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void imprimir(){
        System.out.println("Numero conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);

    }

}
