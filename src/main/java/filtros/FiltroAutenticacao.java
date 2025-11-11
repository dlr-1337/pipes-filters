package filtros;

import excecoes.ExcecaoFluxoInterrompido;
import utilitarios.ManipuladorDeRequisicoes;

/**
 * Filtro de autenticacao responsavel por validar o usuario antes das demais etapas.
 */
public class FiltroAutenticacao implements Filtro {

    @Override
    public void executar(ContextoFiltro contexto) {

        boolean falhaAutenticacaoSimulada = false;

        try {
            ManipuladorDeRequisicoes.processarRequisicao("Autenticacao", "Autenticando usuario");

            if (falhaAutenticacaoSimulada) {
                throw new ExcecaoFluxoInterrompido("A autenticacao falhou! Finalizando o fluxo.");
            } else {
                contexto.setAutenticado(true);
            }

        } catch (InterruptedException e) {
            System.out.print(e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}

