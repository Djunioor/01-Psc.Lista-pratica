import java.util.Scanner;

public class ExercicoN16Psc {
   
    public static void main(String[] args ) { 
        
        float totalKm;
        float combustivelL;
        float gasolinaL;
        float autonomiaL;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Infome a distante a ser percorrida: ");
        totalKm = leitor.nextFloat();

        System.out.println("Informe o valor de gasolina por L: ");
        gasolinaL = leitor.nextFloat();

        System.out.println("Informe a automia do veiculo por L: ");
        autonomiaL = leitor.nextFloat();

        totalKm = gasolinaL / autonomiaL;

        System.out.println("O valor medio gasto por kilometros rodados é: " + totalKm);

    
    }
 }