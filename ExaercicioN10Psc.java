import java.util.Scanner;

public class ExaercicioN10Psc {


    public static void main(String[] args ) {
        
        double fahrenheit;
        double celsius;
        Scanner leitor = new Scanner(System.in);
       
        System.out.println("Informe a temperatura em Fahrenheit: ");
        fahrenheit = leitor.nextDouble();
        
        celsius = (fahrenheit - 32) * 5/9;

        System.out.println("A temperatura em celsius é: " + celsius);



    }
 }   