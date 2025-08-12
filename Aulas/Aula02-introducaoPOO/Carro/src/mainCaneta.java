import entidades.Caneta;

import java.util.Scanner;

public class mainCaneta {
    public static void main(String[] args) {
        Caneta canetaVerde = new Caneta();

        canetaVerde.cor = "Verde";
        canetaVerde.marca = "Pilot";
        canetaVerde.ponta = "Media";
        canetaVerde.recarregavel = true;

        Caneta canetapreta = new Caneta();
        canetapreta.cor = "Preta";
        canetapreta.marca = "Pilot";
        canetapreta.ponta = "Media";
        canetapreta.recarregavel = true;

        canetaVerde.close();

    }
}
