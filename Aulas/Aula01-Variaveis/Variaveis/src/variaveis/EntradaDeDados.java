package variaveis;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        System.out.print("Digite o seu nome: ");
        nome = entrada.nextLine();
        System.out.print("Você digitou: " + nome);

        int nota;
        System.out.print("Digite a nota: ");
        nota = entrada.nextInt();
        System.out.println("A sua nota foi: " + nota);

        double raio;
        System.out.print("Digite a raio: ");
        raio = entrada.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;
        System.out.println("A área é igual a " + area);
        System.out.println("O perimetro é igual a " + perimetro);




        entrada.close();
    }
}
