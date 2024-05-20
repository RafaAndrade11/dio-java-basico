public class SwitchCase {

    public static void main(String[] args) {
        /*
         * A estrutura switch compara o valor de cada caso com o da variável sequencialmente, e sempre que encontra
         * um valor correspondente, executa o código associado ao caso. Para evitar que as comparações continuem a ser
         * executadas após um caso correspondente ter sido encontrado, acrescentamos o comando break no final de cada
         * blocode códigos. O comando break, quando executado, encerra a execução da estrutura onde ele se encontra
         */

         //programa de exemplo de medida

         String sigla = "P";

        switch (sigla) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MÉDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:
            System.out.println("INDEFINIDO");
         } 
    }
    
}
