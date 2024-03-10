import java.util.Scanner;

public class ExercicioN11Psc {

    public static void main(String[] args) { 
        
        float nota1;
        float nota2;
        float nota3;
        float media;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = leitor.nextFloat();

        System.out.println("Digite o segundo nota: ");
        nota2 = leitor.nextFloat();

        System.out.println("Digite o terceira nota: ");
        nota3 = leitor.nextFloat();

        media = nota1 + nota2 + nota3 / 3;

        System.out.println("A media das notas do aluno é: " + media);

    }
}