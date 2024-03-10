import java.util.Scanner;

public class ExercicioN9Psc {


    public static void main(String[] args ) {
        
        double raio;
        double area;
        Scanner leitor = new Scanner(System.in);
         
        System.out.println("Informe o raio do circulo: ");
        raio = leitor.nextDouble();

        area = Math.PI * Math.pow(raio, 2);

        System.out.println("A area do circulo e: "  + area);
    }
 }