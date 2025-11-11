package fluxos;

import excecoes.ExcecaoFluxoInterrompido;
import filtros.ContextoFiltro;
import filtros.Filtro;
import filtros.FiltroAutenticacao;
import filtros.FiltroProcessamento;
import filtros.FiltroValidacao;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa o fluxo de filtros (arquitetura tubos-e-filtros) e define a ordem das etapas.
 */
public class FluxoDeFiltros {
    private final List<Filtro> filtros;

    public FluxoDeFiltros() {
        filtros = new ArrayList<>();
        filtros.add(new FiltroAutenticacao());
        filtros.add(new FiltroValidacao());
        filtros.add(new FiltroProcessamento());
    }

    /**
     * Executa o fluxo sequencialmente tratando eventuais falhas de filtros.
     *
     * @param contexto contexto compartilhado entre os filtros
     */
    public void executarFluxo(ContextoFiltro contexto) {
        try {
            for (Filtro filtro : filtros) {
                filtro.executar(contexto);
            }
        } catch (ExcecaoFluxoInterrompido fluxoInterrompido) {
            System.out.println("\n\n");
            System.out.println(fluxoInterrompido.getMessage());
        }
    }
}
