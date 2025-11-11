package filtros;

import entidades.Pedido;

/**
 * Contexto compartilhado que mantem dados e resultados entre os filtros.
 */
public class ContextoFiltro {

    /**
     * Indica se o usuario esta autenticado no contexto atual.
     */
    private boolean autenticado;

    /**
     * Indica se o pedido esta validado no contexto atual.
     */
    private boolean validado;
    private Pedido pedido;

    public ContextoFiltro() {}

    /**
     * Metodos de acesso e atualizacao basicos.
     */

    public boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }

    public boolean isValidado() {
        return validado;
    }

    public void setValidado(boolean validado) {
        this.validado = validado;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}

