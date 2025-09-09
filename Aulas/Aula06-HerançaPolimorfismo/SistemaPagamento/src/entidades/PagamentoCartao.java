package entidades;

public class PagamentoCartao extends Pagamento {
    //atributos

    private String NumCartao;

    public PagamentoCartao(String nomeCliente, double valorPagamento, String dataPagamento, String NumCartao) {
        super(nomeCliente, valorPagamento, dataPagamento);
        this.NumCartao = NumCartao;
    }

    public String getNumCartao() {
        return NumCartao;
    }

    public void setNumCartao(String numCartao) {
        NumCartao = numCartao;
    }

    @Override
    public String toString() {
        return "Pagamento: " +
                "\nNome Cliente: " + getNomeCliente() + " | | " +
                "Valor de Pagamento: " + getValorPagamento() + " | | " +
                "Data do Pagamento: " + getDataPagamento() + " | | " +
                "Numero do Cartao: " + NumCartao;
    }


}