import entidades.Carro;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro corolla = new Carro();

        System.out.println("Digite a marca do carro: ");
        corolla.marca =  sc.nextLine();

        System.out.println("Digite o modelo do carro: ");
        corolla.modelo = sc.nextLine();

        System.out.println("Digite a cor do carro: ");
        corolla.cor = sc.nextLine();

        System.out.println("Digite o ano do carro: ");
        corolla.ano = sc.nextInt();

        System.out.println("Digite true se ele for eletrico: ");
        corolla.eletrico = sc.nextBoolean();

        corolla.exibeInformacoes();

        sc.close();

    }
}
