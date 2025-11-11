import entidades.Pedido;
import filtros.ContextoFiltro;
import fluxos.FluxoDeFiltros;

/**
 * Classe principal responsavel por iniciar o fluxo tubos-e-filtros traduzido.
 */
public class Aplicacao {

    /**
     * Ponto de entrada que instancia o fluxo, prepara o contexto e dispara o processamento.
     */
    public static void main(String[] args) {
        FluxoDeFiltros fluxoDeFiltros = new FluxoDeFiltros();

        ContextoFiltro contexto = new ContextoFiltro();
        contexto.setPedido(new Pedido(
                "id_teste",
                "comprador_simulado",
                "produto_simulado"
        ));

        fluxoDeFiltros.executarFluxo(contexto);
    }
}
