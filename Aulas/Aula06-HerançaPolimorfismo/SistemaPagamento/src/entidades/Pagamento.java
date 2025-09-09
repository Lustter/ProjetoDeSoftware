package entidades;

public abstract class Pagamento {
    private String nomeCliente;
    private double valorPagamento;
    private String dataPagamento;

    //construtores

    public Pagamento(String nomeCliente, double valorPagamento, String dataPagamento) {
        this.nomeCliente = nomeCliente;
        this.valorPagamento = valorPagamento;
        this.dataPagamento = dataPagamento;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }


    @Override
    public String toString() {
        return "Pagamento: " +
                "\nnomeCliente: " + nomeCliente +
                "\nvalorPagamento: " + valorPagamento +
                "\ndataPagamento: " + dataPagamento;
    }
}
