package filtros;

import excecoes.ExcecaoFluxoInterrompido;
import utilitarios.ManipuladorDeRequisicoes;

/**
 * Filtro final responsavel por concluir o processamento do pedido.
 */
public class FiltroProcessamento implements Filtro {

    @Override
    public void executar(ContextoFiltro contexto) {

        try {
            ManipuladorDeRequisicoes.processarRequisicao("Processamento", "Processando pedido");

        } catch (InterruptedException e) {
            System.out.print(e.getMessage());
            Thread.currentThread().interrupt();
        }

        if (contexto.isAutenticado() && contexto.isValidado()) {
            System.out.println("Pedido processado com sucesso!");
        } else {
            throw new ExcecaoFluxoInterrompido("Pedido invalido. Nao foi possivel processar.");
        }
    }
}
