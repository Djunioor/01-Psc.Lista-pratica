import java.util.Scanner;

public class ExercicioN17Psc {

    public static void main(String[] args) { 

        float n;
        float z;
        float y;
        float totalPago;
        float custoCaneta;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o numero de canetas compradas: ");
        n = leitor.nextFloat();

        System.out.println("Qual foi o valor da nota paga: ");
        z = leitor.nextFloat();

        System.out.println("Qual foi o troco recebido: ");
        y = leitor.nextFloat();

        totalPago = z - y;
        custoCaneta = totalPago / n;

        System.out.println("O valor de cada caneta é: " + custoCaneta);

         }
 }