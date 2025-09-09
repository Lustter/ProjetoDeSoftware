package entidades;

public class PagamentoPix extends Pagamento {
    //atributos

    private String chavePix;

    public PagamentoPix(String nomeCliente, double valorPagamento, String dataPagamento, String chavePix) {
        super(nomeCliente, valorPagamento, dataPagamento);
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public String toString() {
        return "Pagamento: " +
                "\nNome Cliente: " + getNomeCliente() + " | | " +
                "Valor do Pagamento: " + getValorPagamento() + " | | " +
                "Data do Pagamento: " + getDataPagamento() + " | | " +
                "Chave de Pix: " + chavePix;
    }


}