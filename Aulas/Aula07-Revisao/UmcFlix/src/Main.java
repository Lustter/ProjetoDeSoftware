import entidades.Catalogo;
import entidades.Filme;
import entidades.Genero;
import entidades.Serie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Catalogo> catalogo = new ArrayList();

        System.out.println("OQUE DESEJA FAZER");
        System.out.println("1 - ADICIONAR UM FILME");
        System.out.println("2 - ADICIONAR UMA SÉRIE");
        System.out.println("3 - LISTAR FILME/SÉRIES NO CATALOGO");
        int opcao = sc.nextInt();


        System.out.println("Informe o nome do filme/série: ");
        String nomeFilme = sc.nextLine();
        System.out.println("Informe o Gênero: ");
        Genero genero = Genero.valueOf(sc.nextLine());
        System.out.println("Informe o diretor: ");
        String diretor = sc.nextLine();
        System.out.println("Informe a Classificação: ");
        int classificacao = sc.nextInt();
        System.out.println("Informe o protagonista: ");
        String protagonista = sc.nextLine();

        if (opcao == 1) {
            System.out.println("Informe a duração do filme: ");
            int duracao = sc.nextInt();
            Filme filme = new Filme(protagonista, genero, nomeFilme, diretor, classificacao, duracao);
            catalogo.add(filme);
        } else if (opcao == 2) {
            System.out.println("Informe quantas temporadas a série possui: ");
            int temps = sc.nextInt();
            System.out.println("Informe quantos episódios a série possui: ");
            int eps = sc.nextInt();
            Serie serie = new Serie(protagonista, genero, nomeFilme, diretor, classificacao, temps, eps);
            catalogo.add(serie);
        } else if (opcao == 3) {
            System.out.println("Catalogo!");
            for (Catalogo catalogo1 : catalogo) {
                System.out.println(catalogo1.toString());
            }
        }


        sc.close();
    }
}