import entidades.Livro;

public class Main {
    public static void main(String[] args) {

        Livro harryPotter = new Livro("Harry Potter", "J. K. Rowling",5, 50);
        Livro naruto = new Livro("Naruto", "Masashi Kishimoto");
        naruto.valor = 50;

        harryPotter.emprestarLivro(1);
        naruto.emprestarLivro(1);

        naruto.recebeLivro(18);




        System.out.println(naruto.toString());
        System.out.println(harryPotter.toString());

    }
}