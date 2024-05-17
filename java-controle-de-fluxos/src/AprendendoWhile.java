import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class AprendendoWhile {
    public static void main(String[] args) {
        /*
         * O laço while ("enquanto") determina que enquanto uma condição for válida,
         * o bloco do código será executado. O laço while testa a condição antes de
         * executar o código, logo, caso a condição seja inválida no primeiro teste
         * o bloco nem será executado.
         * 
         * while (expressão booleana de validação)
         * {
         * 
         * // comando que será executado até que a expressão de validação torne-se falsa
         * 
         * }
         * 
         */

        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho.");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces.");

        /*
         * O laço do / while (faça / enquanto), assim como o laço while, considera que
         * enquanto
         * uma determinada condição for válida o bloco de código será executado.
         * Entretanto,
         * do / while testa a condição após executar o código, sendo assim, mesmo que a
         * condição
         * seja considerada inválida no primeiro teste o bloco será executado pelo menos
         * uma vez.
         * 
         * do
         * {
         * //comando que será executado até que a expressão de validação torne-se falsa
         * }
         * while (expressão booleana de validação);
         */

        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando");
        } while (tocando());

        System.out.println("Alô!");

    }

    // utilizando para gerar um valor aleatorio através do ThreadLocalRandom
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);

    }

    // utilizando este método para simular atendendo
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        // negando o ato de continuar tocando
        return !atendeu;
    }

}
