package exercicios;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class desafios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        desafio01(scanner);
        desafio02(scanner);
        desafio03(scanner);
        desafio04(scanner);
        desafio05(scanner);

        scanner.close();
    }

    public static void desafio01(Scanner scanner) {
        System.out.println("--- Desafio 01: Conversão de Temperatura ---");
        System.out.print("Digite a temperatura em graus Celsius (°C): ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("A temperatura em Fahrenheit é: %.2f °F\n", fahrenheit);
        System.out.printf("A temperatura em Kelvin é: %.2f K\n\n", kelvin);
    }

    public static void desafio02(Scanner scanner) {
        System.out.println("--- Desafio 02: Calculando Juros Compostos ---");
        System.out.print("Digite o capital inicial (C): R$ ");
        double capitalInicial = scanner.nextDouble();

        System.out.print("Digite a taxa de juros (% ao mês): ");
        double taxaDeJurosPercentual = scanner.nextDouble();

        System.out.print("Digite o tempo (em meses): ");
        int tempo = scanner.nextInt();

        double taxaDeJurosDecimal = taxaDeJurosPercentual / 100.0;
        double montante = capitalInicial * Math.pow(1 + taxaDeJurosDecimal, tempo);

        System.out.printf("O montante final após %d meses será de: R$ %.2f\n\n", tempo, montante);
    }

    public static void desafio03(Scanner scanner) {
        System.out.println("--- Desafio 03: Média de Aluno ---");
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3.0;

        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("A média final do aluno é " + df.format(media) + "\n");
    }

    public static void desafio04(Scanner scanner) {
        System.out.println("--- Desafio 04: Calculadora de Juros Simples ---");
        System.out.print("Digite o capital inicial (C): R$ ");
        double capital = scanner.nextDouble();

        System.out.print("Digite a taxa de juros mensal (%): ");
        double taxaJurosPercentual = scanner.nextDouble();

        System.out.print("Digite o tempo (em meses): ");
        int tempoMeses = scanner.nextInt();

        double taxaJurosDecimal = taxaJurosPercentual / 100.0;
        double juros = capital * taxaJurosDecimal * tempoMeses;
        double montanteTotal = capital + juros;

        System.out.printf("O valor dos juros simples é: R$ %.2f\n", juros);
        System.out.printf("O montante total ao final do período é: R$ %.2f\n\n", montanteTotal);
    }

    public static void desafio05(Scanner scanner) {
        System.out.println("--- Desafio 05: Área e Perímetro de um Círculo ---");
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;

        System.out.printf("A área do círculo é: %.2f\n", area);
        System.out.printf("O perímetro do círculo é: %.2f\n", perimetro);
    }
}