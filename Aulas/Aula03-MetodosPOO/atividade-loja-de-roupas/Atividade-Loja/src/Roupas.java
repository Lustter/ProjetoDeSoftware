public class Roupas {
    public String marca;
    public String tipo;
    public String tamanho;
    public int quantidade;
    public double valor;

    public Roupas(String marca, String tipo, String tamanho, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public void decrementarRoupa(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade = this.quantidade - quantidade;
        } else {
            System.out.println("Quantidade indisponivel ou quantidade inválida");
        }
    }

    public void incrementaRoupa(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = this.quantidade + quantidade;
        } else {
            System.out.println("Quantidade inválida");
        }
    }

    public double valorTotal() {
        double valorTotal = this.valor * this.quantidade;
        return valorTotal;
    }

    public String toString() {
        return "Peça:" +
                " marca: " + marca +
                "\n       tipo: " + tipo +
                "\n       quantidade: " + quantidade +
                "\n       valor: R$" + valor +
                "\n      valorTotal: " + valorTotal();
    }
}

