package exercicio1;

public class TesteProduto {
    public static void main(String[] args) {
        Livro livro = new Livro(1, 59.90, "Livro de programação",
                "Robert C. Martin", "Alta Books", "978-8576082675", 2009);

        CompactDisc cd = new CompactDisc(2, 34.90, "CD de rock nacional",
                "Acústico MTV", "Titãs", "WEA");

        System.out.println("=== LIVRO ===");
        System.out.println("Código: " + livro.getCodigo());
        System.out.println("Preço: R$ " + livro.getPreco());
        System.out.println("Descrição: " + livro.getDescricao());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Editora: " + livro.getEditora());
        System.out.println("ISBN: " + livro.getIsbn());
        System.out.println("Ano: " + livro.getAno());

        System.out.println();

        System.out.println("=== COMPACT DISC ===");
        System.out.println("Código: " + cd.getCodigo());
        System.out.println("Preço: R$ " + cd.getPreco());
        System.out.println("Descrição: " + cd.getDescricao());
        System.out.println("Álbum: " + cd.getNomeAlbum());
        System.out.println("Artista: " + cd.getArtista());
        System.out.println("Gravadora: " + cd.getGravadora());
    }
}