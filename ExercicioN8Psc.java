import java.util.Scanner;

public class ExercicioN8Psc {
    public static void main(String[] args) { 
       
        float metros;
        float centimetros;
        float valorTotal;
        Scanner leitor = new Scanner(System.in);
       
        System.out.println("Digite um numero em metros: ");
        metros = leitor.nextFloat();

        centimetros = 100;
        valorTotal = metros * centimetros;

        System.out.println("O numero em centimetros é: " + valorTotal);

    }
 }