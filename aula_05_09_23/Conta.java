public class Conta {
    private String numero_conta;
    private double saldo;

    public void setNumero_conta(String numero){
        numero_conta = numero;
    }

    public String getNumero_conta(){
        return numero_conta;
    }

    public void creditar(double valor){
        saldo = saldo + valor;
    }

    public void debitar(double valor){
        if(saldo >= valor){
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }

    }



    public void imprimir(){
        System.out.println("-----------");
        System.out.println("Numero da conta: " + numero_conta);
        System.out.println("Saldo: " + saldo);
    }





}
