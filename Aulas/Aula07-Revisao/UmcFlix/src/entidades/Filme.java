package entidades;

public class Filme extends Catalogo {

    private int duracao;


    public Filme(String protagonista, Genero genero, String nomeFilme, String diretor, int classificacao, int duracao) {
        super(protagonista, genero, nomeFilme, diretor, classificacao);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "\nDuracao: " + duracao;
    }
}
