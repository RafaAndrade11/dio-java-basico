public class AprendendoADebugar {

    /*
     * Debugging é um processo que tem por objetivo reduzir ou encontrar bugs no seu sistema.
     * De uma forma geral, debugging não é uma tarefa fácil de ser executada, principalmente
     * em um sistema complexo. 
     * 
     * O java em si falicita muito o processo, pois fornece maneiras de sabermos se o código 
     * está errado, uma das coisas que facilita isso é a ferramenta de debug.
     * 
     */

    public static void main(String[] args) {
        /*
         * Adicionando nosso Breakpoint aqui e iniciarmos o programa por debug,
         * podemos perceber que após imprimir a primeira linha, o código sai do
         * método principal (main) e vai em busca do método a(). E assim o código
         * segue até encerrar o método main. Caso algum outro método estivesse 
         * errado, conseguiríamos perceber pelo debug.
         */
        
        System.out.println("Iniciando o processo de Debugging");
        a();
        System.out.println("Fim do processo de Debugging");
    }

    private static void a() {
        System.out.println("Iniciando o método a()...");
        b();
    }

    private static void b() {
        System.out.println("Iniciando o médoto b()...");
        c();   
    }

    private static void c() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        } 
    }
}
