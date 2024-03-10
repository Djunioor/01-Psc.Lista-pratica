import java.util.Scanner;

public class ExercicioN14Psc {

    public static void main(String[] args ) { 

        int variavelA;
        int variavelB;
        int trocaA;
        int trocaB;
        java.util.Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
        variavelA = leitor.nextInt();

        System.out.println("Informe o segundo numero: ");
        variavelB = leitor.nextInt();

        trocaA = variavelB;
        trocaB = variavelA;

        System.out.println("O valor de A é: " + trocaA + "\nO valor de B é: " + trocaB);
    }
 }