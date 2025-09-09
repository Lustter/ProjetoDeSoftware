import entidades.Pagamento;
import entidades.PagamentoBoleto;
import entidades.PagamentoCartao;
import entidades.PagamentoPix;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pagamento> pagamentos = new ArrayList<>();

        while (true) {

            System.out.println("1 - Cadastro de pagamentos");
            System.out.println("2 - Listar pagamentos");
            System.out.println("3 - Sair");

            String opcao = sc.nextLine();

            if (opcao.equals("1")) {
                System.out.println("Digite seu nome: ");
                String nome = sc.nextLine();

                System.out.println("Digite a data de pagamento: ");
                String dataPagamento = sc.nextLine();

                System.out.println("Digite o valor da pagamento: ");
                double valorPagamento = sc.nextDouble();
                sc.nextLine();

                System.out.println("INFORME O MÉTODO DE PAGAMENTO!");
                System.out.println("1 - BOLETO");
                System.out.println("2 - PIX");
                System.out.println("3 - CRÉDITO");
                int metodoPagamento = sc.nextInt();
                sc.nextLine();


                Pagamento pagamento = null;
                switch (metodoPagamento) {
                    case 1:
                        System.out.println("Digite o Código de Barras: ");
                        String codigoBarras = sc.nextLine();
                        pagamento = new PagamentoBoleto(nome, valorPagamento, dataPagamento, codigoBarras);
                        break;

                    case 2:
                        System.out.println("Digite a chave PIX: ");
                        String chavePix = sc.nextLine();
                        pagamento = new PagamentoPix(nome, valorPagamento, dataPagamento, chavePix);
                        break;

                    case 3:
                        System.out.println("Digite o numero do cartao: ");
                        String numeroCartao = sc.nextLine();
                        pagamento = new PagamentoCartao(nome, valorPagamento, dataPagamento, numeroCartao);
                        break;

                    default:
                        System.out.println("Opção invalida!");
                        continue;
                }
                pagamentos.add(pagamento);



            } else if (opcao.equals("2")) {
                System.out.println("\nLista de pagamentos!");
                for (Pagamento pagamento : pagamentos) {
                    System.out.println(pagamento.toString());
                    //System.out.println("Clinte: " + pagamento.getNomeCliente() + " " + "|" +
                    //        "| Valor: " + pagamento.getValorPagamento() + " " + "|" +
                    //        "| Data de Pagamento: " + pagamento.getDataPagamento() + " " + "|" +
                    //        "| Tipo: " + pagamento.getClass().getSimpleName());
                }
            } else if (opcao.equals("3")) {
                break;
            }



        }











    }
}