public class Roupa {

    // --- Atributos ---
    private String marca;
    private String tipo;
    private String tamanho;
    private int quantidade;
    private double valor;

    // --- Construtor ---
    public Roupa(String marca, String tipo, String tamanho, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    // --- Metodos ---
    public double calcularValorTotalEstoque() {
        return this.quantidade * this.valor;
    }

    public void adicionarEstoque(int quantidadeParaAdicionar) {
        if (quantidadeParaAdicionar > 0) {
            this.quantidade += quantidadeParaAdicionar;
        }
    }

    public boolean removerEstoque(int quantidadeParaRemover) {
        if (quantidadeParaRemover > 0 && this.quantidade >= quantidadeParaRemover) {
            this.quantidade -= quantidadeParaRemover;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Roupa {" +
                "Marca='" + marca + '\'' +
                ", Tipo='" + tipo + '\'' +
                ", Tamanho='" + tamanho + '\'' +
                ", Quantidade=" + quantidade +
                ", Valor Unitario=R$" + String.format("%.2f", valor) +
                ", Valor Total em Estoque=R$" + String.format("%.2f", calcularValorTotalEstoque()) +
                '}';
    }
}