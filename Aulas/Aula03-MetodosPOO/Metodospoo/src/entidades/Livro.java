package entidades;

public class Livro{
    public String titulo;
    public String autor;
    public int quantidade;
    public double valor;

    public Livro(String titulo, String autor, int quantidade, double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void emprestarLivro(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade = this.quantidade - quantidade;
        } else {
            System.out.println("Quantidade indisponivel ou quantidade inválida");
        }
    }


    @Override
    public String toString() {
        return "Livro:" +
                " titulo: " + titulo +
                "\n       autor: " + autor +
                "\n       quantidade: " + quantidade +
                "\n       valor: R$" + valor;
    }
}
