package exercicio1;

public class CompactDisc extends Produto {
    private String nomeAlbum;
    private String artista;
    private String gravadora;

    public CompactDisc(int codigo, double preco, String descricao,
                       String nomeAlbum, String artista, String gravadora) {
        super(codigo, preco, descricao);
        this.nomeAlbum = nomeAlbum;
        this.artista = artista;
        this.gravadora = gravadora;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public String getArtista() {
        return artista;
    }

    public String getGravadora() {
        return gravadora;
    }
}