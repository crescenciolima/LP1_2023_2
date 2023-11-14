public public class App_2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicio do programa");
        metodo1();
        System.out.println("Final do programa");
    }

    public static void metodo1(){
        System.out.println("Inicio do metodo 1");
        try{
        metodo2();
        } catch(Exception e){
            System.out.println("Erro encontrado: " + e);
        } 
        System.out.println("Fim do metodo 1");
    }

    public static void metodo2(){
        System.out.println("Inicio do metodo 2");
        int [] matriz = new int[10];
        for(int i = 0; i < 15; i++){
            matriz[i] = i;
            System.out.println(i);
        }
        System.out.println("Fim do metodo 2");
    }
}
