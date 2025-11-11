package filtros;

/**
 * Contrato generico para qualquer filtro do fluxo.
 */
public interface Filtro {
    void executar(ContextoFiltro contexto);
}
