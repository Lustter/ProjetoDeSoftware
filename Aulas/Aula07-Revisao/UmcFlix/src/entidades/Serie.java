package entidades;

public class Serie extends Catalogo{

    private int temps;
    private int eps;

    public Serie(String protagonista, Genero genero, String nomeFilme, String diretor, int classificacao, int temps, int eps) {
        super(protagonista, genero, nomeFilme, diretor, classificacao);
        this.temps = temps;
        this.eps = eps;
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

    public int getEps() {
        return eps;
    }

    public void setEps(int eps) {
        this.eps = eps;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                        "\nTemporadas: " + temps +
                        "\nEpisódios" + eps;
    }
}
