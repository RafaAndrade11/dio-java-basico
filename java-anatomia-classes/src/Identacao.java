public class Identacao {
    public static void main(String[] args) {
        int mediaFinal = 6;
        if (mediaFinal < 6) {
        System.out.println("REPROVADO");
        } else if (mediaFinal == 6) {
         System.out.println("PROVA MINERVA");
        } else {
        System.out.println("APROVADO");
        }

        /*
         * Podemos perceber que o código funciona normalmente conforme segue o
         * algoritmo.
         * Porém, para nível de visualização esse código está totalmente comlexo,
         * principalmente se não tivermos o total domínio da linguagem.
         * Vamos verificar o código com a identação.
         */

        int mediaFinal2 = 8;
        if (mediaFinal2 < 6) {
            System.out.println("REPROVADO");
        } else if (mediaFinal2 == 6) {
            System.out.println("PROVA MINERVA");
        } else {
            System.out.println("APROVADO");
        }

        /*
         * O algoritmo é o mesmo, porém a identação torna uma hierarquia de tabulações.
         * Temos uma classe, dentro da classe tem métodos, dentro de metodos temos fluxos e nesses fluxos alguma ação será executada.
         * Todo código aplicado também está identado.
         */
    }
}
