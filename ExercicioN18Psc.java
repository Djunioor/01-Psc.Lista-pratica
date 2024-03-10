import java.util.Scanner;

public class ExercicioN18Psc {

    public static void main(String[] args) { 

        int numDegraus;
        double altDegrau;
        double altTotal;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a altura de cada degrau em metros: ");
        altDegrau = leitor.nextDouble();

        System.out.println("Informe a altura final desejada: ");
        altTotal = leitor.nextDouble();

        numDegraus = (int) Math.ceil(altTotal / altDegrau);
        System.out.println("Voce ira subir: " + numDegraus + " degrais" );

    }
 }