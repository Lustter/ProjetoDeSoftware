import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Roupa> estoqueTotal = new ArrayList<>();
        int opcao = -1;

        while (opcao != 0) {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    registrarNovaRoupa(scanner, estoqueTotal);
                    break;
                case 2:
                    alterarEstoque(scanner, estoqueTotal);
                    break;
                case 3:
                    listarTodasAsRoupas(estoqueTotal);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("\n--- MENU DA LOJA DE ROUPAS ---");
        System.out.println("1. Registrar nova roupa");
        System.out.println("2. Adicionar/Remover peças do estoque");
        System.out.println("3. Listar todas as roupas");
        System.out.println("0. Sair");
    }

    public static void registrarNovaRoupa(Scanner scanner, ArrayList<Roupa> estoque) {
        System.out.println("\n--- Registro de Nova Roupa ---");
        System.out.print("Digite a marca: ");
        String marca = scanner.nextLine();
        System.out.print("Digite o tipo (camisa, calça, etc.): ");
        String tipo = scanner.nextLine();
        System.out.print("Digite o tamanho (P, M, G): ");
        String tamanho = scanner.nextLine();
        System.out.print("Digite a quantidade inicial: ");
        int quantidade = scanner.nextInt();
        System.out.print("Digite o valor unitário: R$ ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        Roupa novaRoupa = new Roupa(marca, tipo, tamanho, quantidade, valor);
        estoque.add(novaRoupa);

        System.out.println("Roupa registrada com sucesso!");
    }

    public static void alterarEstoque(Scanner scanner, ArrayList<Roupa> estoque) {
        System.out.println("\n--- Alterar Estoque ---");
        listarTodasAsRoupas(estoque);

        if (estoque.isEmpty()) {
            return;
        }

        System.out.print("Digite o número da roupa que deseja alterar: ");
        int indice = scanner.nextInt() - 1;

        if (indice < 0 || indice >= estoque.size()) {
            System.out.println("Número inválido.");
            return;
        }

        Roupa roupaSelecionada = estoque.get(indice);

        System.out.print("Digite (1) para ADICIONAR ou (2) para REMOVER peças: ");
        int acao = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        if (acao == 1) {
            roupaSelecionada.adicionarEstoque(quantidade);
            System.out.println("Peças adicionadas com sucesso!");
        } else if (acao == 2) {
            boolean sucesso = roupaSelecionada.removerEstoque(quantidade);
            if (sucesso) {
                System.out.println("Peças removidas com sucesso!");
            } else {
                System.out.println("Remoção não realizada. Estoque insuficiente ou quantidade inválida.");
            }
        } else {
            System.out.println("Ação inválida.");
        }
        System.out.println("Info atualizada: " + roupaSelecionada.toString());
    }

    public static void listarTodasAsRoupas(ArrayList<Roupa> estoque) {
        System.out.println("\n--- Lista de Roupas em Estoque ---");
        if (estoque.isEmpty()) {
            System.out.println("Nenhuma roupa registrada ainda.");
        } else {
            for (int i = 0; i < estoque.size(); i++) {
                System.out.println((i + 1) + ". " + estoque.get(i).toString());
                System.out.println();
            }
        }
    }
}