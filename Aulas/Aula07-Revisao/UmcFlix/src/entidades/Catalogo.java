package entidades;

public class Catalogo {

    private String protagonista;
    private Genero genero;
    private String nomeFilme;
    private String diretor;
    private int classificacao;

    public Catalogo(String protagonista, Genero genero, String nomeFilme, String diretor, int classificacao) {
        this.protagonista = protagonista;
        this.genero = genero;
        this.nomeFilme = nomeFilme;
        this.diretor = diretor;
        while (true) {
            if (classificacao >= 0 && classificacao <= 5) {
                this.classificacao = classificacao;
                break;
            } else {
                System.out.println("classificacao invalida");
            }
        }
    }

    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        while (true) {
            System.out.println("Digite uma classificacao de 1 a 5");
            if (classificacao >= 0 && classificacao <= 5) {
                this.classificacao = classificacao;
                break;
            } else {
                System.out.println("classificacao invalida");
            }
        }
    }

    @Override
    public String toString() {
        return
                "\nFilme: " + nomeFilme +
                "\nGênero: " + genero +
                "\nDiretor: " + diretor +
                "\nClassificacao: " + classificacao +
                "\nProtagonista: " + protagonista;
    }
}
