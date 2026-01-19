import java.util.ArrayList;
import java.util.Scanner;

// Modelo do dado (fora da classe principal)
class Item {
    String nome;
    int qtd;

    Item(String n, int q) {
        this.nome = n;
        this.qtd = q;
    }
}

// Classe principal (tem que ser Teste porque o arquivo é Teste.java)
public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Item> lista = new ArrayList<>();

        System.out.println("--- SISTEMA DE COMPRAS ---");
        System.out.print("Quantos produtos quer cadastrar? ");
        
        // Evita erro se o usuario nao digitar numero
        int total = scan.nextInt();

        for (int i = 0; i < total; i++) {
            System.out.println("\nProduto " + (i + 1));
            System.out.print("Nome: ");
            String nomeDigitado = scan.next();

            System.out.print("Quantidade: ");
            int qtdDigitada = scan.nextInt();

            // Adiciona o novo objeto na lista
            lista.add(new Item(nomeDigitado, qtdDigitada));
        }

        System.out.println("\n--- RELATORIO DE ESTOQUE ---");
        for (Item it : lista) {
            System.out.println("Item: " + it.nome + " | Qtd: " + it.qtd);
        }

        System.out.println("\nFim do programa.");

         // Bloco para remover um item
        System.out.println("\nDeseja remover algum item? (1 para sim / 0 para nao)");
        int opcao = scan.nextInt();

        if (opcao == 1) {
            System.out.print("Digite o indice (0, 1, 2...) do item: ");
            int id = scan.nextInt();

            if (id < lista.size()) {
                lista.remove(id);
                System.out.println("Item removido com sucesso!");
            } else {
                System.out.println("Indice invalido!");
            }
        }

        // Mostra a lista final atualizada
        System.out.println("\n--- LISTA FINAL ATUALIZADA ---");
        for (Item it : lista) {
            System.out.println("Item: " + it.nome + " | Qtd: " + it.qtd);
        }

        scan.close();
    }
}