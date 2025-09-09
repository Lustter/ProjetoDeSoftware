package entidades;

public class PagamentoBoleto extends Pagamento {
    //atributos

    private String codigoBarras;

    public PagamentoBoleto(String nomeCliente, double valorPagamento, String dataPagamento, String codigoBarras) {
        super(nomeCliente, valorPagamento, dataPagamento);
        this.codigoBarras = codigoBarras;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public String toString() {
        return "Pagamento: " +
                "\nNome do Cliente: " + getNomeCliente() + " | | " +
                "Valor de Pagamento: " + getValorPagamento() + " | | " +
                "Data do Pagamento: " + getDataPagamento() + " | | " +
                "Codigo de Barras: " + codigoBarras;
    }


}
