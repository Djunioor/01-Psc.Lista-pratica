import java.util.Scanner;

public class ExercicioN4Psc {

    public static void main(String[] args) throws Exception {
        String nomeCompleto;
        String endereco;
        long telefone;
        Scanner leitor = new Scanner(System.in);
        leitor.useDelimiter("[\r\n]+" );

        System.out.println("Informe seu nome completo: ");
        nomeCompleto = leitor.next();

        System.out.println("Informe seu endereço: ");
        endereco = leitor.next();
         
        System.out.println("Informe seu telefone: ");
        telefone = leitor.nextLong();

        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone para contato: " + telefone);

    
    }
}