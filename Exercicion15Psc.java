import java.util.Scanner;

public class Exercicion15Psc {

    public static void main(String[] args ) { 
        
        double valorA;
        double valorB;
        double valorC;
        double delta;
        double x1;
        double x2;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        valorA = leitor.nextDouble();

        System.out.println("Diegite o valor de B: ");
        valorB = leitor.nextDouble();

        System.out.println("Digite o valor de C: ");
        valorC = leitor.nextDouble();

        delta = valorB * valorB - 4 * valorA * valorC;

        if (delta >= 0 ) {
            
        x1 = (valorB + Math.sqrt(delta)) / (2*valorA);
        x2 = (valorB - Math.sqrt(delta)) / (2*valorA);
     
        System.out.println("O valor de x1 é: " + x1);
        System.out.println("O valor de x2 é: " + x2);
    }

        else 
        System.out.println("Não e possivel calcular resultado.");
    }
 }