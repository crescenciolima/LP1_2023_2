public abstract class ContaAbstrata {
    protected String numero;
    protected double saldo;

    public ContaAbstrata(String n, double saldo){
        this.numero = n;
        this.saldo = saldo;
    }

    public void creditar(double valor){
        saldo += valor;
    }

    public abstract void debitar(double valor);

    public void imprimir(){
        System.out.println("--------");
        System.out.println("Numero da Conta: " + numero);
        System.out.println("Saldo: " + saldo);
    }

}
