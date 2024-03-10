import java.util.Scanner; 

public class ExercicioN7Psc {

    public static void main(String[] args ) { 
       
        String nome;
        double salario;
        int porcentagem;
        int valorTpor;
        double valorReajustado;
        Scanner leitor = new Scanner(System.in);
        leitor.useDelimiter("[\r\n]+" );

       
        System.out.println("Infome seu nome Completo: ");
        nome = leitor.next();

        System.out.println("Informe seu salario: ");
        salario = leitor.nextDouble();

        porcentagem = 7;
        valorTpor = 100;
        valorReajustado = porcentagem * salario / valorTpor;

        System.out.println("O reajuste anual do salario do funcionario é: " + valorReajustado);


    }
 }