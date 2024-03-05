import java.util.Scanner;


public class Exercicio2 {

    public static void main(String[] args) {
        int numero1;
        int numero2;
        int resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe um numero: ");
        numero1 = entrada.nextInt();
        System.out.println ("Informe o segundo numero: ");
        numero2 = entrada.nextInt();
        resultado = numero1 / numero2;
        System.out.println ("A divisão dos dois numeros é: " + resultado);
                
        }
    }
   
