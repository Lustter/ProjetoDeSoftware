package entidades;

public class Carro {
    public String marca;
    public String modelo;
    public String cor;
    public int ano;
    public boolean eletrico;

    public void exibeInformacoes() {
        System.out.println("Marca: " + marca +
                "\nModelo: " + modelo +
                "\nCor: " + cor +
                "\nAno: " + ano +
                "\nEletrico: " + eletrico);
    }
}
