import java.util.Scanner;

public class ExercicioN5Psc {
    
    public static void main(String[] args) throws Exception {
        double valorReal;
        double valorDolar;
        double cotacaoDolar;
        Scanner leitor = new Scanner(System.in);
        
       System.out.println("Conversor de dolar para real \n");

       System.out.println("Informe a cotação do dolar: ");
       cotacaoDolar = leitor.nextDouble();

       System.out.println("Digite um valor em dolar: ");
       valorDolar = leitor.nextDouble();
        
       valorReal = cotacaoDolar * valorDolar;
       System.out.println("O valor em reais sera: " + valorReal);
   }
}