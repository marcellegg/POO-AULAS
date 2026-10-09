package exercicio1;

public class Produto {
    private int codigo;
    private double preco;
    private String descricao;

    public Produto(int codigo, double preco, String descricao) {
        this.codigo = codigo;
        this.preco = preco;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }
}