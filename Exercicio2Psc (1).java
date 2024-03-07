import java.util.Scanner;

public class Exercicio2Psc {
    public static void main(String[] args) throws Exception {
        int numero1;
        int numero2;
        int resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Informe o segundo numero: ");
        numero2 = entrada.nextInt();
        resultado = numero1 / numero2; 
        System.out.println("A Divisão dos numero é: " + resultado);
        
         }
  }