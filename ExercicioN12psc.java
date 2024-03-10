import java.util.Scanner;

public class ExercicioN12psc {

    public static void main(String[] args ) { 
    
    int numero;
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite um numero: ");
    numero = leitor.nextInt();

    System.out.println("Numero inserido: " + numero);
    System.out.println("O seu sucessor é: "+ (+numero+1));
    System.out.println("O seu antesessor é: "+ (+numero-1));

 }
}