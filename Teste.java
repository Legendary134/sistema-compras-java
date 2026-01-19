import java.util.Scanner;

public class Teste {
public static void main(String[] airgs) { 
    Scanner leitor = new Scanner(System.in);

    System.out.println("Qual o seu nome rapariga ? ");
    String nome = leitor.nextLine();
    
    System.out.println("Quantos anos voce tem ? ");
    int idade = leitor.nextInt();

    System.out.println("Quantos custa um Cafe na sua cidade ? ");
    Double precoCafe = leitor.nextDouble();

    System.out.println("\n--- RELATORIO DO " + nome.toUpperCase() + " ---");
    System.out.println("idade " + idade + " anos");
    System.out.println("Preco do cafe: R$ " + precoCafe);

    leitor.close();

}
    
} 