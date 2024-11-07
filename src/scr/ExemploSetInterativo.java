package scr;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploSetInterativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> frutas = new HashSet<>();

        while (true) {
        	try {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar uma fruta");
            System.out.println("2. Listar todas as frutas");
            System.out.println("3. Remover uma fruta");
            System.out.println("4. Verificar se uma fruta está presente");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da fruta para adicionar: ");
                    String novaFruta = scanner.nextLine();
                    if (frutas.add(novaFruta)) {
                        System.out.println(novaFruta + " foi adicionada.");
                    } else {
                        System.out.println(novaFruta + " já está presente no conjunto.");
                    }
                    break;
                case 2:
                    System.out.println("Frutas: " + frutas);
                    break;
                case 3:
                    System.out.print("Digite o nome da fruta que deseja remover: ");
                    String frutaRemover = scanner.nextLine();
                    if (frutas.remove(frutaRemover)) {
                        System.out.println(frutaRemover + " foi removida.");
                    } else {
                        System.out.println(frutaRemover + " não foi encontrada.");
                    }
                    break;
                case 4:
                	System.out.println("Digite o nome da fruta para verificar: ");
                	String frutaVerificar = scanner.nextLine();
                	if(frutas.contains(frutaVerificar)) {
                		System.out.println(frutaVerificar + " não foi encontrada no conjunto. ");
                	}else {
                		System.out.println(frutaVerificar + "não foi encontrada no conjunto.");
                	}
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        catch (InputMismatchException e) {
        	System.out.println("Entrada inválida. Por favor, digite um número. ");
        	scanner.nextLine();//limpa a entrada do scanner
        }
    }
    }
}
   
