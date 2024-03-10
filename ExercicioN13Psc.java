import java.util.Scanner;

public class ExercicioN13Psc {

    public static void main(String[] args ) { 
        
        float valorHora;
        float horasTraMes;
        float salariobruto;
        float salarioLiquido;
        float inss;
        float descontoInss;

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o valor por hora recebido: ");
        valorHora = leitor.nextFloat();

        System.out.println("Horas trabalhadas no mes: ");
        horasTraMes = leitor.nextFloat();

        System.out.println("Porcentagem de desconto do INSS: "); 
        inss = leitor.nextFloat();
        
        salariobruto = valorHora * 8 *30;
        descontoInss = salariobruto * inss / 100; 
        salarioLiquido = salariobruto - descontoInss;
        

        System.out.println("Salario liquido: " + salarioLiquido);
       
     }

}
