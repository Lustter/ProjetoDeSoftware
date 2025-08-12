package Conta;

public class MainConta {
    public static void main(String[] args) {
        ContaMes janeiro = new ContaMes();
        ContaMes fevereiro = new ContaMes();

        //gastos janeiro
        janeiro.agua = 500;
        janeiro.luz = 200;
        janeiro.alimentacao = 200;

        //gastos fevereiro
        fevereiro.agua = 500;
        fevereiro.luz = 200;
        fevereiro.alimentacao = 200;

        //soma de gastos
        double gastoTotalJan = janeiro.somaConta();
        double gastoTotalFev = fevereiro.somaConta();

        if (gastoTotalFev > gastoTotalJan) {
            System.out.println("Gasto total de fevereiro foi maior");
        } else if (gastoTotalFev < gastoTotalJan) {
            System.out.println("Gasto total de janeiro foi menor");
        } else {
            System.out.println("Ambos os meses tiveram o mesmo gasto");
        }

    }
}
