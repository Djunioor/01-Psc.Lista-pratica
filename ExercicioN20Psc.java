import java.util.Scanner;

public class ExercicioN20Psc {

    public static void main(String[] args) { 

       int peca1;
       int peca2;
       int peca3;
       int quantidadePecas1;
       int quantidadePecas2;
       double valorPeca1;
       double valorPeca2;
       double valorPeca3;
        double porcenIpi;
        double valorTotal1;
        double valorTotal2;
        double valorTotalProdutos;
        double valorIpi;
        Scanner leitor = new Scanner(System.in);

        System.out.println("informe a porcentagem  do IPI: ");
        porcenIpi = leitor.nextDouble();

        System.out.println("Informe o codigo da peça 1: ");
        peca1 = leitor.nextInt();
        System.out.println("informe o valor da peça 1: ");
        valorPeca1 = leitor.nextInt();
        System.out.println("informe a quantidade de peças: ");
        quantidadePecas1 = leitor.nextInt();

        System.out.println("Informe o codigo da peça 2: ");
        peca2 = leitor.nextInt();
        System.out.println("informe o valor da peça 2: ");
        valorPeca2 = leitor.nextDouble();
        System.out.println("informe a quantidade de peças: ");
        quantidadePecas2 = leitor.nextInt();

        valorTotal1 = valorPeca1 * quantidadePecas1;
        valorTotal2 = valorPeca2 * quantidadePecas2;
        valorIpi = (porcenIpi / 100) * valorTotalProdutos; 
        valorTotalProdutos = valorTotal1 + valorTotal2;
        valorfinal = valorTotalProdutos + valorIpi;
        
        System.out.println("O valor total da compra: " + valorTotalProdutos);

         }
 }
