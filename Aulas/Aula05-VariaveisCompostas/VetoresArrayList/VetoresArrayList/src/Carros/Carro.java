package Carros;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro: " +
                "\nmarca = " + marca +
                "\nmodelo = " + modelo +
                "\nano = " + ano ;
    }
}
