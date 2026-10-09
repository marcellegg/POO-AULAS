package exercicio1;

public class Livro extends Produto {
    private String autor;
    private String editora;
    private String isbn;
    private int ano;

    public Livro(int codigo, double preco, String descricao,
                 String autor, String editora, String isbn, int ano) {
        super(codigo, preco, descricao);
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAno() {
        return ano;
    }
}
