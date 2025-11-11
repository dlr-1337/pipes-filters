package utilitarios;

import java.util.concurrent.TimeUnit;

/**
 * Classe utilitaria que simula o resultado visual de cada filtro.
 */
public class ManipuladorDeRequisicoes {

    public static void processarRequisicao(String nomeProcesso, String mensagem) throws InterruptedException {

        System.out.printf("\n\n/*------------------ FILTRO DE %s ----------------*/\n", nomeProcesso.toUpperCase());
        System.out.print(mensagem);
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println(".");
        System.out.println("/*----------------------------------------------------------*/");

    }
}
