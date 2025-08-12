//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //gasto janeiro
        double aguaJan = 100;
        double eletricaJan = 200;
        double alimentacaoJan = 300;

        //gasto fevereiro
        double aguaFev = 200;
        double eletricaFev = 300;
        double alimentacaoFev = 400;

        //soma de gastos janeiro
        double gastoTotalJan = aguaJan + eletricaJan + alimentacaoJan;

        //soma gastos fevereiro
        double gastoTotalFev = aguaFev + eletricaFev + alimentacaoFev;

        if (gastoTotalFev > gastoTotalJan) {
            System.out.println("Gasto total de fevereiro foi maior");
        } else if (gastoTotalFev < gastoTotalJan) {
            System.out.println("Gasto total de janeiro foi menor");
        } else {
            System.out.println("Ambos os meses tiveram o mesmo gasto");
        }

    }
}