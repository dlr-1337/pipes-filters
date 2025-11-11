package excecoes;

/**
 * Excecao lancada quando alguma etapa quebra o fluxo dos filtros.
 */
public class ExcecaoFluxoInterrompido extends RuntimeException {

    public ExcecaoFluxoInterrompido(String mensagem) {
        super(mensagem);
    }
}
