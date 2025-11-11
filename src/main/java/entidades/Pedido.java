package entidades;

/**
 * Representa um pedido simples trafegado entre os filtros.
 */
public class Pedido {

    private String id;
    private String comprador;
    private String produto;

    public Pedido(String id, String comprador, String produto) {
        this.id = id;
        this.comprador = comprador;
        this.produto = produto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}
