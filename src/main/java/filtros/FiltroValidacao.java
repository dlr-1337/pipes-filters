package filtros;

import excecoes.ExcecaoFluxoInterrompido;
import utilitarios.ManipuladorDeRequisicoes;

/**
 * Filtro responsavel por validar os dados do pedido antes do processamento.
 */
public class FiltroValidacao implements Filtro {

    @Override
    public void executar(ContextoFiltro contexto) {
        boolean falhaValidacaoSimulada = false;

        try {
            ManipuladorDeRequisicoes.processarRequisicao("Validacao", "Validando pedido");

            if (falhaValidacaoSimulada) {
                throw new ExcecaoFluxoInterrompido("A validacao falhou! Finalizando o fluxo.");
            } else {
                contexto.setValidado(true);
            }

        } catch (InterruptedException e) {
            System.out.print(e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}
