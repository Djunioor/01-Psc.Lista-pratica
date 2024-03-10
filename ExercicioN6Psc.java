import java.util.Scanner;

public class ExercicioN6Psc {
  
    public static void main(String[] args) throws Exception {

        String nome;
        int idade;
        int diasVividos;
        int diasAno; 
        Scanner leitor = new Scanner(System.in);
       
        System.out.println("Digite seu nome: ");
        nome = leitor.next();
        
        System.out.println("Informe sua idade: ");
        idade = leitor.nextInt();

        diasAno = 365; 
        diasVividos = idade * diasAno;

        System.out.println("Voce viveu: " + diasVividos +  " Dias");

          }
         }
        
        
        
