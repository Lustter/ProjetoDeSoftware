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
                "\nNome do Cliente: " + getnomeCliente() + " | | " +
                "Valor de Pagamento: " + getvalorPagamento() + " | | " +
                "Data do Pagamento: " + getdataPagamento() + " | | " +
                "Codigo de Barras: " + codigoBarras;
    }


}
