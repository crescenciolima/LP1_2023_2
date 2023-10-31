public class Conta extends ContaAbstrata {
    public Conta(String numero, double saldo){
        super(numero, saldo);
    }

    public void debitar(double valor){
        if(saldo >= valor){
            saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
}
